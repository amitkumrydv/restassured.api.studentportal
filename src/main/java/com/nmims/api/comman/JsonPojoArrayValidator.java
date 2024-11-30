package com.nmims.api.comman;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.model.FeatureViseAccessModel;
import com.nmims.api.model.RegDataModel;
import com.nmims.api.model.StudentModel;

public class JsonPojoArrayValidator {

	private static Logger logger = LoggerFactory.getLogger(JsonPojoArrayValidator.class);
	private final ObjectMapper objectMapper;

	public JsonPojoArrayValidator(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	/**
	 * Maps a POJO field to its JSON property name, handles annotations
	 * like @JsonProperty.
	 */
	private String getJsonPropertyName(Field field) {
		JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
		return (jsonProperty != null) ? jsonProperty.value() : field.getName();
	}

	public <T> void validateJsonArrayAgainstPojo(String responseBodyData, Class<T> pojoClass) {

		logger.info("Starting validation of JSON array against POJO: {}", pojoClass.getSimpleName());

		try {
			// Parse JSON array into a List of Maps
			List<Map<String, Object>> jsonArray = objectMapper.readValue(responseBodyData, List.class);

			Assert.assertNotNull(jsonArray, "JSON array is null or empty in the response.");

			Field[] pojoFields = pojoClass.getDeclaredFields();
			Set<String> pojoFieldNames = Arrays.stream(pojoFields).map(this::getJsonPropertyName)
					.collect(Collectors.toSet());

			Set<String> jsonFieldsEncountered = new HashSet<>();

			for (Map<String, Object> listItem : jsonArray) {
				for (Map.Entry<String, Object> entry : listItem.entrySet()) {
					String jsonfieldName = entry.getKey();
					Object jsonFieldValue = entry.getValue();
					jsonFieldsEncountered.add(jsonfieldName);

					System.out.println("jsonFieldsEncountered--- " + jsonFieldsEncountered);

					if (jsonFieldValue == null) {
						logger.warn("Field {} in JSON object is null.", jsonfieldName);
						continue;
					}

					if (jsonFieldValue == "") {
						logger.warn("Field {} in JSON object is empty.", jsonfieldName);
						continue;
					}

					Class<?> jsonFieldType = jsonFieldValue.getClass();

					if (pojoFieldNames.contains(jsonfieldName)) {
						try {
							// Validate Type
							Field pojoField = pojoClass.getDeclaredField(
									Arrays.stream(pojoFields).filter(f -> getJsonPropertyName(f).equals(jsonfieldName))
											.findFirst().map(Field::getName).orElse(jsonfieldName));
							Class<?> pojoFieldType = pojoField.getType();

							if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
								logger.error("Type mismatch for field: {}. JSON Type: {}, POJO Type: {}", jsonfieldName,
										jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
								Assert.fail("Type mismatch for field: " + jsonfieldName);
							}
						} catch (NoSuchFieldException e) {
							Assert.fail("Field:{} not found in POJO class " + jsonfieldName);
						}
					} else {
						logger.error("Field {} is not present in POJO: {}", jsonfieldName, pojoClass.getSimpleName());
						Assert.fail("Field not present in POJO: " + jsonfieldName);
					}
				}
			}

			for (String pojoFieldName : pojoFieldNames) {
				if (!jsonFieldsEncountered.contains(pojoFieldName)) {
					logger.warn("Field {} is present in POJO but missing in the JSON response.", pojoFieldName);
					// Assert.fail("Field is present in POJO but missing in the JSON response." +
					// pojoFieldName);
				}
			}

			logger.info("Validation completed for POJO: {}", pojoClass.getSimpleName());
		} catch (Exception e) {
			logger.error("Error during validation: {}", e.getMessage());
			Assert.fail("Error during validation:", e);
		}
	}

	
	
}

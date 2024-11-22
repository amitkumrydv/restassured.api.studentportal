package com.api.comman;

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

import com.api.pojoClass.FeatureViseAccessPojo;
import com.api.pojoClass.RegDataPojo;
import com.api.pojoClass.StudentPojo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPojoArrayValidator {

	private static Logger logger = LoggerFactory.getLogger(JsonPojoArrayValidator.class);
	private final ObjectMapper objectMapper;

	public JsonPojoArrayValidator(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	
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
					Assert.fail("Field is present in POJO but missing in the JSON response." + pojoFieldName);
				}
			}

			logger.info("Validation completed for POJO: {}", pojoClass.getSimpleName());
		} catch (Exception e) {
			logger.error("Error during validation: {}", e.getMessage());
			Assert.fail("Error during validation:", e);
		}
	}


	
	
	public <T> void validateJsonWithPojo(String responseBodyData, Class<T> authenticationPojo) {
	    try {
	        // Extract all fields in the POJO class and map them to their JSON property names
	        Field[] pojoFields = authenticationPojo.getDeclaredFields();
	        Set<String> pojoFieldNames = Arrays.stream(pojoFields)
	                                           .map(this::getJsonPropertyName)
	                                           .collect(Collectors.toSet());

	        // Convert the JSON string to a Map for comparison
	        Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);

	        // Track JSON fields encountered for reverse validation
	        Set<String> jsonFieldsEncountered = new HashSet<>();

	        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
	            String jsonFieldName = entry.getKey();
	            Object jsonFieldValue = entry.getValue();
	            jsonFieldsEncountered.add(jsonFieldName);

	            logger.info("Processing JSON field: {}", jsonFieldName);

	            if (jsonFieldValue == null) {
	                logger.warn("Field {} in JSON object is null.", jsonFieldName);
	                continue;
	            }

	            if (jsonFieldValue.equals("")) {
	                logger.warn("Field {} in JSON object is empty.", jsonFieldName);
	                continue;
	            }

	            // Validate if the JSON field exists in the POJO
	            if (!pojoFieldNames.contains(jsonFieldName)) {
	                logger.error("JSON field '{}' is not present in POJO: {}", jsonFieldName, authenticationPojo.getSimpleName());
	                Assert.fail("JSON field '" + jsonFieldName + "' is not present in the POJO.");
	            }

	            // Retrieve and validate the field type
	            try {
	                Field pojoField = Arrays.stream(pojoFields)
	                                        .filter(f -> getJsonPropertyName(f).equals(jsonFieldName))
	                                        .findFirst()
	                                        .orElseThrow(() -> new NoSuchFieldException("Field not found: " + jsonFieldName));

	                Class<?> pojoFieldType = pojoField.getType();

	                // Add logic for nested POJOs
	                if (pojoFieldType.equals(StudentPojo.class)) {
	                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), StudentPojo.class);
	                } else if (pojoFieldType.equals(RegDataPojo.class)) {
	                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), RegDataPojo.class);
	                } else if (pojoFieldType.equals(FeatureViseAccessPojo.class)) {
	                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), FeatureViseAccessPojo.class);
	                
	                }
	                else {
	                    // Standard type validation
	                    Class<?> jsonFieldType = jsonFieldValue.getClass();
	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
	                        logger.error("Type mismatch for field '{}': JSON Type: {}, POJO Type: {}",
	                                jsonFieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
	                        Assert.fail("Type mismatch for field '" + jsonFieldName + "'.");
	                    }
	                }
	            } catch (NoSuchFieldException e) {
	                logger.error("Field '{}' not found in POJO class: {}", jsonFieldName, authenticationPojo.getSimpleName());
	                Assert.fail("Field '" + jsonFieldName + "' not found in POJO class.");
	            }
	        }

	        // Verify if any POJO fields are missing in the JSON response
	        for (String pojoFieldName : pojoFieldNames) {
	            if (!jsonFieldsEncountered.contains(pojoFieldName)) {
	                logger.warn("Field '{}' is present in POJO but missing in the JSON response.", pojoFieldName);
	                Assert.fail("Field '" + pojoFieldName + "' is present in POJO but missing in the JSON response.");
	            }
	        }

	        logger.info("Validation completed successfully for POJO: {}", authenticationPojo.getSimpleName());
	    } catch (Exception e) {
	        logger.error("Error during validation: {}", e.getMessage(), e);
	        Assert.fail("Error during validation: " + e.getMessage());
	    }
	}

	
	
	
	
	
	
	
	
}
	 


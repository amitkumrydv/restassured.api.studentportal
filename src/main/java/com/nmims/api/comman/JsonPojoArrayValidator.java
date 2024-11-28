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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.model.FeatureViseAccessModel;
import com.nmims.api.model.RegDataModel;
import com.nmims.api.model.StudentModel;

import io.restassured.response.ResponseBody;

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

	
	public <T> void validateAuthenticateJsonWithPojo(String responseBodyData, Class<T> authenticationPojo) {
	    try {
	        // Step 1: Extract all fields from the POJO and map them to their JSON property names
	        Field[] pojoFields = authenticationPojo.getDeclaredFields();
	        Set<String> pojoFieldNames = Arrays.stream(pojoFields)
	                                           .map(this::getJsonPropertyName)
	                                           .collect(Collectors.toSet());

	        // Step 2: Convert the JSON response to a Map for comparison
	        Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);

	        // Set to track encountered JSON fields for reverse validation
	        Set<String> jsonFieldsEncountered = new HashSet<>();

	        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
	            String jsonFieldName = entry.getKey();
	            Object jsonFieldValue = entry.getValue();
	            jsonFieldsEncountered.add(jsonFieldName);
	           

	            // Skip null or empty JSON field values
	            if (jsonFieldValue == null) {
	                logger.warn("Field '{}' in JSON object is null.", jsonFieldName);
	                continue;
	            }
	            if (jsonFieldValue.equals("")) {
	                logger.warn("Field '{}' in JSON object is empty.", jsonFieldName);
	                continue;
	            }

	            // Step 3: Validate if the JSON field exists in the POJO
	            if (!pojoFieldNames.contains(jsonFieldName)) {
	                logger.error("JSON field '{}' is not present in POJO: {}", jsonFieldName, authenticationPojo.getSimpleName());
	                Assert.fail("JSON field '" + jsonFieldName + "' is not present in the POJO.");
	            }

	            // Step 4: Validate field type compatibility
	            try {
	                Field pojoField = Arrays.stream(pojoFields)
	                                        .filter(f -> getJsonPropertyName(f).equals(jsonFieldName))
	                                        .findFirst()
	                                        .orElseThrow(() -> new NoSuchFieldException("Field not found: " + jsonFieldName));

	                Class<?> pojoFieldType = pojoField.getType();

	                // Handle nested POJO fields using recursive deserialization
	                if (isNestedPojo(pojoFieldType)) {
	                	  
	                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), pojoFieldType);
	                    
	                    	// Get the program cleared value
	        				if ("student".equals(jsonFieldName)) {
	        					processStudentNode(jsonFieldValue);
	        				}
	                    
	                } else {
	                    // Validate standard type compatibility
	                    Class<?> jsonFieldType = jsonFieldValue.getClass();
	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
	                        logger.error("Type mismatch for field '{}': JSON Type: {}, POJO Type: {}",
	                                jsonFieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
	                        Assert.fail("Type mismatch for field '" + jsonFieldName + "'.");
	                    }
	                }
	            } catch (NoSuchFieldException e) {
	                logger.error("Field '{}' not found in POJO class: {}", jsonFieldName, authenticationPojo.getSimpleName(), e);
	                Assert.fail("Field '" + jsonFieldName + "' not found in POJO class.");
	            } catch (Exception e) {
	                logger.error("Error processing field '{}': {}", jsonFieldName, e.getMessage(), e);
	                Assert.fail("Error processing field '" + jsonFieldName + "': " + e.getMessage());
	            }
	        }

	        // Step 5: Verify if any POJO fields are missing in the JSON response
	        for (String pojoFieldName : pojoFieldNames) {
	            if (!jsonFieldsEncountered.contains(pojoFieldName)) {
	                logger.warn("Field '{}' is present in POJO but missing in the JSON response.", pojoFieldName);
	                Assert.fail("Field '" + pojoFieldName + "' is present in POJO but missing in the JSON response.");
	            }
	        }

	        logger.info("Validation completed successfully for POJO: {}", authenticationPojo.getSimpleName());
	    } catch (Exception e) {
	        // Handle unexpected exceptions and log the error details
	        logger.error("Error during JSON validation: {}", e.getMessage(), e);
	        Assert.fail("Error during JSON validation: " + e.getMessage());
	    }
	}

	/**
	 * Checks if the given class represents a nested POJO that requires special handling.
	 */
	private boolean isNestedPojo(Class<?> pojoFieldType) {
	    return pojoFieldType.equals(StudentModel.class) || 
	           pojoFieldType.equals(RegDataModel.class) || 
	           pojoFieldType.equals(FeatureViseAccessModel.class);
	}

	/**
	 * Processes the 'student' node in the JSON and validates specific fields like
	 * 'programCleared'.
	 */
	private void processStudentNode(Object studentNode) {
		try {
			// Deserialize the 'student' node into a map
			Map<String, Object> studentMap = objectMapper.convertValue(studentNode, Map.class);

			// Extract and validate 'programCleared'
			if (studentMap.containsKey("programCleared")) {
				Object programCleared = studentMap.get("programCleared");
				if (programCleared == null || programCleared.toString().isEmpty()) {
					logger.warn("'programCleared' field is null or empty in 'student' node.");
					Assert.fail("'programCleared' field is null or empty.");
				} else {
					logger.info("'programCleared' field value: {}", programCleared);
				}
			} else {
				logger.warn("'programCleared' field is missing in 'student' node.");
				Assert.fail("'programCleared' field is missing in 'student' node.");
			}
		} catch (Exception e) {
			logger.error("Error processing 'student' node: {}", e.getMessage(), e);
			Assert.fail("Error processing 'student' node: " + e.getMessage());
		}
	}

}

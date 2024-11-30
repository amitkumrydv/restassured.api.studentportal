package com.nmims.api.response.mapper;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
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
import com.nmims.api.model.AuthenticationModel;
import com.nmims.api.model.FeatureViseAccessModel;
import com.nmims.api.model.RegDataModel;
import com.nmims.api.model.StudentModel;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class AuthenticateMapper {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticateMapper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	public static StudentModel studentModel = new StudentModel();
	public static AuthenticationModel authenticationModel = new AuthenticationModel();

	/**
	 * Maps a POJO field to its JSON property name, handles annotations
	 * like @JsonProperty.
	 */
	private String getJsonPropertyName(Field field) {
		JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
		return (jsonProperty != null) ? jsonProperty.value() : field.getName();
	}

	public void authenticateResponseValidation(Response response) {

		logger.info("Start the authenticate API Respons validation...");

		ResponseBody responsebody = response.body();
		String responseBodyData = responsebody.asString();

		validateAuthenticateJsonWithPojo(responseBodyData, AuthenticationModel.class);

	}

//	public <T> void validateAuthenticateJsonWithPojo(String responseBodyData, Class<T> authenticationPojo) {
//	    try {
//	        // Step 1: Extract all fields from the POJO and map them to their JSON property names
//	        Field[] pojoFields = authenticationPojo.getDeclaredFields();
//	        Set<String> pojoFieldNames = Arrays.stream(pojoFields)
//	                                           .map(this::getJsonPropertyName)
//	                                           .collect(Collectors.toSet());
//
//	        // Step 2: Convert the JSON response to a Map for comparison
//	        Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);
//
//	        // Set to track encountered JSON fields for reverse validation
//	        Set<String> jsonFieldsEncountered = new HashSet<>();
//
//	        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
//	            String jsonFieldName = entry.getKey();
//	            Object jsonFieldValue = entry.getValue();
//	            jsonFieldsEncountered.add(jsonFieldName);
//	           
//
//	            // Skip null or empty JSON field values
//	            if (jsonFieldValue == null) {
//	                logger.warn("Field '{}' in JSON object is null.", jsonFieldName);
//	                continue;
//	            }
//	            if (jsonFieldValue.equals("")) {
//	                logger.warn("Field '{}' in JSON object is empty.", jsonFieldName);
//	                continue;
//	            }
//
//	            // Step 3: Validate if the JSON field exists in the POJO
//	            if (!pojoFieldNames.contains(jsonFieldName)) {
//	                logger.error("JSON field '{}' is not present in POJO: {}", jsonFieldName, authenticationPojo.getSimpleName());
//	                Assert.fail("JSON field '" + jsonFieldName + "' is not present in the POJO.");
//	            }
//
//	            // Step 4: Validate field type compatibility
//	            try {
//	                Field pojoField = Arrays.stream(pojoFields)
//	                                        .filter(f -> getJsonPropertyName(f).equals(jsonFieldName))
//	                                        .findFirst()
//	                                        .orElseThrow(() -> new NoSuchFieldException("Field not found: " + jsonFieldName));
//
//	                Class<?> pojoFieldType = pojoField.getType();
//
//	                // Handle nested POJO fields using recursive deserialization
//	                if (isNestedPojo(pojoFieldType)) {
//	                	  
//	                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), pojoFieldType);
//	                    
//	                    	// Get the program cleared value
//	        				if ("student".equals(jsonFieldName)) {
//	        					processStudentNode(jsonFieldValue);
//	        				}
//	                    
//	                } else {
//	                    // Validate standard type compatibility
//	                    Class<?> jsonFieldType = jsonFieldValue.getClass();
//	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
//	                        logger.error("Type mismatch for field '{}': JSON Type: {}, POJO Type: {}",
//	                                jsonFieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
//	                        Assert.fail("Type mismatch for field '" + jsonFieldName + "'.");
//	                    }
//	                }
//	            } catch (NoSuchFieldException e) {
//	                logger.error("Field '{}' not found in POJO class: {}", jsonFieldName, authenticationPojo.getSimpleName(), e);
//	                Assert.fail("Field '" + jsonFieldName + "' not found in POJO class.");
//	            } catch (Exception e) {
//	                logger.error("Error processing field '{}': {}", jsonFieldName, e.getMessage(), e);
//	                Assert.fail("Error processing field '" + jsonFieldName + "': " + e.getMessage());
//	            }
//	        }
//
//	        // Step 5: Verify if any POJO fields are missing in the JSON response
//	        for (String pojoFieldName : pojoFieldNames) {
//	            if (!jsonFieldsEncountered.contains(pojoFieldName)) {
//	                logger.warn("Field '{}' is present in POJO but missing in the JSON response.", pojoFieldName);
//	                Assert.fail("Field '" + pojoFieldName + "' is present in POJO but missing in the JSON response.");
//	            }
//	        }
//
//	        logger.info("Validation completed successfully for POJO: {}", authenticationPojo.getSimpleName());
//	    } catch (Exception e) {
//	        // Handle unexpected exceptions and log the error details
//	        logger.error("Error during JSON validation: {}", e.getMessage(), e);
//	        Assert.fail("Error during JSON validation: " + e.getMessage());
//	    }
//	}
//
//	/**
//	 * Checks if the given class represents a nested POJO that requires special handling.
//	 */
//	private boolean isNestedPojo(Class<?> pojoFieldType) {
//	    return pojoFieldType.equals(StudentModel.class) || 
//	           pojoFieldType.equals(RegDataModel.class) || 
//	           pojoFieldType.equals(FeatureViseAccessModel.class);
//	}
//
//	/**
//	 * Processes the 'student' node in the JSON and validates specific fields like
//	 * 'programCleared'.
//	 */
//	private void processStudentNode(Object studentNode) {
//		try {
//			// Deserialize the 'student' node into a map
//			Map<String, String> studentMap = objectMapper.convertValue(studentNode, Map.class);
//
//			// Extract and validate 'programCleared'
//			if (studentMap.containsKey("programCleared")) {
//				
//				String programCleared = studentMap.get("programCleared");
//				if (programCleared == null || programCleared.toString().isEmpty()) {
//					
//					logger.warn("'programCleared' field is null or empty in 'student' node.");
//					Assert.fail("'programCleared' field is null or empty.");
//					
//				} else if (programCleared.equalsIgnoreCase("N")){
//					logger.info("The student Program Status is: ", programCleared);		
//					studentModel.setProgramCleared(programCleared);
//				}
//				else if (programCleared.equalsIgnoreCase("Y")) {
//					
//					logger.info("The student Program Status is: ", programCleared);	
//					studentModel.setProgramCleared(programCleared);
//					
//				}
//			} else {
//				logger.warn("'programCleared' field is missing in 'student' node.");
//				Assert.fail("'programCleared' field is missing in 'student' node.");
//			}
//		} catch (Exception e) {
//			logger.error("Error processing 'student' node: {}", e.getMessage(), e);
//			Assert.fail("Error processing 'student' node: " + e.getMessage());
//		}
//	}
	
	
	
	
	

	public <T> void validateAuthenticateJsonWithPojo(String responseBodyData, Class<T> authenticationPojo) {
		try {
			// Extract POJO fields and their JSON property names
			Set<String> pojoFieldNames = Arrays.stream(authenticationPojo.getDeclaredFields())
					.map(this::getJsonPropertyName).collect(Collectors.toSet());

			// Parse JSON response into a Map
			Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);

			// Validate JSON against POJO
			validateJsonFields(jsonMap, pojoFieldNames, authenticationPojo);

			// Ensure all POJO fields exist in the JSON
			validatePojoFields(jsonMap.keySet(), pojoFieldNames, authenticationPojo);
			
			//Set the response data in POJO
			getResponseData(responseBodyData);

			logger.info("Validation completed successfully for POJO: {}", authenticationPojo.getSimpleName());
		} catch (Exception e) {
			logger.error("Error during JSON validation: {}", e.getMessage(), e);
			Assert.fail("Error during JSON validation: " + e.getMessage());
		}
	}

	private <T> void validateJsonFields(Map<String, Object> jsonMap, Set<String> pojoFieldNames,
			Class<T> authenticationPojo) {
		for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
			String jsonFieldName = entry.getKey();
			Object jsonFieldValue = entry.getValue();

			if (isNullOrEmpty(jsonFieldValue)) {
				logger.warn("Field '{}' in JSON object is null or empty.", jsonFieldName);
				continue;
			}

			if (!pojoFieldNames.contains(jsonFieldName)) {
				logger.error("JSON field '{}' is not present in POJO: {}", jsonFieldName,
						authenticationPojo.getSimpleName());
				Assert.fail("JSON field '" + jsonFieldName + "' is not present in the POJO.");
			}

			validateFieldCompatibility(authenticationPojo, jsonFieldName, jsonFieldValue);
		}
	}

	private void validateFieldCompatibility(Class<?> authenticationPojo, String jsonFieldName, Object jsonFieldValue) {
		try {
			Field pojoField = Arrays.stream(authenticationPojo.getDeclaredFields())
					.filter(f -> getJsonPropertyName(f).equals(jsonFieldName)).findFirst()
					.orElseThrow(() -> new NoSuchFieldException("Field not found: " + jsonFieldName));

			Class<?> pojoFieldType = pojoField.getType();

			if (isNestedPojo(pojoFieldType)) {
				objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), pojoFieldType);
				if ("student".equals(jsonFieldName)) {
					processStudentNode(jsonFieldValue);
				}
			} else if (!pojoFieldType.isAssignableFrom(jsonFieldValue.getClass())) {
				logger.error("Type mismatch for field '{}': JSON Type: {}, POJO Type: {}", jsonFieldName,
						jsonFieldValue.getClass().getSimpleName(), pojoFieldType.getSimpleName());
				Assert.fail("Type mismatch for field '" + jsonFieldName + "'.");
			}
		} catch (Exception e) {
			logger.error("Error processing field '{}': {}", jsonFieldName, e.getMessage(), e);
			Assert.fail("Error processing field '" + jsonFieldName + "': " + e.getMessage());
		}
	}

	private <T> void validatePojoFields(Set<String> jsonFieldNames, Set<String> pojoFieldNames,
			Class<T> authenticationPojo) {
		for (String pojoFieldName : pojoFieldNames) {
			if (!jsonFieldNames.contains(pojoFieldName)) {
				logger.warn("Field '{}' is present in POJO but missing in the JSON response.", pojoFieldName);
				Assert.fail("Field '" + pojoFieldName + "' is present in POJO but missing in the JSON response.");
			}
		}
	}

	private boolean isNullOrEmpty(Object value) {
		return value == null || (value instanceof String && ((String) value).isEmpty());
	}

	private boolean isNestedPojo(Class<?> pojoFieldType) {
		return Set.of(StudentModel.class, RegDataModel.class, FeatureViseAccessModel.class).contains(pojoFieldType);
	}

	private void processStudentNode(Object studentNode) {
		try {
			Map<String, String> studentMap = objectMapper.convertValue(studentNode, Map.class);
			String programCleared = studentMap.get("programCleared");

			if (isNullOrEmpty(programCleared)) {
				logger.warn("'programCleared' field is null or empty in 'student' node.");
				Assert.fail("'programCleared' field is null or empty.");
			} else if (programCleared.equalsIgnoreCase("Y") || programCleared.equalsIgnoreCase("N")) {
				logger.info("The student Program Status is: {}", programCleared);
				studentModel.setProgramCleared(programCleared);
			} else {

				logger.error("Getting wrong program cleared value: {} ", programCleared);
				Assert.fail("Getting wrong program cleared value: " + programCleared);
			}

		} catch (Exception e) {
			logger.error("Error processing 'student' node: {}", e.getMessage(), e);
			Assert.fail("Error processing 'student' node: " + e.getMessage());
		}
	}

	// Set the response data
	public void getResponseData(String responseBodyData) throws JsonMappingException {
		try {
			// Parse JSON response into a Map
			Map<String, String> jsonMap = objectMapper.readValue(responseBodyData, Map.class);

			// Extract and set validityEndDate field
			if (jsonMap.containsKey("validityEndDate")) {
				String validityEndDate = jsonMap.get("validityEndDate");
				authenticationModel.setValidityEndDate(validityEndDate);
				logger.info("validityEndDate successfully set: {}", validityEndDate);
			} else {
				logger.warn("validityEndDate field not found in JSON response.");
			}
		} catch (JsonProcessingException e) {
			logger.error("Error processing response data: {}", e.getMessage(), e);
			throw new RuntimeException("Failed to process response data", e); // Throw a runtime exception for API
																				// handling
		}
	}

}

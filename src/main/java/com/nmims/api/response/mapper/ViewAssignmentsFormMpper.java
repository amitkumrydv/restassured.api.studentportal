package com.nmims.api.response.mapper;

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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nmims.api.model.CurrentSemAssignmentFilesListModel;
import com.nmims.api.model.FailSubjectsAssignmentFilesListModel;
import com.nmims.api.model.ViewAssignmentsFormModel;

import io.qameta.allure.Step;



public class ViewAssignmentsFormMpper {
	
	
	 static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormMpper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	private String getJsonPropertyName(Field field) {
	    JsonProperty annotation = field.getAnnotation(JsonProperty.class);
	    return (annotation != null) ? annotation.value() : field.getName();
	}
	
	
	@Step("Validate JSON response field name or type with POJO class")
	public void validateViewAssignmentsFormResponse(String responseBodyData) throws JsonMappingException, JsonProcessingException {
	    logger.info("Starting validation of current semester assignments...");

	    try {
	        // Deserialize JSON response into a Map
	        Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);
	        Assert.assertNotNull(jsonMap, "JSON response body is null or could not be parsed.");

	        // Get declared fields in the POJO and extract their JSON property names
	        Field[] pojoFields = ViewAssignmentsFormModel.class.getDeclaredFields();
	        Set<String> pojoFieldNames = Arrays.stream(pojoFields)
	                .map(this::getJsonPropertyName)
	                .collect(Collectors.toSet());

	        // Track fields found in JSON
	        Set<String> jsonFieldsEncountered = new HashSet<>();

	        // Iterate through JSON fields
	        for (Map.Entry<String, Object> jsonFieldEntry : jsonMap.entrySet()) {
	            String fieldName = jsonFieldEntry.getKey();
	            Object jsonFieldValue = jsonFieldEntry.getValue();
	            jsonFieldsEncountered.add(fieldName);

	            // Skip null, empty, or invalid values
	            if (!isValidJsonField(jsonFieldValue)) {
	                logger.warn("Field '{}' has an invalid value in the JSON response.", fieldName);
	                continue;
	            }

	            // Validate the field against the POJO
	            validateFieldAgainstPojo(fieldName, jsonFieldValue, pojoFields, pojoFieldNames);
	        }

	        // Validate fields in the POJO that are not encountered in JSON
	        validateMissingPojoFields(pojoFieldNames, jsonFieldsEncountered);

	    } catch (JsonProcessingException e) {
	        logger.error("Error parsing JSON response: {}", e.getMessage());
	        throw e;
	    } catch (Exception e) {
	        logger.error("Unexpected error during validation: {}", e.getMessage());
	        throw new RuntimeException("Validation failed due to an unexpected error.", e);
	    }

	    logger.info("Validation of assignment files list completed successfully.");
	}

	/**
	 * Helper method to check if a JSON field value is valid.
	 */
	private boolean isValidJsonField(Object jsonFieldValue) {
	    if (jsonFieldValue == null) {
	    	
	    	logger.warn("Field '{}' has an null  value in the JSON response.", jsonFieldValue);
	        return false;
	    
	}    else if ("".equals(jsonFieldValue)) {
	    	
	    	logger.warn("Field '{}' has an null  value in the JSON response.", jsonFieldValue);
	        return false;
	    }
	    if (jsonFieldValue instanceof List && ((List<?>) jsonFieldValue).isEmpty()) {
	        return false;
	    }
	    return true;
	}

	/**
	 * Validates a field from the JSON response against the corresponding field in the POJO.
	 */
	private void validateFieldAgainstPojo(String fieldName, Object jsonFieldValue, Field[] pojoFields, Set<String> pojoFieldNames)
			       throws JsonProcessingException {
		
		
	    if (!pojoFieldNames.contains(fieldName)) {
	        logger.warn("Field '{}' is not present in the POJO definition.", fieldName);
	        Assert.fail("Field is not present in POJO: " + fieldName);
	        return;
	    }

	    try {
	        // Retrieve the corresponding POJO field
	        Field pojoField = Arrays.stream(pojoFields)
	                .filter(f -> getJsonPropertyName(f).equals(fieldName))
	                .findFirst()
	                .orElseThrow(() -> new NoSuchFieldException("Field not found in POJO: " + fieldName));

	        Class<?> pojoFieldType = pojoField.getType();

	        // Handle nested POJO list validation
	        if (List.class.isAssignableFrom(pojoFieldType)) {
	            validateNestedPojoList(jsonFieldValue, pojoFieldType);
	        } else {
	            validatePrimitiveType(jsonFieldValue, pojoFieldType, fieldName);
	        }

	    } catch (NoSuchFieldException e) {
	        logger.error("Field '{}' unexpectedly not found in POJO. Possible error in POJO definition.", fieldName);
	        Assert.fail("Unexpected field mismatch: " + fieldName);
	    }
	}

	/**
	 * Validates a nested POJO list by deserializing the JSON value into the appropriate type.
	 */
	private void validateNestedPojoList(Object jsonFieldValue, Class<?> pojoFieldType) throws JsonProcessingException {
	    if (pojoFieldType.equals(CurrentSemAssignmentFilesListModel.class)) {
	        List<CurrentSemAssignmentFilesListModel> list = objectMapper.readValue(
	                objectMapper.writeValueAsString(jsonFieldValue),
	                new TypeReference<List<CurrentSemAssignmentFilesListModel>>() {});
	        logger.info("Validated list of CurrentSemAssignmentFilesListModel: {}", list);
	    } else if (pojoFieldType.equals(FailSubjectsAssignmentFilesListModel.class)) {
	        List<FailSubjectsAssignmentFilesListModel> list = objectMapper.readValue(
	                objectMapper.writeValueAsString(jsonFieldValue),
	                new TypeReference<List<FailSubjectsAssignmentFilesListModel>>() {});
	        logger.info("Validated list of FailSubjectsAssignmentFilesListModel: {}", list);
	    } else {
	        logger.warn("Unexpected nested POJO type: {}", pojoFieldType.getName());
	    }
	}

	/**
	 * Validates a primitive or simple object type against the JSON field value type.
	 */
	private void validatePrimitiveType(Object jsonFieldValue, Class<?> pojoFieldType, String fieldName) {
	    if (!pojoFieldType.isAssignableFrom(jsonFieldValue.getClass())) {
	        logger.warn("Type mismatch for field '{}'. JSON Type: {}, POJO Type: {}",
	                fieldName, jsonFieldValue.getClass().getSimpleName(), pojoFieldType.getSimpleName());
	        Assert.fail("Type mismatch for field: " + fieldName);
	    }
	}

	/**
	 * Validates fields in the POJO that are not encountered in the JSON response.
	 */
	private void validateMissingPojoFields(Set<String> pojoFieldNames, Set<String> jsonFieldsEncountered) {
	    for (String pojoFieldName : pojoFieldNames) {
	        if (!jsonFieldsEncountered.contains(pojoFieldName)) {
	            logger.warn("Field '{}' is present in the POJO but missing in the JSON response.", pojoFieldName);
	            Assert.fail("Field is present in the POJO but missing in the JSON response: " + pojoFieldName);
	        }
	    }
	}

	
	
	

}

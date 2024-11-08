package com.api.response.mapper;

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

import com.api.pojoClass.ViewAssignmentsFormPojo;
import com.api.response.validation.ViewAssignmentsFormResponseValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ViewAssignmentsFormMpper implements ViewAssignmentsFormResponseValidation{
	
	
	 static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormMpper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	
	public void ViewAssignmentsFormMapperResponsValidation(String responseBodyData) 
	        throws JsonMappingException, JsonProcessingException {

	    // Log the start of validation
	    logger.info("Starting validation of current semester assignments...");

	    // Parse JSON response to a Map
	    Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);
	    List<Map<String, Object>> assignmentFilesList = 
	            (List<Map<String, Object>>) jsonMap.get("currentSemAssignmentFilesList");

	    // Check if assignmentFilesList is missing or null
	    Assert.assertNotNull(assignmentFilesList + "Assignment files list is null or missing in the response.");

	    // Retrieve POJO fields for comparison
	    Field[] pojoFields = ViewAssignmentsFormPojo.class.getDeclaredFields();
	    Set<String> pojoFieldNames = Arrays.stream(pojoFields)
	                                        .map(Field::getName)
	                                        .collect(Collectors.toSet());

	    // Track JSON fields encountered
	    Set<String> jsonFieldsEncountered = new HashSet<>();

	    // Validate each item in assignmentFilesList
	    for (Map<String, Object> listItem : assignmentFilesList) {
	        for (Map.Entry<String, Object> entry : listItem.entrySet()) {
	            String fieldName = entry.getKey();
	            Object jsonFieldValue = entry.getValue();

	            // Add field to the encountered set
	            jsonFieldsEncountered.add(fieldName);

	            if (jsonFieldValue == null) {
	             //   logger.info("Skipping null field: {}", fieldName);
	                continue;
	            }

	            Class<?> jsonFieldType = jsonFieldValue.getClass();

	            // Check if the field exists in the POJO
	            if (pojoFieldNames.contains(fieldName)) {
	                try {
	                    Field pojoField = ViewAssignmentsFormPojo.class.getDeclaredField(fieldName);
	                    Class<?> pojoFieldType = pojoField.getType();
	                    
	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
	                        logger.warn("Type mismatch for field: {}. JSON Type: {}, POJO Type: {}", 
	                                    fieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
	                        Assert.fail("Type mismatch for field: " + fieldName);
	                    } else {
	                        logger.info("Field {} matches type in POJO.", fieldName);
	                    }
	                } catch (NoSuchFieldException e) {
	                    logger.error("Field {} unexpectedly not found in POJO despite name match. Possible error in POJO definition.", fieldName);
	                }
	            } else {
	                logger.warn("Field {} is not present in POJO and will be ignored.", fieldName);
	            }
	        }
	    }

	    // Check for any POJO fields that were not present in the JSON response
	    for (String pojoFieldName : pojoFieldNames) {
	        if (!jsonFieldsEncountered.contains(pojoFieldName)) {
	            logger.warn("Field {} is present in POJO but missing in the JSON response.", pojoFieldName);
	        }
	    }

	    logger.info("Validation of currentSemAssignmentFilesList completed.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

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
import com.nmims.api.model.CurrentSemAssignmentFilesListModel;
import com.nmims.api.model.FailSubjectsAssignmentFilesListModel;
import com.nmims.api.model.RegDataModel;
import com.nmims.api.model.StudentModel;
import com.nmims.api.model.ViewAssignmentsFormModel;



public class ViewAssignmentsFormMpper {
	
	
	 static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormMpper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	private String getJsonPropertyName(Field field) {
	    JsonProperty annotation = field.getAnnotation(JsonProperty.class);
	    return (annotation != null) ? annotation.value() : field.getName();
	}
	
	
//	@Override	
//	public void ViewAssignmentsFormMapperResponsValidation(String responseBodyData)
//	        throws JsonMappingException, JsonProcessingException {
//
//	    logger.info("Starting validation of current semester assignments...");
//	    
//	    
//
//	 Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);
//	    //currentSemAssignmentFilesList is in json array
//	    List<Map<String, Object>> assignmentFilesList = 
//	            (List<Map<String, Object>>) jsonMap.get("currentSemAssignmentFilesList");
//
//	    Assert.assertNotNull(assignmentFilesList, "Assignment files list is null or missing in the response.");
//
//	    Field[] pojoFields = ViewAssignmentsFormModel.class.getDeclaredFields();
//	    Set<String> pojoFieldNames = Arrays.stream(pojoFields)
//	                                       .map(this::getJsonPropertyName)
//	                                       .collect(Collectors.toSet());
//
//	    Set<String> jsonFieldsEncountered = new HashSet<>();
//
//	    for (Map<String, Object> listItem : assignmentFilesList) {
//	        for (Map.Entry<String, Object> entry : listItem.entrySet()) {
//	            String fieldName = entry.getKey();
//	            Object jsonFieldValue = entry.getValue();
//	            jsonFieldsEncountered.add(fieldName);
//
//	            if (jsonFieldValue == null) {
//	            //	logger.warn("Response field: {} is ",jsonFieldValue );
//	            	continue;
//	            }
//
//	            Class<?> jsonFieldType = jsonFieldValue.getClass();
//
//	            if (pojoFieldNames.contains(fieldName)) {
//	            	
//	                try {
//	                	
//	                	// Logic for Type validation
//	                    Field pojoField = ViewAssignmentsFormModel.class.getDeclaredField(
//	                        Arrays.stream(pojoFields)
//	                              .filter(f -> getJsonPropertyName(f).equals(fieldName))
//	                              .findFirst()
//	                              .map(Field::getName)
//	                              .orElse(fieldName)
//	                    );
//	                    Class<?> pojoFieldType = pojoField.getType();
//
//	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
//	                        logger.warn("Type mismatch for field: {}. JSON Type: {}, POJO Type: {}", 
//	                                    fieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
//	                        Assert.fail("Type mismatch for field: " + fieldName);
//	                    } else {
//	                       // logger.info("Field {} matches type in POJO.", fieldName);
//	                    }
//	                } catch (NoSuchFieldException e) {
//	                    logger.error("Field {} unexpectedly not found in POJO despite name match. Possible error in POJO definition.", fieldName);
//	                }
//	            } else {
//	                logger.warn("Field {} is not present in POJO", fieldName);
//	                Assert.fail("Field is not present in POJO" + fieldName);
//	            }
//	        }
//	    }
//
//	    for (String pojoFieldName : pojoFieldNames) {
//	        if (!jsonFieldsEncountered.contains(pojoFieldName)) {
//	            logger.warn("Field {} is present in POJO but missing in the JSON response.", pojoFieldName);
//	        }
//	    }
//
//	    logger.info("Validation of Assignment Files List completed.");
//	}
	
	
	
	
	
	
	public void ViewAssignmentsFormMapperResponsValidation(String responseBodyData)
	        throws JsonMappingException, JsonProcessingException {

	    logger.info("Starting validation of current semester assignments...");
	    
	    

	 Map<String, Object> jsonMap = objectMapper.readValue(responseBodyData, Map.class);
	    //currentSemAssignmentFilesList is in json array
//	    List<Map<String, Object>> assignmentFilesList = 
//	            (List<Map<String, Object>>) jsonMap.get("currentSemAssignmentFilesList");

	    Assert.assertNotNull(jsonMap, "Assignment files list is null or missing in the response.");

	    Field[] pojoFields = ViewAssignmentsFormModel.class.getDeclaredFields();
	    Set<String> pojoFieldNames = Arrays.stream(pojoFields)
	                                       .map(this::getJsonPropertyName)
	                                       .collect(Collectors.toSet());

	    Set<String> jsonFieldsEncountered = new HashSet<>();

	    for (Map.Entry<String, Object> listItem : jsonMap.entrySet()) {
	            String fieldName = listItem.getKey();
	            Object jsonFieldValue = listItem.getValue();
	            jsonFieldsEncountered.add(fieldName);

	            if (jsonFieldValue == null) {
	            //	logger.warn("Response field: {} is ",jsonFieldValue );
	            	continue;
	            }

	            Class<?> jsonFieldType = jsonFieldValue.getClass();

	            if (pojoFieldNames.contains(fieldName)) {
	            	
	                try {
	                	
	                	// Logic for Type validation
	                    Field pojoField = ViewAssignmentsFormModel.class.getDeclaredField(
	                        Arrays.stream(pojoFields)
	                              .filter(f -> getJsonPropertyName(f).equals(fieldName))
	                              .findFirst()
	                              .map(Field::getName)
	                              .orElse(fieldName)
	                    );
	                    Class<?> pojoFieldType = pojoField.getType();
	                    
	                    
	                    // Add logic for nested POJOs
		                if (pojoFieldType.equals(StudentModel.class)) {
		                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), CurrentSemAssignmentFilesListModel.class);
		                } else if (pojoFieldType.equals(RegDataModel.class)) {
		                    objectMapper.readValue(objectMapper.writeValueAsString(jsonFieldValue), FailSubjectsAssignmentFilesListModel.class);

		                
		                }else {
	                    

	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
	                        logger.warn("Type mismatch for field: {}. JSON Type: {}, POJO Type: {}", 
	                                    fieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
	                        Assert.fail("Type mismatch for field: " + fieldName);
	                    }
		            }
	              } catch (NoSuchFieldException e) {
	                    logger.error("Field {} unexpectedly not found in POJO despite name match. Possible error in POJO definition.", fieldName);
	                }
	            } else {
	                logger.warn("Field {} is not present in POJO", fieldName);
	                Assert.fail("Field is not present in POJO" + fieldName);
	            }
	        
	    }

	    for (String pojoFieldName : pojoFieldNames) {
	        if (!jsonFieldsEncountered.contains(pojoFieldName)) {
	            logger.warn("Field {} is present in POJO but missing in the JSON response.", pojoFieldName);
	        }
	    }

	    logger.info("Validation of Assignment Files List completed.");
	}
	
	
	
	
	

}

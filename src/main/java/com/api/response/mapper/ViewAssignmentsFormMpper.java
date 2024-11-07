package com.api.response.mapper;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.ViewAssignmentsFormPojo;
import com.api.response.validation.ViewAssignmentsFormResponseValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ViewAssignmentsFormMpper implements ViewAssignmentsFormResponseValidation{
	
	
	 static final Logger logger = LoggerFactory.getLogger(ViewAssignmentsFormMpper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public void ViewAssignmentsFormMapperResponsValidation(String responBodyData)
	        throws JsonMappingException, JsonProcessingException {

	    // Log an info message
	    logger.info("Starting validation of currentSemAssignmentFilesList...");

	    // Parse JSON
	    Map<String, Object> jsonMap = objectMapper.readValue(responBodyData, Map.class);

	    // Extract currentSemAssignmentFilesList field if present
	    List<Map<String, Object>> currentSemAssignmentFilesList = (List<Map<String, Object>>) jsonMap.get("currentSemAssignmentFilesList");

	    if (currentSemAssignmentFilesList == null) {
	        logger.warn("currentSemAssignmentFilesList is null or missing in the response.");
	        return;
	    }

	    // Get POJO fields
	    Field[] pojoFields = ViewAssignmentsFormPojo.class.getDeclaredFields();

	    // Iterate through each item in currentSemAssignmentFilesList
	    for (Map<String, Object> listItem : currentSemAssignmentFilesList) {
	        for (Map.Entry<String, Object> entry : listItem.entrySet()) {
	            String fieldName = entry.getKey();
	            Object jsonFieldValue = entry.getValue();

	            // Skip null values
	            if (jsonFieldValue == null) {
	                logger.info("Skipping null field: {}", fieldName);
	                continue;
	            }

	            Class<?> jsonFieldType = jsonFieldValue.getClass();

	            // Find corresponding POJO field
	            boolean fieldFound = false;
	            for (Field pojoField : pojoFields) {
	                if (pojoField.getName().equals(fieldName)) {
	                    fieldFound = true;
	                    Class<?> pojoFieldType = pojoField.getType();
	                    if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
	                        logger.warn("Type mismatch for field: {}", fieldName);
	                        logger.warn("JSON Type: {}, POJO Type: {}", jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
	                    } else {
	                        logger.info("Field: {} matches.", fieldName);
	                    }
	                    break;
	                }
	            }

	            if (!fieldFound) {
	                logger.info("Field: {} is not present in POJO class and will be ignored.", fieldName);
	            }
	        }
	    }

	    logger.info("Validation of currentSemAssignmentFilesList completed.");
	}



//	@Override
//	public void GetVideosForHomeResponsValidation(Response response)
//			throws JsonMappingException, JsonProcessingException {
//
//		
//		
//		List<ViewAssignmentsFormPojo> responsData = objectMapper.readValue(
//				response.asString(), new TypeReference<List<ViewAssignmentsFormPojo>> () {
//				});
//		
//		  for (ViewAssignmentsFormPojo data : responsData) {
//			  
//			    
//			  
//		  }
//		
//	}
	
	


}

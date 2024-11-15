package com.api.response.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.comman.JsonPojoArrayValidator;
import com.api.pojoClass.GetVideosForHomePojo;
import com.api.response.validation.GetVideosForHomeResponsValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetVideosForHomeMapper implements GetVideosForHomeResponsValidation {

	private static final Logger logger = LoggerFactory.getLogger(GetVideosForHomeMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	JsonPojoArrayValidator jsonPojoArrayValidator = new JsonPojoArrayValidator(mapper);
	
	    @Override
	    public void GetVideosForHomeResponsValidation(Response response) 
	            throws JsonMappingException, JsonProcessingException {
	        
	        logger.info("Starting GetVideosForHomeResponsValidation method");

	        

//	        List<GetVideosForHomePojo> responsedata = mapper.readValue(
//	            response.asString(),
//	            new TypeReference<List<GetVideosForHomePojo>>() {}
//	        );
//
//	        logger.info("Successfully mapped response to List<GetVideosForHomePojo>");
//
//	        // Validate data types
//	        for (GetVideosForHomePojo data : responsedata) {
//
//	            int id = data.getId();
//	            String subject = data.getSubject();
//	            String description = data.getDescription();
//	            String sessionDate = data.getSessionDate();
//	            String facultyName = data.getFacultyName();
//	            int programSemSubjectId = data.getProgramSemSubjectId();
//
//	            logger.debug("Validating data - id: {}, subject: {}, description: {}, sessionDate: {}, facultyName: {}, programSemSubjectId: {}", 
//	                id, subject, description, sessionDate, facultyName, programSemSubjectId);
//
//	            assertThat(id).isNotNull().isInstanceOf(Integer.class);
//	            assertThat(subject).isNotNull().isInstanceOf(String.class);
//	            assertThat(description).isNotNull().isInstanceOf(String.class);
//	            assertThat(sessionDate).isNotNull().isInstanceOf(String.class);
//	            assertThat(facultyName).isNotNull().isInstanceOf(String.class);
//	            assertThat(programSemSubjectId).isNotNull().isInstanceOf(Integer.class);
//	        }
//
//	        logger.info("Finished validating data types in GetVideosForHomeResponsValidation");
//	    }
//	    
	        ResponseBody responsebody = response.body();
			String responseBodyData =responsebody.asString();
			
			System.out.println("responseBodyData  ------- "+ responseBodyData);
	    
	   //     JsonResponseValidator.validateResponse(data, getClass(), null);  
	        
			jsonPojoArrayValidator.validateJsonArrayAgainstPojo(responseBodyData, GetVideosForHomePojo.class);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	


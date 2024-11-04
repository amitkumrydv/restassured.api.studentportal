package com.api.comman;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.pojoClass.GetVideosForHomePojo;
import com.api.response.validation.GetVideosForHomeResponsValidation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class GetVideosForHomeResponceValidation implements GetVideosForHomeResponsValidation {

	private static final Logger logger = (Logger)LoggerFactory.getLogger(GetVideosForHomeResponceValidation.class);

	    @Override
	    public void GetVideosForHomeResponsValidation(Response response) 
	            throws JsonMappingException, JsonProcessingException {
	        
	        logger.info("Starting GetVideosForHomeResponsValidation method");

	        ObjectMapper mapper = new ObjectMapper();

	        List<GetVideosForHomePojo> responsedata = mapper.readValue(
	            response.asString(),
	            new TypeReference<List<GetVideosForHomePojo>>() {}
	        );

	        logger.info("Successfully mapped response to List<GetVideosForHomePojo>");

	        // Validate data types
	        for (GetVideosForHomePojo data : responsedata) {

	            int id = data.getId();
	            String subject = data.getSubject();
	            String description = data.getDescription();
	            String sessionDate = data.getSessionDate();
	            String facultyName = data.getFacultyName();
	            int programSemSubjectId = data.getProgramSemSubjectId();

	            logger.debug("Validating data - id: {}, subject: {}, description: {}, sessionDate: {}, facultyName: {}, programSemSubjectId: {}", 
	                id, subject, description, sessionDate, facultyName, programSemSubjectId);

	            assertThat(id).isNotNull().isInstanceOf(Integer.class);
	            assertThat(subject).isNotNull().isInstanceOf(String.class);
	            assertThat(description).isNotNull().isInstanceOf(String.class);
	            assertThat(sessionDate).isNotNull().isInstanceOf(String.class);
	            assertThat(facultyName).isNotNull().isInstanceOf(String.class);
	            assertThat(programSemSubjectId).isNotNull().isInstanceOf(Integer.class);
	        }

	        logger.info("Finished validating data types in GetVideosForHomeResponsValidation");
	    }
	}
	
	


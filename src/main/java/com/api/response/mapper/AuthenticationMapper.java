package com.api.response.mapper;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthenticationMapper {
	
	public static final Logger logger= LoggerFactory.getLogger(AuthenticationMapper.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	
	private String getJsonPropertyName(Field field) {
	    JsonProperty annotation = field.getAnnotation(JsonProperty.class);
	    return (annotation != null) ? annotation.value() : field.getName();
	}
	
	
	
	
	
	
	
	

}

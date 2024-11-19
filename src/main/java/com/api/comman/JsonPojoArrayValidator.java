package com.api.comman;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.api.test.ViewAssignmentsFormTest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPojoArrayValidator {

	private static Logger logger = LoggerFactory.getLogger(JsonPojoArrayValidator.class);
    private final ObjectMapper objectMapper;

    public JsonPojoArrayValidator(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> void validateJsonArrayAgainstPojo(String responseBodyData, Class<T> pojoClass) {
    	
        logger.info("Starting validation of JSON array against POJO: {}", pojoClass.getSimpleName());
        

        try {
            // Parse JSON array into a List of Maps
            List<Map<String, Object>> jsonArray = objectMapper.readValue(responseBodyData, List.class);

            Assert.assertNotNull(jsonArray, "JSON array is null or empty in the response.");

            Field[] pojoFields = pojoClass.getDeclaredFields();
            Set<String> pojoFieldNames = Arrays.stream(pojoFields)
                                               .map(this::getJsonPropertyName)
                                               .collect(Collectors.toSet());

            Set<String> jsonFieldsEncountered = new HashSet<>();

            for (Map<String, Object> listItem : jsonArray) {
                for (Map.Entry<String, Object> entry : listItem.entrySet()) {
                    String fieldName = entry.getKey();
                    Object jsonFieldValue = entry.getValue();
                    jsonFieldsEncountered.add(fieldName);

                    if (jsonFieldValue == null ) {
                        logger.warn("Field {} in JSON object is null.", fieldName);
                        continue;
                    }
                    
                    if (jsonFieldValue == "") {
                        logger.warn("Field {} in JSON object is empty.", fieldName);
                        continue;
                    }

                    Class<?> jsonFieldType = jsonFieldValue.getClass();

                    if (pojoFieldNames.contains(fieldName)) {
                        try {
                            // Validate Type
                            Field pojoField = pojoClass.getDeclaredField(
                                Arrays.stream(pojoFields)
                                      .filter(f -> getJsonPropertyName(f).equals(fieldName))
                                      .findFirst()
                                      .map(Field::getName)
                                      .orElse(fieldName)
                            );
                            Class<?> pojoFieldType = pojoField.getType();

                            if (!pojoFieldType.isAssignableFrom(jsonFieldType)) {
                                logger.error("Type mismatch for field: {}. JSON Type: {}, POJO Type: {}",
                                        fieldName, jsonFieldType.getSimpleName(), pojoFieldType.getSimpleName());
                                Assert.fail("Type mismatch for field:{} " + fieldName );
                            }
                        } catch (NoSuchFieldException e) {
                            Assert.fail("Field:{} not found in POJO class " + fieldName );
                        }
                    } else {
                        logger.error("Field {} is not present in POJO: {}", fieldName, pojoClass.getSimpleName());
                        Assert.fail("Field not present in POJO: " + fieldName);
                    }
                }
            }

            for (String pojoFieldName : pojoFieldNames) {
                if (!jsonFieldsEncountered.contains(pojoFieldName)) {
                    logger.warn("Field {} is present in POJO but missing in the JSON response.", pojoFieldName);
                    Assert.fail("Field is present in POJO but missing in the JSON response."+pojoFieldName);
                }
            }

            logger.info("Validation completed for POJO: {}", pojoClass.getSimpleName());
        } catch (Exception e) {
            logger.error("Error during validation: {}", e.getMessage() );
            Assert.fail("Error during validation:" ,e);
        }
    }

    private String getJsonPropertyName(Field field) {
        JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
        return (jsonProperty != null) ? jsonProperty.value() : field.getName();
    }
}

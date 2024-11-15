package com.api.test.runner;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestRunner {
	
	private static Logger logger = LoggerFactory.getLogger(TestRunner.class);

    @BeforeSuite
    public void setup() {
    	
    	logger.info("Start ApiTestSuit....");
       
    }


    @AfterSuite
    public void generateAllureReport() {
    	
    	logger.info("Allure report generating.....");
        try {
            // Generate Allure report using the command line
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("cmd.exe", "/c", "allure generate --clean");
            processBuilder.start();

            // Optionally open the report immediately
            processBuilder.command("cmd.exe", "/c", "allure open");
            processBuilder.start();
            
            logger.info("Allure report generated");

        } catch (IOException e) {
        	logger.error("Getting Exception while generating Allure report", e);
            
        }
    }
}

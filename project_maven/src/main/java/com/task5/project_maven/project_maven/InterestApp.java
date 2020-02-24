package com.task5.project_maven.project_maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestApp {
	
	private static final Logger LOGGER = LogManager.getLogger(InterestApp.class);
	
    public static void main(String[] args) {
    	
        Interest obj1 = new Interest();
        double out = obj1.SI(6000, 15, 7);
        LOGGER.info("Simple Interest is "+out);
        
        Interest obj2 = new Interest();
        out = obj2.CI(6000, 5, 2);
        LOGGER.info("Compound Interest is "+out);
        
    }

}
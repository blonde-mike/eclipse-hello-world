package com.example.name.hello_world;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * New Eclipse Project
 * Experiments with SonarLint, SLF4J, Logback, Git, Javadoc
 *
 *@author Mike Crowther.
 *@version 1.0
 *@since 2019-01-11
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	/**
	 * This method experiments with SLF4J's Logger
	 * logger.info sends an info message to the console
	 * logger.error sends an error message to the console
	 * logger.warn sends a warning message to the console
	 * @param args
	 */
    public static void main( String[] args )
    {
    	logger.info("Info message");
    	logger.error("Error message");
    	logger.warn("Warning message");
    }
}

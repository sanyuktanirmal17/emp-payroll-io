package com.JavaProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello World";
    	LOG.debug(message + "Will printed on Debug");  
    	LOG.info(message + "Will printed on Info");
    	LOG.warn(message + "Will printed on Warn");
    	LOG.error(message + "Will printed on Error");
    	LOG.fatal(message + "Will printed on Fatal");
    	LOG.info("Appending String: {}",message);
    	System.out.println( message );
    }
}

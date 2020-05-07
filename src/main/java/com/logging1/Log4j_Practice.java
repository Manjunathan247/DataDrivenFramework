package com.logging1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Practice {
	private static Logger log = LogManager.getLogger(Log4j_Practice.class.getName());

	public static void main(String[] args) {
		log.info("Page is loaded");
		log.error("Element is not Displayed");
		log.debug("debug - Page");
	}

}

package com.logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Practice2 {
	private static Logger log = LogManager.getLogger(Log4j_Practice2.class.getName());

	public static void main(String[] args) {
		log.info("Page is loaded");
		log.error("Element is not Displayed");
		log.debug("debug - Page");
	}

}

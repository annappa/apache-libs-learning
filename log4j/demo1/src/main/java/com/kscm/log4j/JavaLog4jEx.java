package com.kscm.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaLog4jEx {

    private static final Logger logger = LogManager.getLogger(JavaLog4jEx.class);

    public static void main(String[] args) {

        logger.info("The main() method is called");

        doWork();

        logger.warn("Warning message");
        logger.error("Error message");
    }

    public static void doWork() {

        // doing some work

        logger.info("The doWork() method is called");
    }
}

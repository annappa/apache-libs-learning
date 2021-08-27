package com.kscm.log4j.work;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyWork {

    private static final Logger logger = LogManager.getLogger(MyWork.class);

    public void doMyWork() {

        // doing some work

        logger.info("doMyWork() method called");
    }
}

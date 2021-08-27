package com.kscm.log4j.main;

import com.kscm.log4j.work.MyWork;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaLog4jEx {

    private static final Logger logger = LogManager.getLogger(JavaLog4jEx.class);

    public static void main(String[] args) {

        logger.info("The main() method is called");

        doJob();

        MyWork mw = new MyWork();
        mw.doMyWork();

    }

    public static void doJob() {

        // doing some job

        logger.info("The doJob() method is called");
    }
}
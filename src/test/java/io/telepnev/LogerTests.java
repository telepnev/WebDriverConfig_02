package io.telepnev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LogerTests {
    private Logger logger = LogManager.getLogger(LogerTests.class);
    @Test
    public void loggerLoggerTests() {
        logger.error("error");
        logger.info("info");
        logger.debug("debug");
        logger.fatal("fatal");
    }
}

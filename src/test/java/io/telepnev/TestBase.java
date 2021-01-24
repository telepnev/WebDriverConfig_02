package io.telepnev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    private Logger logger = LogManager.getLogger(TestBase.class);

    @Before
    public void setUp() {
        driver.manage().window().fullscreen();
        driver = new WebDriverProvider().get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Start WebDriver");

    }

    @After
    public void stop() {
        if (driver != null) {
            driver.quit();
        }
        logger.info("Stop WebDriver");
    }
}

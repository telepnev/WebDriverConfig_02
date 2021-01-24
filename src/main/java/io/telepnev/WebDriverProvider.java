package io.telepnev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    @Override
    public WebDriver get() {
        final WebDriverConfig config = ConfigFactory.newInstance().create(WebDriverConfig.class);

        switch (config.browserName()) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                return new ChromeDriver();

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--disable-notifications");
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Unknown browser name !" + config.browserName());
        }
    }
}

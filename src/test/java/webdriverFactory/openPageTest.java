package webdriverFactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class openPageTest {
    @Test
    public void openYandexTest() {
        WebDriver driver = Browsers.FIREFOX.create();
        driver.get("https://yandex.ru");
        driver.quit();
    }
}

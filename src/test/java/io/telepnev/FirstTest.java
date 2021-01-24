package io.telepnev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertEquals;


public class FirstTest extends TestBase {
    private Logger logger = LogManager.getLogger(FirstTest.class);

    /*
     Не могу понять как этот логер работает, ставил в логФайле настройку что бы сообщение выводилось при падении теста, не работает
     */
    @Test
    public void checkYandexMainPageTitle() {
        String yandexMainPage = "Яндекс";
        driver.navigate().to("https://yandex.ru777/");
        String title = driver.getTitle();
        assertEquals(yandexMainPage, title);
        logger.error("Тест упал потому что не нашел страницу Яндекс");
    }


    @Test
    public void searchNumberTele2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://msk.tele2.ru/shop/number");
        WebElement searchNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchNumber")));
        searchNumber.sendKeys("97");
        searchNumber.click();

        WebElement bundlesColumn = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".numbers-slider")));
    }

}

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CRMCommonTest {
    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeTest
    public void launchApplication() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.get("http://alchemy.hguy.co/crm");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

    public void waitForElementToBeVisible(By byElement) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

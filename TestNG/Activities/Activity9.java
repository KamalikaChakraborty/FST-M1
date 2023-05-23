package TestNG.activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Reporter.log("Starting Test");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser");
        Reporter.log("Page title is " + driver.getTitle());
    }

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("Inside BeforeMethod");
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("Inside simpleAlertTestCase method");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert");
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText);
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
        simpleAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("Inside confirmAlertTestCase method");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened");
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert");
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText);
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        confirmAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("Inside promptAlertTestCase method");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert");
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText);
        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert");
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);
        promptAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended");
    }

    @AfterClass
    public void afterClass() {
        Reporter.log("Ending Test");
        driver.close();
    }
}

package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);
        confirmAlert.accept();

        driver.close();
    }
}

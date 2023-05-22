package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Home page title: " + driver.getTitle());

        Actions builder = new Actions(driver);
        builder.click().pause(1000).build().perform();
        String text = driver.findElement(By.className("active")).getText();
        System.out.println(text);
        builder.doubleClick().pause(1000).build().perform();
        text = driver.findElement(By.className("active")).getText();
        System.out.println(text);
        builder.contextClick().pause(1000).build().perform();
        text = driver.findElement(By.className("active")).getText();
        System.out.println(text);
        driver.close();
    }
}

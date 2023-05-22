package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Home page title: " + driver.getTitle());

        Actions builder = new Actions(driver);
        builder.sendKeys("S").build().perform();
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        driver.close();
    }
}

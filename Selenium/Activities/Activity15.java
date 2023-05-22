package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        driver.close();
    }
}

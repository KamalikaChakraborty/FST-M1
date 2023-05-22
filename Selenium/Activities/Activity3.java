package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Login message: " + message);

        driver.close();
    }
}

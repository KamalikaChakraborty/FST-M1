package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Home page title: " + driver.getTitle());

        Actions builder = new Actions(driver);
        WebElement button = driver.findElement(By.className("orange"));
        builder.moveToElement(button).build().perform();
        String tooltipMessage = button.getAttribute("data-tooltip");
        System.out.println(tooltipMessage);
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        driver.close();
    }
}

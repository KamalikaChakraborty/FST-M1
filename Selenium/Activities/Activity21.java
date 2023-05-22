package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity21 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Home page title: " + driver.getTitle());

        System.out.println("Current tab: " + driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Currently open windows: " + driver.getWindowHandles());
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("Page title: " + driver.getTitle());
        String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);
        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("Page title: " + driver.getTitle());
        pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        driver.close();
    }
}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/ajax");
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.cssSelector("button.violet")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);

        WebElement delayedText = driver.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);
        driver.close();
    }
}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.name("toggled"));
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        driver.close();
    }
}

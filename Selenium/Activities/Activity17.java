package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity17 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/selects");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement dropdown = driver.findElement(By.id("single-select"));

        Select singleSelect = new Select(dropdown);
        singleSelect.selectByVisibleText("Option 2");
        System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());
        singleSelect.selectByIndex(3);
        System.out.println("Third option: " + singleSelect.getFirstSelectedOption().getText());
        singleSelect.selectByValue("4");
        System.out.println("Fourth option: " + singleSelect.getFirstSelectedOption().getText());
        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        driver.close();
    }
}

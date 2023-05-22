package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity18 {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.training-support.net/selenium/selects");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement selectElement = driver.findElement(By.id("multi-select"));
        Select multiSelect = new Select(selectElement);
        multiSelect.selectByVisibleText("Javascript");
        for(int i = 4; i<=6 ; i++) {
            multiSelect.selectByIndex(i);
        }
        multiSelect.selectByValue("node");
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        multiSelect.deselectByIndex(5);
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        driver.close();
    }
}

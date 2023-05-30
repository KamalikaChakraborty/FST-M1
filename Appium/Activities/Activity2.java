package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        URL server = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(server, options);
    }

    @Test
    public void activity2() throws InterruptedException {
        driver.get("https://www.training-support.net");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String pageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
        System.out.println("Page heading: " + pageHeading);
        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();
        Thread.sleep(3000);
        String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).getText();
        System.out.println("About page heading: " + aboutPageHeading);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

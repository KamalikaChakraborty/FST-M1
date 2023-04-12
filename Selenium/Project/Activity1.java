package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 extends CRMCommonTest{

    @Test(priority = 1)
    public void verifyWebsiteTitle() {
        System.out.println("Application Title: "+ driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"SuiteCRM", "Title not matched. Expected: SuiteCRM, Actual: "+driver.getTitle());
    }
}

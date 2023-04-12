package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity5 extends CRMCommonTest{
    @Test(priority = 5, dependsOnMethods = {"activities.Activity4.loginToCRM"})
    public void printColorOfNavigationMenu() {
        //Navigation bar
        WebElement navigationBar = driver.findElement(By.cssSelector("div#toolbar"));
        System.out.println("Navigation bar color is: " + navigationBar.getCssValue("color"));
    }
}

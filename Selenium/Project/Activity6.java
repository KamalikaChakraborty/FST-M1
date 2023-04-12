package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity6 extends CRMCommonTest{
    @Test(priority = 6, dependsOnMethods = {"activities.Activity4.loginToCRM"})
    public void verifyActivitiesMenu() {
        List<WebElement> navigationMenuList = driver.findElements(By.cssSelector("a[id*='grouptab']"));
        boolean isMenuPresent = false;
        boolean isClickable = false;
        for(WebElement menu : navigationMenuList) {
            if(menu.getText().trim().equals("ACTIVITIES")){
                isMenuPresent = true;
                wait.until(ExpectedConditions.elementToBeClickable(menu));
                isClickable = true;
                break;
            }
        }
        Assert.assertEquals(isMenuPresent, true, "Activities menu is not present in navigation bar");
        Assert.assertTrue(isClickable, "Activities link is clickable");
        System.out.println("Activities menu present in navigation bar and it is clickable");
    }
}

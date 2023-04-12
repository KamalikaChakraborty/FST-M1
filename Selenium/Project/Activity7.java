package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity7 extends CRMCommonTest{
    @Test(priority = 7, dependsOnMethods = {"activities.Activity4.loginToCRM"})
    public void readPopup() throws InterruptedException {
        By salesMenuLink = By.id("grouptab_0");
        By leadsPageTitle = By.className("module-title-text");
        By firstAdditionalDetailsIcon = By.xpath("(//span[contains(@class,'suitepicon-action-info')])[1]");
        By phoneNumber = By.cssSelector("span.phone");
        waitForElementToBeVisible(salesMenuLink);
        driver.findElement(salesMenuLink).click();
        Thread.sleep(3000);
        WebElement leadsSubMenuLink = driver.findElement(salesMenuLink).findElement(By.xpath("./following-sibling::ul//a[@id='moduleTab_9_Leads']"));
        waitForElementToBeVisible(leadsSubMenuLink);
        leadsSubMenuLink.click();
        waitForElementToBeVisible(leadsPageTitle);
        Assert.assertEquals(driver.findElement(leadsPageTitle).getText().trim().equals("LEADS"), true, "Leads page is not loaded");
        waitForElementToBeVisible(firstAdditionalDetailsIcon);
        driver.findElement(firstAdditionalDetailsIcon).click();
        waitForElementToBeVisible(phoneNumber);
        System.out.println("Mobile Number: "+ driver.findElement(phoneNumber).getText());
    }
}

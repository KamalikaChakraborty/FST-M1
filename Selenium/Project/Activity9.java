package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity9 extends CRMCommonTest{
    @Test(priority = 9, dependsOnMethods = {"activities.Activity4.loginToCRM"})
    public void printLeadsTable() throws InterruptedException {
        By salesMenuLink = By.id("grouptab_0");
        By leadsPageTitle = By.className("module-title-text");
        waitForElementToBeVisible(salesMenuLink);
        driver.findElement(salesMenuLink).click();
        Thread.sleep(3000);
        WebElement leadsSubMenuLink = driver.findElement(salesMenuLink).findElement(By.xpath("./following-sibling::ul//a[@id='moduleTab_9_Leads']"));
        waitForElementToBeVisible(leadsSubMenuLink);
        leadsSubMenuLink.click();
        Thread.sleep(3000);
        waitForElementToBeVisible(leadsPageTitle);
        Assert.assertEquals(driver.findElement(leadsPageTitle).getText().trim().equals("LEADS"), true, "Leads page is not loaded");

        By leadsTable = By.xpath("//*[@id='MassUpdate']//table[contains(@class,'table-responsive')]");
        By leadsTableHeader = By.xpath("//thead//th/div");
        int nameCloumnIndex = 0;
        int userColumnIndex = 0;
        List<WebElement> columnList = driver.findElement(leadsTable).findElements(leadsTableHeader);
        for(int i=0; i<columnList.size();i++) {
            if(columnList.get(i).getText().trim().equals("Name")) {
                nameCloumnIndex = i+1;
                break;
            }
        }
        for(int i=0; i<columnList.size();i++) {
            if(columnList.get(i).getText().trim().equals("User")) {
                userColumnIndex = i+1;
                break;
            }
        }
        System.out.println("First 10 name and user details are: ");
        Thread.sleep(2000);
        for(int i=1; i<= 10; i++) {
            WebElement nameValue = driver.findElement(By.xpath("//*[@id='MassUpdate']//table[contains(@class,'table-responsive')]/tbody/tr["+i+"]/td["+(nameCloumnIndex+2)+"]"));
            WebElement userValue = driver.findElement(By.xpath("//*[@id='MassUpdate']//table[contains(@class,'table-responsive')]/tbody/tr["+i+"]/td["+(userColumnIndex+2)+"]"));
            System.out.println("Name is - "+ nameValue.getText()+", User is - " + userValue.getText());
        }
    }
}

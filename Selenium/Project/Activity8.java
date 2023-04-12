package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Activity8 extends CRMCommonTest{
    @Test(priority = 8, dependsOnMethods = {"activities.Activity4.loginToCRM"})
    public void verifyAccountsTable() throws InterruptedException {
        By salesMenuLink = By.id("grouptab_0");
        By accountsPageTitle = By.className("module-title-text");
        waitForElementToBeVisible(salesMenuLink);
        driver.findElement(salesMenuLink).click();
        Thread.sleep(3000);
        WebElement accountsSubMenuLink = driver.findElement(salesMenuLink).findElement(By.xpath("./following-sibling::ul//a[@id='moduleTab_9_Accounts']"));
        waitForElementToBeVisible(accountsSubMenuLink);
        accountsSubMenuLink.click();
        Thread.sleep(3000);
        waitForElementToBeVisible(accountsPageTitle);
        Assert.assertEquals(driver.findElement(accountsPageTitle).getText().trim().equals("ACCOUNTS"), true, "Accounts page is not loaded");

        By accountsTable = By.xpath("//*[@id='MassUpdate']//table[contains(@class,'table-responsive')]");
        By accountsTableHeader = By.xpath("//thead//th/div");
        int nameCloumnIndex = 0;
        List<WebElement> columnList = driver.findElement(accountsTable).findElements(accountsTableHeader);
        for(int i=0; i<columnList.size();i++) {
            if(columnList.get(i).getText().trim().equals("Name")) {
                nameCloumnIndex = i+1;
                break;
            }
        }
        System.out.println("First 5 odd row name are: ");
        for(int i=1; i<= 5; i++) {
            WebElement nameValue = driver.findElement(accountsTable).findElement(By.xpath("//tbody/tr[@class='oddListRowS1']["+i+"]/td[contains(@class,'inlineEdit')]["+nameCloumnIndex+"]"));
            System.out.println(nameValue.getText());
        }
    }
}

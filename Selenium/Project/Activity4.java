package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 extends CRMCommonTest{
    @Test(priority = 4)
    public void loginToCRM() {
        WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='bigbutton']"));
        By homePage = By.className("dashboard");
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();
        waitForElementToBeVisible(homePage);
        Assert.assertEquals(driver.findElement(homePage).isDisplayed(), true, "Homepage not loaded after login");
        System.out.println("Login successful");
    }
}

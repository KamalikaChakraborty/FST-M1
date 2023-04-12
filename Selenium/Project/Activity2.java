package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends CRMCommonTest{
    @Test(priority = 2)
    public void printHeaderImageText() {
        WebElement headerImage = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        System.out.println("Header image URL: "+ headerImage.getAttribute("src"));
    }
}

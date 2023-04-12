package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity3 extends CRMCommonTest{
    @Test(priority = 3)
    public void printFirstCopyrightTextFromFooter() {
        WebElement firstCopyrightElement = driver.findElement(By.xpath("//a[@id='admin_options']"));
        System.out.println("First copyright text from footer is: "+ firstCopyrightElement.getText());
    }
}

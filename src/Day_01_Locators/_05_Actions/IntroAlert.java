package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IntroAlert extends BaseDrv {
    @Test
    public void t(){

        driverx.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");


        WebElement clickme=driverx.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        waitTime(1);
        clickme.click();
        waitTime(1);
        driverx.switchTo().alert().accept();
        waitTime(1);
        WebElement clickme2=driverx.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        waitTime(1);
        clickme2.click();
        waitTime(1);
        driverx.switchTo().alert().dismiss();
        WebElement clickme3=driverx.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        waitTime(1);
        clickme3.click();
        waitTime(1);
        driverx.switchTo().alert().sendKeys("random");
        waitTime(1);
        driverx.switchTo().alert().accept();
        waitTime(1);
        WebElement c=driverx.findElement(By.id("prompt-demo"));
        Assert.assertTrue("accuraty",c.getText().contains("random"));


        end();










    }
}

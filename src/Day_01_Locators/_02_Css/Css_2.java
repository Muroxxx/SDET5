package Day_01_Locators._02_Css;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;
import org.junit.Assert;  //java test library

public class Css_2 extends BaseDrv {

    @Test
    public void test() {
        driverx.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");


        WebElement txb = driverx.findElement(By.cssSelector("input[id='user-message']"));
        txb.sendKeys("selenium");
        waitTime(2);
        WebElement bt = driverx.findElement(By.cssSelector("button[class='btn btn-default']"));
        bt.click();
        WebElement chb = driverx.findElement(By.cssSelector("span[id='display']"));

        /* if(chb.getText().equals("selenium"))
        System.out.println(" test passed");
        else
         System.out.println("test end up with fail");
         */

        Assert.assertEquals("selenium", chb.getText());
        //if there is no exception shows noting
        end();


    }
}

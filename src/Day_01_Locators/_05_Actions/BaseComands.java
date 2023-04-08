package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BaseComands extends BaseDrv {
    @Test

    public void t1(){

        driverx.get("https://demoqa.com/buttons");

        WebElement e=driverx.findElement(By.xpath("//button[text()='Click Me']"));
        Actions a=new Actions(driverx);   //page is able to actions perks now


        // instead of "e.click"


        Action a1=a.moveToElement(e).click().build();  // prepares for action

        /*
             -)double click
        Action a2=a.moveToElement(e).doubleClick().build();

             -) right click
        Action a3=a.moveToElement(e).contextClick().build();

         */
        a1.perform();  // make it happens




















    }
}

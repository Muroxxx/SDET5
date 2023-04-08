package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Higlight extends BaseDrv {

    @Test

    public void H(){


        driverx.get("https://www.hepsiburada.com/");

        WebElement s=driverx.findElement(By.xpath("//span[text()='Moda']"));

        waitTime(1);

        Actions a=new Actions(driverx);

        Action  a1=a.moveToElement(s).build();  // get the highlighted tab

        a1.perform();
























    }
}

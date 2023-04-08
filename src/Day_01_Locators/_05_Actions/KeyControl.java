package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyControl extends BaseDrv {
    @Test
    public void t(){
        driverx.get("https://demoqa.com/auto-complete");

        WebElement e=driverx.findElement(By.id("autoCompleteSingleInput"));

        //e.sendKeys("osmabn");

        Actions a=new Actions(driverx);
        Action a1=a.moveToElement(e)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("5")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build();
        a1.perform();







    }
}

package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ArrowKey extends BaseDrv {
    @Test
    public void a(){

        driverx.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driverx.findElement(By.id("autoCompleteSingleInput"));

        Actions actions = new Actions(driverx);


        Action a = actions
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build();
        a.perform();

        waitTime(1);

        a=actions
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        a.perform();


        






    }
}

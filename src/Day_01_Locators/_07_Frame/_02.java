package Day_01_Locators._07_Frame;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02 extends BaseDrv {
    @Test
    public void e(){

        driverx.get("https://chercher.tech/practice/frames");

        driverx.switchTo().frame(0);

        WebElement in=driverx.findElement(By.cssSelector("b[id='topic']~input"));
        in.sendKeys("turkety");

        driverx.switchTo().defaultContent();


        driverx.switchTo().frame(1);
        WebElement in2=driverx.findElement(By.id("animals"));
        Select a=new Select(in2);
        a.selectByVisibleText("Avatar");








    }
}

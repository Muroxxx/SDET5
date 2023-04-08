package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _02_Click extends BaseDrv {
    @Test
    public void s(){
        driverx.manage().deleteAllCookies();
        driverx.get("https://www.copado.com/robotic-testing");

        JavascriptExecutor js=(JavascriptExecutor)driverx;

        waitTime(1);

        WebElement e=driverx.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true)",e); //SCROLL UNTİL THE ELEMENT

        //e.click();  instead of this
        js.executeScript("arguments[0].click();",e); // if something blocks your click button use javascript

        // REACH THE ELEMENTS RİGHT TROUGH THE HTML






    }
}

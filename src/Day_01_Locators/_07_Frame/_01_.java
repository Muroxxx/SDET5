package Day_01_Locators._07_Frame;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ extends BaseDrv {
    @Test
    public void f(){

     driverx.get("https://chercher.tech/practice/frames");
     driverx.switchTo().frame(0);  // --> takes the chosen frame
    //driverx.switchTo().parentframe(0);    --> takes the previous frame
    //driverx.switchTo().defaultContent(0); --> takes the main frame

     WebElement input=driverx.findElement(By.cssSelector("b[id='topic']+input"));

     input.sendKeys("turkey");



    }

}

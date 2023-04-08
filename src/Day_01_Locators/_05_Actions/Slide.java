package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slide extends BaseDrv {
    @Test
    public void d(){

        driverx.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions a=new Actions(driverx);

        WebElement s=driverx.findElement(By.xpath("//div[@id='slider-range']/span[1]"));

        Action a2=a.dragAndDropBy(s,50,0).build();
        
        waitTime(2);

        a2.perform();

        waitTime(2);

        end();





    }
}

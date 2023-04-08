package Day_01_Locators._06_Wait;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplictlyWait extends BaseDrv {
    @Test
    public void w(){

        // its effect on all class

        driverx.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driverx.findElement(By.xpath("//button[text()='Click me to start timer']"));

        btn.click();

        Duration w=Duration.ofSeconds(20);

        driverx.manage().timeouts().implicitlyWait(w);  // it waits until the expected text is found
                                                      // if it founds earlier stops the wait time and continue

        WebElement text=driverx.findElement(By.xpath("//p[text()='WebDriver']"));













    }
}

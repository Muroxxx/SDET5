package W_EXAMPL;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class dome1 extends BaseDrv {
@Test
public void e()
    {

        driverx.get("https://opensource-demo.orangehrmlive.com/");


        WebElement A= driverx.findElement(By.xpath("(//*input[@name='username'])[3]"));
        A.sendKeys("Admin");

        WebElement B= driverx.findElement(By.xpath("(//*input[@name='password'])[3]"));

        B.sendKeys("admin123");

        WebElement C= driverx.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));





        JavascriptExecutor js=(JavascriptExecutor) driverx;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");






    }
}

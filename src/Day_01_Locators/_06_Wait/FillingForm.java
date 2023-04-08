package Day_01_Locators._06_Wait;

import Utilty.BaseDrv;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillingForm extends BaseDrv {

    @Test

    public void f(){

    driverx.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");


    WebElement a=driverx.findElement(By.id("title"));

    a.sendKeys("osman");

    WebElement b=driverx.findElement(By.id("description"));
    b.sendKeys("ergül");

    WebElement s= driverx.findElement(By.id("btn-submit"));

    s.click();

    WebDriverWait w=new WebDriverWait(driverx, Duration.ofSeconds(20));

    w.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

    WebElement m=driverx.findElement(By.id("submit-control"));

    Assert.assertEquals("Form submited Successfully!",m.getText());

    end();









    }


}

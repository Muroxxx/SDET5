package W_EXAMPL;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class projectassert extends BaseDrv {

    @Test

    public void a1(){
        driverx.get("http://www.facebook.com/");

        waitTime(1);

        WebElement xx=driverx.findElement(By.linkText("Yeni hesap oluştur"));
        xx.click();

        waitTime(1);

        WebElement x1=driverx.findElement(By.name("firstname"));
        x1.sendKeys("osman");

        waitTime(1);

        WebElement x2=driverx.findElement(By.name("lastname"));
        x2.sendKeys("ergül");

        waitTime(1);

        WebElement x3=driverx.findElement(By.name("reg_email_confirmation__"));
        //Assert.assertFalse(x3.isDisplayed());
        //System.out.println("x3.isDisplayed() = " + x3.isDisplayed());

        waitTime(1);

        WebElement x4=driverx.findElement(By.name("reg_email__"));
        x4.sendKeys("furkanixkrk@gmail.com");

        waitTime(1);

        //Assert.assertTrue(x4.isDisplayed());
        //System.out.println("x4.isDisplayed() = " + x4.isDisplayed());

        waitTime(1);

        WebElement y1=driverx.findElement(By.id("day"));
        Select d=new Select(y1);
        d.selectByVisibleText("21");

        waitTime(1);

        WebElement y2=driverx.findElement(By.id("month"));
        Select f=new Select(y2);
        f.selectByValue("2");

        waitTime(1);

        WebElement y3=driverx.findElement(By.id("year"));
        Select year=new Select(y3);
        year.selectByVisibleText("1998");


        end();






















    }

















}

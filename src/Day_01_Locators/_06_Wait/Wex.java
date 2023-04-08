package Day_01_Locators._06_Wait;

import Utilty.BaseDrv;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wex extends BaseDrv {

    @Test
    public void wex(){

        //until ALERT İS PRESENT
        driverx.get("http://www.demoblaze.com/index.html");

        WebElement a=driverx.findElement(By.linkText("Samsung galaxy s6"));

        a.click();

        WebElement b=driverx.findElement(By.linkText("Add to cart"));
        b.click();

        WebDriverWait w=new WebDriverWait(driverx, Duration.ofSeconds(5));
        w.until(ExpectedConditions.alertIsPresent());

        driverx.switchTo().alert().accept();

        WebElement n=driverx.findElement(By.id("nava"));

        n.click();

        waitTime(2);

        end();






















    }
}

package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOver extends BaseDrv {

    @Test

    public void h(){


        driverx.get("https://www.etsy.com");

        WebElement g=driverx.findElement(By.id("catnav-primary-link-10855"));

        WebElement c= driverx.findElement(By.id("side-nav-category-link-10873"));

        WebElement f= driverx.findElement(By.id("catnav-l3-10876"));

        Actions a=new Actions(driverx);

        a.moveToElement(g).build().perform();

        waitTime(1);

        a.moveToElement(c).build().perform();

        waitTime(1);

        a.moveToElement(f).click().perform();

        waitTime(1);

        System.out.println("getCurrentUrl= " + driverx.getCurrentUrl());

        Assert.assertTrue(driverx.getCurrentUrl().contains("necklaces"));

        end();




















    }
}

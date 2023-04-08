package Day_01_Locators._02_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;

public class Css extends BaseDrv {
    public static void main(String[] args) {


        driverx.get("https://www.snapdeal.com/");

        WebElement w1=driverx.findElement(By.id("inputValEnter"));

        System.out.println("color = " + w1.getCssValue("color"));
        System.out.println("color = " + w1.getCssValue("font-size"));
        System.out.println("color = " + w1.getCssValue("background"));


        //  "*" = contains
        //  "^" = starts with
        //  "$" = ends with

















    }
}

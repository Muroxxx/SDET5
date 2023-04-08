package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;

public class Navigating extends BaseDrv {
    public static void main(String[] args) {


        driverx.get("https://testpages.herokuapp.com/styled/index.html");

        waitTime(1);
        WebElement element= driverx.findElement(By.id("alerttest"));

        element.click();
        waitTime(2);
        System.out.println("driverx.getCurrentUrl() = " + driverx.getCurrentUrl());

        driverx.navigate().back();
        waitTime(2);

        driverx.navigate().forward();
        waitTime(2);



        end();

    }
}

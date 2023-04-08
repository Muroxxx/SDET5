package Day_01_Locators._04_Selectss;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass extends BaseDrv {

    @Test
    public void t1(){

        driverx.get("https://www.amazon.com.tr/");
        WebElement w1=driverx.findElement(By.id("searchDropdownBox"));

        Select s1=new Select(w1); // turns the element to more flexible object

        // 1-
             s1.selectByIndex(4);
        // 2-
             s1.selectByValue("search-alias=electronics");
        //  3-
             s1.selectByVisibleText("Elektronik");










    }










}

package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrolItobottom extends BaseDrv {
    @Test
    public void v(){

        driverx.get("https://p-del.co/");

        JavascriptExecutor js=(JavascriptExecutor)driverx;

        waitTime(2);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrolls to end of page

        waitTime(2);

        js.executeScript("window.scrollTo(0,0)");  // goes to start










    }


}

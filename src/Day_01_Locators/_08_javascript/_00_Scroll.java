package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _00_Scroll extends BaseDrv {
    @Test

    public void s(){


        driverx.get("https://p-del.co/");

        JavascriptExecutor js=(JavascriptExecutor)driverx;
        // that's starts the javascript commends

        waitTime(1);

        js.executeScript("window.scrollBy(0,2560)");
        // scroll down by x=0 ,  y=2560 pixels

        waitTime(1);

        js.executeScript("window.scrollBy(0,-1440)");


        /*
        window.scrollTo(0,3000);  -->  goes to given pixel
        window.scrollBy(0,3000);  -->  goes to given pixel from the current location
        window.scrollTo(0,document.body.scrollHeight):   --> scrolls to end of page
        arguments[0].scrollIntoView(true);",element)     --> goes to element given by
                                                             false: element on the bottom of the page
                                                             true : element on the top of the page

         */

    }
}

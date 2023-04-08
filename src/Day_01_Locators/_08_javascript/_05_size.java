package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _05_size extends BaseDrv {
    @Test
    public void r(){

        driverx.get("https://www.youtube.com/");

        driverx.manage().window().maximize();

        waitTime(2);

        Dimension s=new Dimension(1660,1050);
        driverx.manage().window().setSize(s);


        end();









    }
}

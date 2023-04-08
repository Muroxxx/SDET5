package Day_01_Locators._07_Frame;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class alltabs extends BaseDrv {
    @Test
    public void w(){

        driverx.get("https://selenium.dev/");
        String id=driverx.getWindowHandle();

        List<WebElement>link=driverx.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement lin:link)
            if (!lin.getAttribute("href").contains("mail"))
                lin.click();

        Set<String>wid=driverx.getWindowHandles();//gets aal the id's
        for(String id2:wid);

        driverx.switchTo().window(id); //that's redirect you to main page

















    }
}

package Day_01_Locators._07_Frame;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class alltabs2 extends BaseDrv {
    @Test
    public void ts(){
        driverx.get("https://www.selenium.dev/");


        String mid=driverx.getWindowHandle();

        List<WebElement> link=driverx.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement lin:link)
            if (!lin.getAttribute("href").contains("mail"))
                lin.click();


        Set<String>ids=driverx.getWindowHandles();
        for (String id:ids){
            waitTime(1);
            driverx.switchTo().window(id);  // next tab
            System.out.println("id = "+driverx.getTitle()+driverx.getCurrentUrl());

        }


        //close back
        for (String idb:ids){
            if (idb.equals(mid))
                continue;
            driverx.switchTo().window(idb);
            driverx.close();
        }


        end();



    }
}

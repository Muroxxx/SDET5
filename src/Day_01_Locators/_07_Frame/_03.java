package Day_01_Locators._07_Frame;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03 extends BaseDrv {
    @Test
    public void t(){
        driverx.get("https://chercher.tech/practice/frames");
        driverx.switchTo().frame(0);

        WebElement in=driverx.findElement(By.cssSelector("b[id='topic']~input"));
        in.sendKeys("turkety");


        driverx.switchTo().frame(0); // first frame in the previous frame
        WebElement check=driverx.findElement(By.id("a"));
        check.click();

        driverx.switchTo().defaultContent();
        driverx.switchTo().frame(1);
        WebElement chech2=driverx.findElement(By.id("animals"));
        Select n=new Select(chech2);
        n.selectByIndex(3);






    }
}

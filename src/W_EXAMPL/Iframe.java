package W_EXAMPL;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Iframe extends BaseDrv {
    @Test
    public void f(){
        driverx.get("https://demoqa.com/frames");
        List<WebElement>i=driverx.findElements(By.tagName("iframe"));
        System.out.println("all frames ="+ i.size());

    }

    @Test
    public void f2(){
        driverx.get("https://demoqa.com/frames");
        WebElement f= driverx.findElement(By.cssSelector("#frame1"));
        driverx.switchTo().frame(f);// webelement
     // driverx.switchTo().frame("frame1") by id
     // driverx.switchTo().frame(2); by index
        WebElement t=driverx.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]"));
        System.out.println(t.getText());

    }

    @Test
    public void f3(){

        driverx.get("https://demoqa.com/browser-windows");

        String ur= driverx.getWindowHandle();

        WebElement S= driverx.findElement(By.xpath("//button[@id='tabButton']"));

        S.click();

        Set<String> S1= driverx.getWindowHandles();
        for (String i:S1){
            if (i.equals(ur)){
                continue;
            }
            driverx.switchTo().window(i);
        }

        WebElement t= driverx.findElement(By.cssSelector("#sampleHeading"));

        System.out.println(t.getText());










    }
}

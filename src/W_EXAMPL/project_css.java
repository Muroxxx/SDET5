package W_EXAMPL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;

public class project_css extends BaseDrv {

    @Test
    public void Testx(){

    driverx.get("https://formsmarts.com/form/yu?mode=h5");

        waitTime(2);

    WebElement w1=driverx.findElement(By.cssSelector("[value=Business]"));
    w1.click();

    waitTime(2);

    WebElement w2=driverx.findElement(By.cssSelector("[id$='_4588']"));
    //$ : ends with specified elements
    w2.click();

    waitTime(1);

    WebElement w3=driverx.findElement(By.cssSelector("option[value='Online Advertising']"));
    w3.click();

    waitTime(2);

    WebElement w4=driverx.findElement(By.cssSelector("input[value='Every Day']"));
    w4.click();

    waitTime(2);

    WebElement w5=driverx.findElement(By.cssSelector("input[value='Good']"));
    w5.click();

    waitTime(2);

    WebElement w6=driverx.findElement(By.cssSelector("select[id$='_4597']"));
    w6.click();

    waitTime(1);

    WebElement w7=driverx.findElement(By.cssSelector("select[id$='4597']>:nth-child(3)"));
    w7.click();

    waitTime(2);

    end();

















    }

}

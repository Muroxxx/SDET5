package W_EXAMPL;

import Utilty.BaseDrv;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class projectmentor extends BaseDrv {
    public static void main(String[] args) {

        driverx.get("http://demo.nopcommerce.com");

        //WebElement a=driverx.findElement(By.className("ico-login"));

        WebElement a=driverx.findElement(By.xpath("//a[contains(@href,'login')]"));

        a.click();

        WebElement a2=driverx.findElement(By.xpath("(//input[starts-with(@id,Email)])[3]"));
        //[3] means third one
        a2.sendKeys("test@test.com");

        WebElement a3=driverx.findElement(By.xpath("//*[@name='Password']"));
        a3.sendKeys("123456");

        WebElement a4=driverx.findElement(By.xpath("//*[@class='button-1 login-button']"));
        a4.click();

        WebElement a5=driverx.findElement(By.xpath("//*[@class='search-box-text ui-autocomplete-input']"));
        a5.sendKeys("Beats Pill");

        WebElement a6=driverx.findElement(By.xpath("//*[@type='submit']"));
        a6.click();

        WebElement a7=driverx.findElement(By.linkText("Beats Pill 2.0 Wireless Speaker"));
        System.out.println(a7.getText());




















































    }
}

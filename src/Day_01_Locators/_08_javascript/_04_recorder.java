package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class _04_recorder extends BaseDrv {
    @Test
    public void s() throws IOException {

        driverx.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driverx.findElement(By.name("username"));
        username.sendKeys("murkoff");

        WebElement pass= driverx.findElement(By.name("password"));
        pass.sendKeys("cli");

        WebElement click= driverx.findElement(By.cssSelector("button[type='submit']"));
        click.click();

        List<WebElement>corraption=driverx.findElements(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']"));

        if (corraption.size()>0){

            System.out.println("error occurred");


            TakesScreenshot sc=(TakesScreenshot)driverx;// phase 1 screenshot variant defined
            File MEMORY=sc.getScreenshotAs(OutputType.FILE);//phase 2 screenshot has been taken
            //saves the file as a pathway
            FileUtils.copyFile(MEMORY,new File("C:\\Users\\furka\\Videos\\Captures//screenshot.png"));
            //it use as "png"  - "jepeg" - "bmp"



        }











    }
}

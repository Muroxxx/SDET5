package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_By_Id {
    public static void main(String[] args) {

        // first_8 search for all page
        // #first_8 search for all ID parameters    / those commend used in page ınspect
        // İf there is more than one for searching element its takes the first one

        WebDriver e=new EdgeDriver();
        e.get("https://www.jotform.com/contact/");


        WebElement namebox=e.findElement(By.id("name"));
        namebox.sendKeys("muro");



        namebox.clear();

        WebElement click=e.findElement(By.id("uploadScreenshot"));
        click.click();










    }
}

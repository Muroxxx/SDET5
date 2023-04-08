package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class _04_ByName {
    public static void main(String[] args) {

        WebDriver E=new EdgeDriver();
        E.get("https://www.jotform.com/contact/");

        WebElement w1=E.findElement(By.name("name"));
        w1.sendKeys("osman");















    }
}

package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ExceptionCatcher {
    public static void main(String[] args) {


        WebDriver E=new  EdgeDriver();
        E.get("https://www.jotform.com/contact/");

        try {
            WebElement hat=E.findElement(By.id("wrong"));
        }catch (Exception ex)
        {
            System.out.println(" not found " + ex.getMessage());
        }




















    }
}

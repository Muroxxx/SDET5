package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class _05_ByList {
    public static void main(String[] args) {

        // shows how many they are

        WebDriver E=new EdgeDriver();
        E.get("https://www.jotform.com/contact/");

        List<WebElement>w2=E.findElements(By.name("question"));
        System.out.println("w2.size() = " + w2.size());















    }
}

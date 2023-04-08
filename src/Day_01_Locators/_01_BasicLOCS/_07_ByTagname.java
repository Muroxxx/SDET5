package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;

import java.util.List;

public class _07_ByTagname extends BaseDrv {
    public static void main(String[] args) {


        driverx.get("https://www.n11.com/");

        List<WebElement> W=driverx.findElements(By.tagName("A"));


        for (WebElement w:W){
            if (w.getText().isEmpty()){
                System.out.println("(\"href\") = " + w.getAttribute("href"));
                System.out.println("(\"title\") = " + w.getAttribute("title"));

            }
        }






    }
}

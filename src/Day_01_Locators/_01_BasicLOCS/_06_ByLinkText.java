package Day_01_Locators._01_BasicLOCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import Utilty.BaseDrv;

public class _06_ByLinkText extends BaseDrv {
    public static void main(String[] args) {

        //link text used  with "<a>" tag only

        WebDriver E=new EdgeDriver();
        E.get("https://www.hepsiburada.com/");



        WebElement w1=E.findElement(By.linkText("Siparişlerim"));
        System.out.println("w1.getText() = " + w1.getText());

//Attribute used for reach the parameters
        System.out.println("href = " + w1.getAttribute("href"));

        System.out.println("title = " + w1.getAttribute("title"));

//partialLink : it can be specified one part from all text no need to full text
        WebElement w3=E.findElement(By.partialLinkText("Girişimci"));
        System.out.println("w3 = " + w3);














    }
}

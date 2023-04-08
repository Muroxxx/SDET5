package Day_01_Locators._01_BasicLOCS;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _01_DriverOpen {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");




        driver.close();  //ends only new opened tab
        //or
        driver.quit();  //ends hole browser


    }
}

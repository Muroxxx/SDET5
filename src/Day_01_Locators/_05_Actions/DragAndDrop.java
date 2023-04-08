package Day_01_Locators._05_Actions;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseDrv {
    @Test
    public void d(){

        driverx.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        Actions a=new Actions(driverx);

        WebElement oslo=driverx.findElement(By.id("box1"));
        WebElement NORWAY=driverx.findElement(By.id("box101"));


        a.clickAndHold().build().perform();
        a.moveToElement(NORWAY).release().build().perform();


        // second way

        a.dragAndDrop(oslo,NORWAY).build().perform();






    }

}

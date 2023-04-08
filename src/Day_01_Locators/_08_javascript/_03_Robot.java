package Day_01_Locators._08_javascript;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class _03_Robot extends BaseDrv{

    @Test
    public void Test1() throws AWTException {
        driverx.get("http://demo.guru99.com/test/upload/");

        waitTime(1);
        

        Robot rbt=new Robot();

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);


        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        StringSelection path=new StringSelection("\"C:\\Users\\furka\\OneDrive\\Masaüstü\\osman ergül.txt\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
        //copies the of the file






























    }
}

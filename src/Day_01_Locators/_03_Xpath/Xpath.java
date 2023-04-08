package Day_01_Locators._03_Xpath;

import org.openqa.selenium.By;
import Utilty.BaseDrv;

public class Xpath extends BaseDrv {
    public static void main(String[] args) {


        //xpath used for all page its powerful but slow
        driverx.findElement(By.xpath("//[@='']"));



/*
             CSS                 /          XPATH

         "*" = contains           ==  //*[start-with(@id,'u_')]   or   //a[start-with(@id,'u_')]
         "^" = starts with        ==  //*[ends-with(@id,'_4545')]  or  //input[ends-with(@id,'_4545')]
         "$" = ends with          ==  //*[contains(@id,'u_')]

         ("input - a - img "is specified tags for searched. "*"   means search all page)


         [id='msg'][value='good']  ==  //*[@id='msg' and @value='good']


         >      (kids)                              /
         space  (children)                          //
         +      (fallowing sibling)                 fallowing-sibling::
         ~      (all sisters)                       fallowing::

         -----------------------------------------------------------------------------------------

         absolute xpath
                 start with --> /
                 uses the page design to searched elements


         Relative xpath
                 start with  --> //
                 doesn't use the page design, find the elements directly

         ---------------------------------------------------------------------------------------------


         /..                              -->   goes to parent
         //*[text()='hello']              -->   search for specified text
         //*[contains(text(),'hello')]    -->   search for specified participle text




 */
























    }
}

package W_EXAMPL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilty.BaseDrv;

import java.util.List;

public class project_xpath extends BaseDrv {
     @Test

     public void tx() {

          driverx.get("https://www.saucedemo.com/");


          WebElement x1 = driverx.findElement(By.xpath("//input[@id='user-name']"));
          x1.sendKeys("standard_user");

          waitTime(2);

          WebElement X2 = driverx.findElement(By.xpath("//input[@id='password']"));
          X2.sendKeys("secret_sauce");

          waitTime(1);

          WebElement x3 = driverx.findElement(By.xpath("//input[@id='login-button']"));
          x3.click();

          waitTime(1);

          WebElement x4 = driverx.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
          x4.click();

          waitTime(1);

          WebElement x5 = driverx.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
          x5.click();

          waitTime(1);

          WebElement x6 = driverx.findElement(By.xpath("//button[@name='back-to-products']"));
          x6.click();

          waitTime(1);

          WebElement x7 = driverx.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
          x7.click();

          waitTime(1);

          WebElement x8 = driverx.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
          x8.click();

          waitTime(1);

          WebElement x9 = driverx.findElement(By.xpath("//button[@id='back-to-products']"));
          x9.click();

          waitTime(1);

          WebElement x91 = driverx.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
          x91.click();

          waitTime(1);

          WebElement x92 = driverx.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
          x92.click();

          waitTime(1);

          WebElement x93 = driverx.findElement(By.xpath("//input[@id='first-name']"));
          x93.sendKeys("osman");

          waitTime(1);

          WebElement x94 = driverx.findElement(By.xpath("//input[@id='last-name']"));
          x94.sendKeys("ergül");

          waitTime(1);

          WebElement x95 = driverx.findElement(By.xpath("//input[@id='postal-code']"));
          x95.sendKeys("06000");

          waitTime(1);

          WebElement x96 = driverx.findElement(By.xpath("//input[@id='continue']"));
          x96.click();

          waitTime(1);


          end();


     }
}













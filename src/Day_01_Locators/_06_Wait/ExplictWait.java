package Day_01_Locators._06_Wait;

import Utilty.BaseDrv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplictWait extends BaseDrv {
    @Test
    public void d() {

        driverx.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        // used on particularly chosen object only
        WebElement btn = driverx.findElement(By.xpath("//button[text()='Click me to start timer']"));


        Duration is = Duration.ofSeconds(20);
        btn.click();
        WebDriverWait w = new WebDriverWait(driverx, is);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));


/*
       .titleIs -> title bu olana kadar bekle

       .titleContains -> title ın da bu kelime geçene kadar bekle

       .urlToBe ->url bu olana kadar bekle

       .urlContains ->url de bu kelime geçene kadar bekle

       .visibilityOfElementLocated ->eleman DOM da var ve gözükür olana kadar bekle

       .visibilityOfTheElement ->eleman gözükene kadar bekle

       .InvisibilityOfTheElement -> eleman kaybolana kadar bekle

       .elementToBeClickable ->eleman tıklanabilir olana kadra bekle

       .elementToBeSelected ->eleman seçilebilir olana kadra bekle

       .textToBe ->elemanda verilen txt gözükene kadar bekle.

       .alertIsPresent()  ->alert çıkana kadar bekle.

       .visibilityOfAllElementsLocatedBy -> locator ile bütün elemanlari gözükene kadar bekle

       .visibilityOfAllElements -> Verilen elemanların listesindeki tüm elemanlar gözrünür olana kadar bekle

       .numberOfElementsToBe -> verilen locatora sahip elemanların sayısı bu olana kadar bekle

       .numberOfElementsToBeLessThan -> verilen locatora sahip elemanların sayısı verilenden az olana kadar bekle

       .numberOfElementsToBeMoreThan ->verilen locatora sahip elemanların sayısı verilenden fazla olana kadar bekle

       .elementStaleness -> verilen element bayatlaması geçene kadar bekle

 */

    }
}

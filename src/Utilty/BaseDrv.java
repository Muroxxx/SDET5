package Utilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDrv {

    public static WebDriver driverx;

     static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);  // make the program show error only
        System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        driverx = new EdgeDriver();
        Duration w=Duration.ofSeconds(20);
        driverx.manage().timeouts().pageLoadTimeout(w);
        driverx.manage().timeouts().implicitlyWait(w); //gives time for search the wanted elements
    }

    public static void waitTime(int sn) {
        try {
            Thread.sleep(1000L * sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void end() {
        driverx.quit();
    }


}

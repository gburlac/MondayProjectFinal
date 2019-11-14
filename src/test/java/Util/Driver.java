package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static void startDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/resorces/drivers/chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(55,TimeUnit.SECONDS);



    }

    public static  WebDriver getDriver(){
        return driver;
    }

}

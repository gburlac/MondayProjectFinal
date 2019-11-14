package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DiezPage {


    //initializing

    private  static  final String URL ="https://diez.md/";


    public static void initialisePage(){

        Driver.getDriver().get(URL);

        PageFactory.initElements(Driver.getDriver(),DiezPage.class);
    }

    //find elements
    @FindBy(xpath="//li[@id='menu-item-264300']/a")
    private static WebElement clickOnSocial;
    @FindBy(xpath="//li[@id='menu-item-264298']/a")
    private static WebElement clickOnPolitica;
    @FindBy(xpath="//li[@id='menu-item-264292']/a")
    private static WebElement clickOnEconomie;
    @FindBy(xpath="//li[@id='menu-item-264293']/a")
    private static WebElement clickOnEducatie;
    @FindBy(xpath="//li[@id='menu-item-264297']/a")
    private static WebElement clickOnOportunitati;
    @FindBy(xpath="//li[@id='menu-item-264294']/a")
    private static WebElement clickOnEvenimente;
    @FindBy(xpath="//li[@id='menu-item-264295']/a")
    private static WebElement clickOnInternational;
    @FindBy(xpath="//li[@id='menu-item-264291']/a")
    private static WebElement clickOnCultura;
    @FindBy(xpath="//li[@id='menu-item-264296']/a")
    private static WebElement clickOnLifestyle;
    @FindBy(xpath="//li[@id='menu-item-264290']/a")
    private static WebElement clickOnCalatorii;
    @FindBy(xpath="//li[@id='menu-item-264299']/a")
    private static WebElement clickOnSocialmedia;
    @FindBy(xpath="//li[@id='menu-item-264301']/a")
    private static WebElement clickOnSport;

    //List<WebElement>  = driver.findElements.(By xpath)


    //method


    public static void clickOnSocial(){
        clickOnSocial.click();
    }
    public static void clickOnPolitica(){
        clickOnPolitica.click();
    }
    public static void clickOnEconomie(){
        clickOnEconomie.click();
    }
    public static void clickOnEducatie(){
        clickOnEducatie.click();
    }
    public static void clickOnOportunitati(){
        clickOnOportunitati.click();
    }
    public static void clickOnEvenimente(){
        clickOnEvenimente.click();
    }
    public static void clickOnInternational(){
        clickOnInternational.click();
    }
    public static void clickOnCultura(){
        clickOnCultura.click();
    }
    public static void clickOnLifestyle(){
        clickOnLifestyle.click();
    }
    public static void clickOnCalatorii(){
        clickOnCalatorii.click();
    }
    public static void clickOnSocialmedia(){
        clickOnSocialmedia.click();
    }
    public static void clickOnSport(){
        clickOnSport.click();
    }


}

package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPage {

    //initializing

    private  static  final String URL ="https://enter.online/";


    public static void initialisePage(){

        Driver.getDriver().get(URL);

        PageFactory.initElements(Driver.getDriver(),EnterPage.class);
    }

    //find elements
    @FindBy(xpath="//*[@id=\"megamenubutton\"]/button[2]")
    private static WebElement hoverOver;
    //*[@id="megamenubutton"]/div/div/div/div[1]/ul/li[3]/a
    @FindBy(xpath="//*[@id=\"megamenubutton\"]/div/div/div/div[1]/ul/li[3]/a")
    private static WebElement pcPeriferice;
    @FindBy(xpath="//*[@id=\"megamenubutton\"]/div/div/div/div[2]/div/div[3]/div[4]/ul/li/ul/li[1]/a")
    private static WebElement clickTastaturi;
    //*[@id="elm_checkbox_376_239_61352"]
    @FindBy(xpath="//input[@id='elm_checkbox_376_239_61352']")
    private static WebElement selectOptionTastaturi;
    //input[@id='elm_checkbox_376_239_61352']
    //*[@id="elm_checkbox_376_256_65292"]
    @FindBy(xpath="//*[@id=\"elm_checkbox_376_256_65292\"]")
    private static WebElement selectOptionTastaturi2;
    //*[@id="elm_checkbox_376_290_62144"]
    @FindBy(xpath="//input[@id='elm_checkbox_376_290_62144']")
    private static WebElement selectOptionTastaturi3;
    //*[@id="sw_dropdown_3262_cart"]/a/span/svg/path[1]
    //button[@id='button_cart_98934']
    @FindBy(xpath="//button[@id='button_cart_98934']")
    private static WebElement addToCart;
    //*[@id="sw_dropdown_3262_cart"]/a/span/svg/path[1]
    //span[contains(@class, 'ty-badge')]
    //div[contains(@class, 'uk-grid uk-grid-small uk-flex-right uk-flex-middle')]
    //div[@id='sw_dropdown_3262_cart']
    @FindBy(xpath="//div[@id='sw_dropdown_3262_cart']")
    private static WebElement clickOnCart;
    //*[@id="dropdown_3262_cart"]/div/div[2]/div/a
    //a[contains(@class, 'ty-btn ty-btn__primary')]
    @FindBy(xpath="//a[contains(@class, 'ty-btn ty-btn__secondary')]")
    private static WebElement clickVizualizatiCosul;
    //*[@id="checkout"]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/a
    @FindBy(xpath="//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private static WebElement clickOnfinalizareComanda;
    @FindBy(xpath="//button[@class=\"ty-btn__primary ty-btn\"]")
    private static WebElement clickFinalizareComandaFaraInregistrare;
    @FindBy(xpath="//input[@id='elm_15']")
    private static WebElement inputPrenume;
    @FindBy(xpath="//input[@id='elm_17']")
    private static WebElement inputNume;
    @FindBy(xpath="//input[@id='elm_33']")
    private static WebElement inputEmail;
    @FindBy(xpath="//input[@id='elm_31']")
    private static WebElement inputPhone;
    @FindBy(xpath="//input[@id='elm_23']")
    private static WebElement inputOras;
    @FindBy(xpath="//input[@id='elm_19']")
    private static WebElement inputAdresa;
    //*[@id="step_two_body"]/form/div[3]/button
    //form[contains(@class, 'cm-ajax cm-ajax-full-render  cm-processed-form')]/div[contains(@class, 'ty-checkout-buttons')]/button[contains(@class, 'ty-btn__secondary ty-btn')]
    @FindBy(xpath="//form[contains(@class, 'cm-ajax cm-ajax-full-render  cm-processed-form')]/div[contains(@class, 'ty-checkout-buttons')]/button[contains(@class, 'ty-btn__secondary ty-btn')]")
    private static WebElement clickContinuati;
    //button[@id='step_three_but']
    @FindBy(xpath="//button[@id='step_three_but']")
    private static WebElement clickContinuatii;
    @FindBy(xpath="//button[@id='place_order_tab1']")
    private static WebElement clickTrimiteComandaMea;

    //method
    public static void hoverSelectToateCategoriile(){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hoverOver).build().perform();
    }
    public static void pcPeriferice(){

        pcPeriferice.click();
    }
    public static void clickTastaturi(){

        clickTastaturi.click();
    }
    public static void selectOptionTastaturi(){

        selectOptionTastaturi.click();
    }
    public static void selectOptionTastaturi2(){

        selectOptionTastaturi2.click();
    }
    public static void selectOptionTastaturi3(){

        selectOptionTastaturi3.click();
    }
    public static void addToCart(){

        addToCart.click();
    }
    public static void clickOnCart(){

        clickOnCart.click();
    }
    public static void clickVizualizatiCosul(){

        clickVizualizatiCosul.click();
    }
    public static void clickOnfinalizareComanda(){

        clickOnfinalizareComanda.click();
    }
    public static void clickFinalizareComandaFaraInregistrare(){

        clickFinalizareComandaFaraInregistrare.click();
    }
    public static void inputPrenume(String value){

        inputPrenume.sendKeys(value);
    }
    public static void inputNume(String value){

        inputNume.sendKeys(value);
    }
    public static void inputEmail(String value){

        inputEmail.sendKeys(value);
    }
    public static void clickInputPhone(){

        inputPhone.click();
    }
    public static void inputPhone(String value){

        inputPhone.sendKeys(value);
    }
    public static void inputOras(String value){

        inputOras.sendKeys(value);
    }
    public static void inputAdresa(String value){

        inputAdresa.sendKeys(value);
    }
    public static void clickContinuati(){

        clickContinuati.click();
    }
    public static void clickContinuatii(){

        clickContinuatii.click();
    }
    public static void clickTrimiteComandaMea(){

        clickTrimiteComandaMea.click();
    }





}

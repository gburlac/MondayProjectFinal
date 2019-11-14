package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DarwinPage {

    //initializing

    private  static  final String URL ="https://darwin.md";


    public static void initialisePage(){

        Driver.getDriver().get(URL);

        PageFactory.initElements(Driver.getDriver(),DarwinPage.class);
    }

    //find elements
    //a[contains(@class, 'category_folded folded_hover')]/p[contains(@class, 'dropdown_text')]
    //a[contains(@class, 'category_folded folded_hover')]/i[contains(@class, 'icon-icon_apple')]
    //div[@class='links_side']//i[@class='icon-icon_apple']
    //*[@id="categorii"]/div[2]/div/div[1]/div[4]/a/p
    //*[@id="categorii"]/div[2]/div/div[1]/div[4]/a/i
    //*[@id="categorii"]/div[2]/div/div[1]/div[4]
    @FindBy(xpath="//*[@id=\"categorii\"]/div[2]/div/div[1]/div[4]")
    private static WebElement hoverOver;
    //*[@id="categorii"]/div[2]/div/div[1]/div[4]/div/div/div[2]/a[6]
    //div[4]/div[contains(@class, 'category_unfolded')]/div[contains(@class, 'content_area')]/div[contains(@class, 'category_box')][2]/a[6]/p[contains(@class, 'subcategory_item')]
    @FindBy(xpath="//div[4]/div[contains(@class, 'category_unfolded')]/div[contains(@class, 'content_area')]/div[contains(@class, 'category_box')][2]/a[6]/p[contains(@class, 'subcategory_item')]")
    private static WebElement chooseProductType;
    @FindBy(xpath="//label[@id='mfilter-opts-attribs-1-39-7fffe4f81cc10365684f8c3ef5dfc752']")
    private static WebElement selectOptin1;
    @FindBy(xpath="//label[@id='mfilter-opts-attribs-1-73-1f48ab473431b4299c353b953902edfc']")
    private static WebElement selectOptin2;
    @FindBy(xpath="//label[@id='mfilter-opts-attribs-1-17-9768feb3fdb1f267b06093bc572952dd']")
    private static WebElement selectOptin3;
    @FindBy(xpath="//h3[contains(@class, 'nume_produs_c_hom')]")
    private static WebElement selectProdus;
    @FindBy(xpath="//button[@id='button-cart']")
    private static WebElement clickCumpara;
    @FindBy(xpath="//input[@id='checkout_customer_main_email']")
    private static WebElement inputEmail;
    @FindBy(xpath="//input[@id='checkout_customer_main_firstname']")
    private static WebElement inputPrenume;
    @FindBy(xpath="//input[@id='checkout_customer_main_lastname']")
    private static WebElement inputNume;
    @FindBy(xpath="//input[@id='checkout_customer_main_telephone']")
    private static WebElement inputPhone;
    @FindBy(xpath="//input[@id='checkout_customer_main_address_1']")
    private static WebElement inputAdresa;
    //*[@id="simplecheckout_form"]/div[2]/div[2]/div/label
    //input[@id='terms']
    //div[contains(@class, 'box_round_cont')]/label
    @FindBy(xpath="//div[contains(@class, 'box_round_cont')]/label")
    private static WebElement clickSuntDeAccord;
    //*[@id="simplecheckout_button_confirm"]/span
    //button[@id='simplecheckout_button_confirm']
    @FindBy(xpath="//button[@id='simplecheckout_button_confirm']")
    private static WebElement clickCumparaButon;


    //method
    public static void hoverGoToAppleOption(){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hoverOver).build().perform();
    }
    public static void chooseProductType(){
        chooseProductType.click();
    }
    public static void selectOptin1(){
        selectOptin1.click();
    }
    public static void selectOptin2(){
        selectOptin2.click();
    }
    public static void selectOptin3(){
        selectOptin3.click();
    }
    public static void selectProdus(){
        selectProdus.click();
    }
    public static void clickCumpara(){
        clickCumpara.click();
    }
    public static void inputEmail(String value){

        inputEmail.sendKeys(value);
    }
    public static void inputPrenume(String value){

        inputPrenume.sendKeys(value);
    }
    public static void inputNume(String value){

        inputNume.sendKeys(value);
    }
    public static void inputPhone(String value){

        inputPhone.sendKeys(value);
    }
    public static void inputAdresa(String value){

        inputAdresa.sendKeys(value);
    }
    public static void clickSuntDeAccord() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(clickSuntDeAccord).click().build().perform();
        Thread.sleep(1000);
        clickSuntDeAccord.click();


    }
    public static void clickCumparaButon(){
        clickCumparaButon.click();
    }


}

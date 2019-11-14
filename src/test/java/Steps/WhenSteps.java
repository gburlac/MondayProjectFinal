package Steps;

import Pages.*;
import Util.Driver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class WhenSteps {

    @When("^I click on each page from top menu$")
    public void iClickOnEachPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       DiezPage.clickOnSocial();
    }

    @When("^I click on polica page from top menu$")
    public void iClickOnPolicaPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      DiezPage.clickOnPolitica();
    }

    @When("^I click on economie page from top menu$")
    public void iClickOnEconomiePageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnEconomie();
    }

    @When("^I click on educatie page from top menu$")
    public void iClickOnEducatiePageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       DiezPage.clickOnEducatie();
    }

    @When("^I click on oportunitati page from top menu$")
    public void iClickOnOportunitatiPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnOportunitati();
    }

    @When("^I click on evenimente page from top menu$")
    public void iClickOnEvenimentePageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnEvenimente();
    }

    @When("^I click on international page from top menu$")
    public void iClickOnInternationalPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnInternational();
    }

    @When("^I click on cultura page from top menu$")
    public void iClickOnCulturaPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       DiezPage.clickOnCultura();
    }

    @When("^I click on lifestyle page from top menu$")
    public void iClickOnLifestylePageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnLifestyle();
    }

    @When("^I click on calatorii page from top menu$")
    public void iClickOnCalatoriiPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnCalatorii();
    }

    @When("^I click on socialmedia page from top menu$")
    public void iClickOnSocialmediaPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnSocialmedia();
    }

    @When("^I click on sport page from top menu$")
    public void iClickOnSportPageFromTopMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.clickOnSport();
    }

    @When("^Go to Toate Categoriile menu$")
    public void goToToateCategoriileMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.hoverSelectToateCategoriile();
    }

    @And("^Go to PC si Periferice$")
    public void goToPCSiPeriferice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.pcPeriferice();
    }

    @And("^Click on Tastaturi$")
    public void clickOnTastaturi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.clickTastaturi();
        Thread.sleep(2000);
    }


    @And("^Select at least three options from the side menu$")
    public void selectAtLeastThreeOptionsFromTheSideMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.selectOptionTastaturi();
        Thread.sleep(2000);
        EnterPage.selectOptionTastaturi2();
        Thread.sleep(2000);
        EnterPage.selectOptionTastaturi3();
        Thread.sleep(2000);

    }

    @And("^Add a product to the cart$")
    public void addAProductToTheCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.addToCart();
        Thread.sleep(6000);

    }

    @And("^Click on the cart$")
    public void clickOnTheCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.clickOnCart();
    }

    @And("^Click Vizualizati cosul$")
    public void clickVizualizatiCosul() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.clickVizualizatiCosul();
    }

    @And("^Click Finalizare comanda$")
    public void clickFinalizareComanda() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.clickOnfinalizareComanda();
    }

    @And("^Click Finalizare comanda fara inregistrare$")
    public void clickFinalizareComandaFaraInregistrare() throws InterruptedException {

        EnterPage.clickFinalizareComandaFaraInregistrare();
        Thread.sleep(2000);
    }

    @And("^Complete the fields using a data table$")
    public void completeTheFieldsUsingADataTable(DataTable dt) {
        List<String> values=dt.asList(String.class);
        EnterPage.inputPrenume(values.get(0));
        EnterPage.inputNume(values.get(1));
        EnterPage.inputEmail(values.get(2));
        EnterPage.clickInputPhone();
        EnterPage.inputPhone(values.get(3));
        EnterPage.inputOras(values.get(4));
        EnterPage.inputAdresa(values.get(5));
    }

    @And("^Click Continuati$")
    public void clickContinuati() throws InterruptedException {
        Thread.sleep(2000);
        EnterPage.clickContinuati();
    }

    @And("^Click Continuatii$")
    public void clickContinuatii() throws InterruptedException {
        Thread.sleep(2000);
        EnterPage.clickContinuatii();
    }

    @And("^Click TRIMITE COMANDA MEA$")
    public void clickTRIMITECOMANDAMEA() {
        EnterPage.clickTrimiteComandaMea();
    }

    @When("^Go to Apple Option from menu$")
    public void goToAppleOptionFromMenu() throws InterruptedException {
       Thread.sleep(2000);
        DarwinPage.hoverGoToAppleOption();
    }

    @And("^Choose a product type$")
    public void chooseAProductType() throws InterruptedException {
        Thread.sleep(2000);
        DarwinPage.chooseProductType();
    }

    @And("^From the right menu select at least three options$")
    public void fromTheRightMenuSelectAtLeastThreeOptions() {
        DarwinPage.selectOptin1();
        DarwinPage.selectOptin2();
        DarwinPage.selectOptin3();
    }

    @And("^Select a product$")
    public void selectAProduct() throws InterruptedException {
    Thread.sleep(2000);
        DarwinPage.selectProdus();

    }

    @And("^Click cumpara$")
    public void clickCumpara() {
        DarwinPage.clickCumpara();
    }

    @And("^Complete the fields with a data table$")
    public void completeTheFieldsWithADataTable(DataTable dt) throws InterruptedException {
        List<String> values=dt.asList(String.class);
        DarwinPage.inputEmail(values.get(0));
        DarwinPage.inputPrenume(values.get(1));
        DarwinPage.inputNume(values.get(2));
        DarwinPage.inputPhone(values.get(3));
        DarwinPage.inputAdresa(values.get(4));
        Thread.sleep(2000);


    }

    @And("^Click cumpara buton$")
    public void clickCumparaButon() throws InterruptedException {
        Thread.sleep(5000);
        DarwinPage.clickSuntDeAccord();
        Thread.sleep(3000);
        DarwinPage.clickCumparaButon();
    }
}

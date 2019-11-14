package Steps;

import Util.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ThenSteps {

    @Then("^Check the message$")
    public void checkTheMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Social",messageCheck);

            }

    @Then("^Check the message on politica$")
    public void checkTheMessageOnPolitica() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Politică",messageCheck);
    }

    @Then("^Check the message on economie$")
    public void checkTheMessageOnEconomie() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Economie",messageCheck);
    }

    @Then("^Check the message on educatie$")
    public void checkTheMessageOnEducatie() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Educație",messageCheck);
    }

    @Then("^Check the message on oportunitati$")
    public void checkTheMessageOnOportunitati() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Oportunități",messageCheck);
    }

    @Then("^Check the message on evenimente$")
    public void checkTheMessageOnEvenimente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Evenimente",messageCheck);
    }

    @Then("^Check the message on international$")
    public void checkTheMessageOnInternational() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Internațional",messageCheck);
    }

    @Then("^Check the message on cultura$")
    public void checkTheMessageOnCultura() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Cultură",messageCheck);
    }

    @Then("^Check the message on lifestyle$")
    public void checkTheMessageOnLifestyle() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Lifestyle",messageCheck);
    }

    @Then("^Check the message on calatorii$")
    public void checkTheMessageOnCalatorii() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Călătorii",messageCheck);
    }

    @Then("^Check the message on socialmedia$")
    public void checkTheMessageOnSocialmedia() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Social Media / IT",messageCheck);
    }

    @Then("^Check the message on sport$")
    public void checkTheMessageOnSport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div [@class='title']")).getText();
        assertEquals("Sport",messageCheck);
    }

    @Then("^Check the success message$")
    public void checkTheSuccessMessage() {
        String messageCheck = Driver.getDriver().findElement(By.xpath("//div[contains(@class, 'ty-checkout-complete__order-success')]/p")).getText();
        assertTrue(messageCheck.contains("Felicitari! Comanda dumneavoastra a fost plasata cu succes."));
    }

    @Then("^Check the success message displayed$")
    public void checkTheSuccessMessageDisplayed() {
        String messageCheck = Driver.getDriver().findElement(By.xpath("//h1[@id='greetings_phraze']")).getText();
        assertTrue(messageCheck.contains("Vă felicităm cu achiziția!"));
    }
}



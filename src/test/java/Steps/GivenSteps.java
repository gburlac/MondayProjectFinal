package Steps;

import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import gherkin.lexer.Th;

public class GivenSteps {
    @Given("^I am on the Diez$")
    public void iAmOnTheDiez() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DiezPage.initialisePage();
        Thread.sleep(2000);

    }

    @Given("^I am on the EnterOnline page$")
    public void iAmOnTheEnterOnlinePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        EnterPage.initialisePage();
        Thread.sleep(2000);
    }

    @Given("^I am on the DarwinMd page$")
    public void iAmOnTheDarwinMdPage() throws InterruptedException {
        Thread.sleep(3000);
        DarwinPage.initialisePage();
        Thread.sleep(3000);
    }
}

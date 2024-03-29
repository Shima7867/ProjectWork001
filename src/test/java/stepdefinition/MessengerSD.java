package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.MessengerLoginPage;
import framework.webPages.MessengerPage;
import org.testng.Assert;

public class MessengerSD {

    private HomePage homePage = new HomePage();
    private MessengerPage messengerPage = new MessengerPage();
    private MessengerLoginPage messengerLoginPage = new MessengerLoginPage();

    @Given("^I am on messenger page$")
    public void setMessengerPage() {
        homePage.clickOnMessengerLink();
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.messenger.com/");
    }

    @When("^I enter (.+) into (username|password|firstname|lastname|mobile number|new password) field on messenger page$")
    public void enterDataIntoTextFields(String value, String textFields){

        switch(textFields){
            case "username":
                messengerPage.enterEmail(value);
                break;
            case "password":
                messengerPage.enterPassword(value);
                break;


        }

    }

    @When("^I click on (login|submit|signup) button on messenger page$")
    public void clickOnLoginButton(String button){

        switch (button){
            case "signup":
                messengerPage.clickOnSignupButton();
                break;
        }

    }

    @Then("^I verify invalid login message on signup page$")
    public void verifySignUpErrorMessage() {
        Assert.assertEquals(messengerLoginPage.getErrorMessage(), "Incorrect Email");
    }





}

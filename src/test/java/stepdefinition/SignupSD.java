package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.SignupLoginPage;
import org.testng.Assert;


public class SignupSD {

    private HomePage homePage = new HomePage();
    private SignupLoginPage signupLoginPage = new SignupLoginPage();

    @Given("^I am on facebook home page$")
    public void iAmOnFacebookHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

//
//
    @When("^I enter (.+) into (firstname|lastname|mobile number|new password) text fields on facebook home screen$")
    public void enteringData(String value, String text) {

        switch (text) {
            case "firstname":
                signupLoginPage.enterFirstName(value);
                break;
            case "lastname":
                signupLoginPage.enterLastName(value);
                break;
            case "mobile number":
                signupLoginPage.enterMobileNumber(value);
                break;
            case "new password":
                signupLoginPage.enterNewPassword(value);
                break;
        }
    }
//
    @When("^I enter (.+) into mobile number text fields on home screen")
    public void incorrectEmail(String value){
        signupLoginPage.enterMobileNumber(value);
    }

    @When("^I click on signup button on home screen$")
    public void clickOnLoginButton(String button) {
                signupLoginPage.clickOnsignupButton();
    }


    @Then("^I verify invalid signup error message$")
    public void verifySignUpErrorMessageForEmail() {
        Assert.assertEquals(signupLoginPage.getErrorMesForWrongEmail(), "Please enter a valid mobile number or email address.");
    }

    @Then("^I verify gender (female|male) is selected$")
    public void genderValidation(String gender) {

        if (gender.equals("female")) {
            if (!homePage.isGenderFemaleSelected()) {
                homePage.clickOnFemaleGender();
            }
            Assert.assertTrue(homePage.isGenderFemaleSelected());
        } else if (gender.equals("male")) {
            if (!homePage.isGenderMaleSelected()) {
                homePage.clickOnMaleGender();
            }
            Assert.assertTrue(homePage.isGenderMaleSelected());
        }
    }
}




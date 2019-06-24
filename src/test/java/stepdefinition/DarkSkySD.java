package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyApiPage;
import framework.webPages.DarkSkyLoginPage;
import framework.webPages.DarkSkySignupPage;
import org.testng.Assert;

public class DarkSkySD{

    private DarkSkyLoginPage darkSkyLoginPage = new DarkSkyLoginPage();
    private DarkSkyApiPage darkSkyApiPage = new DarkSkyApiPage();
    private DarkSkySignupPage darkSkySignupPage = new DarkSkySignupPage();

    @Given("^I am on DarkSky Home Page$")
    public void iAmOnDarkSkyHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY", "Error title");
    }


    @When("^I am on the darkSky Register page$")
    public void iAmOnDarkskyRegisterPage() throws InterruptedException {
        darkSkyApiPage.clickOnDarkSkyApiLink();
        darkSkySignupPage.clickOnSignUpLink();
        Thread.sleep(2000);
    }


    @When("^I click on Register button$")
    public void clickOnRegisterButton() throws InterruptedException {
        darkSkyLoginPage.clickOnRegisterButton();
        Thread.sleep(2000);
    }

    @Then("^I verify invalid register page \"Fill out this field\"$")
    public void verifyRegisterPage() throws InterruptedException {
        Assert.assertEquals(darkSkyLoginPage.getRegisterButton(), "REGISTER", "Error register page");
        Thread.sleep(2000);

    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTempGreat()throws InterruptedException{
        Thread.sleep(2000);
        darkSkyLoginPage.verifyCurrentTemp();
    }

    @When("^I expand today's timeline$")
    public void iExpandTodaysTimeline() throws InterruptedException {
        darkSkyLoginPage.scrollUpto(0, 650);
        Thread.sleep(2000);
        darkSkyLoginPage.clickOnTodayLink();
        Thread.sleep(2000);

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyLowestAndHighest(){
        darkSkyLoginPage.iVerifyLowestAndHighestTempIsDisplayed();

    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void timelineIsDisplayedTwoHoursIncremented() throws InterruptedException {
        darkSkyLoginPage.verifyTimelineIsDisplayedCorrectFormat();
        darkSkyLoginPage.verifyTimelineIsDisplayedCorrectFormat2();
        Thread.sleep(2000);
        Assert.assertEquals(darkSkyLoginPage.verifyTimelineIsDisplayedCorrectFormat(), darkSkyLoginPage.verifyTimelineIsDisplayedCorrectFormat2(), "Expected time not found");

    }

}






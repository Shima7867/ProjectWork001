package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkySignupPage extends BasePage{

    private By signUpLink = By.xpath("//a[@class='button filled']");

    public void clickOnSignUpLink() {
        clickOn(signUpLink);
    }

}

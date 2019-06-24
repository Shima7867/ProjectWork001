package framework.webPages;

import org.openqa.selenium.By;

public class SignupLoginPage extends BasePage {

    private By firstNameTextField = By.id("u_0_e");
    private By lastNameTextField = By.id("u_0_g");
    private By mobileNumberTextField = By.id("u_0_j");
    //private By newPasswordTextField = By.id("u_0_q");
    private By newPasswordTextField = By.xpath("//input[@id='u_0_q']");
    private By signupButton = By.id("u_0_y");
   // private By errorMesForWrongEmail = By.xpath("//div[@id='js_3b']");
    private By errorMesForWrongEmail = By.xpath("//div[text()='Please enter a valid mobile number or email address.']");
    private By femaleGender = By.id("u_0_9");
    private By maleGender = By.id("u_0_a");




    public void enterFirstName(String firstName) {
        setValue(firstNameTextField, firstName);
    }

    public void enterLastName(String lastName) {
        setValue(lastNameTextField, lastName);
    }

    public void enterMobileNumber(String mobileNum) {
        setValue(mobileNumberTextField, mobileNum);
    }

    public void enterNewPassword(String password) {
        setValue(newPasswordTextField, password);
    }

    public void clickOnPassword(){
        clickOn(newPasswordTextField);
    }

    public void clickOnsignupButton() { clickOn(signupButton); }

    public String getErrorMesForWrongEmail(){ return getTextFromElement(errorMesForWrongEmail);}

    public void clickOnFemaleGender() {
        clickOn(femaleGender);
    }

    public void clickOnMaleGender() {
        clickOn(maleGender);
    }


}

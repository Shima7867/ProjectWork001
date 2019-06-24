package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyApiPage extends BasePage {

    private By darkSkyApiLink = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");

    public void clickOnDarkSkyApiLink() {
        clickOn(darkSkyApiLink);
    }
}

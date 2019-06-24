package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.*;

public class DarkSkyLoginPage extends BasePage {

    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By currentTemperature = By.xpath("//span[@class='summary swap']");
    private By allTemperature = By.xpath("//div[@class='temps']/child :: span");
    private By todayLink = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1]");
    private By minimumTemp = By.xpath("//span[@class='minTemp']");
    private By maximumTemp = By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) a.day.revealed:nth-child(2) span.tempRange > span.maxTemp");
    private By lowestTemp = By.xpath("//span[@class='temp']");
    private By higestTemp = By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) div.dayDetails.revealed:nth-child(3) div.summary_container div.dayExtras div.highLowTemp.swip span.lowTemp.swap > span.temp");
    private By timeFromWeb = By.xpath("//div[@id='timeline']//div[@class='hours']/*/span");


    public void clickOnRegisterButton() {
        clickOn(registerButton);
    }

    public String getRegisterButton() {
        return getTextFromElement(registerButton);
    }

    public String getCurrentTemparature() {
        return getTextFromElement(currentTemperature);
    }

    public List<WebElement> getAllTemps() {
        return webActions(allTemperature);
    }

    public void verifyCurrentTemp() {
        String currentTemp = getCurrentTemparature();
        int todayTemp = Integer.parseInt(currentTemp.substring(0, 2));

        ArrayList<String> list = new ArrayList<>();
        List<WebElement> allTemperature = getAllTemps();

        for (WebElement lists : allTemperature) {
            list.add(lists.getText().substring(0, lists.getText().length() - 1));
        }
        Collections.sort(list);
        String highTemp = Collections.max(list);
        int highestTemp = Integer.parseInt(highTemp);

        String lowTemp = Collections.min(list);
        int lowestTemp = Integer.parseInt(lowTemp);

        System.out.println("Current Temperature:" + todayTemp);
        System.out.println("Highest Temperature:" + highestTemp);
        System.out.println("Lowest Temperature:" + lowestTemp);

        boolean isCurrentTemGreaterOrLesser = true;

        if (todayTemp > highestTemp || todayTemp < lowestTemp) {
            isCurrentTemGreaterOrLesser = false;
        }

        Assert.assertTrue(isCurrentTemGreaterOrLesser);
    }


    public void clickOnTodayLink() {
        clickOn(todayLink);
    }

    public String getMinimumTemp() {
        return getTextFromElement(minimumTemp);
    }

    public String getMaximumTemp() {
        return getTextFromElement(maximumTemp);
    }

    public String getLowestTemp() {
        return getTextFromElement(lowestTemp);
    }

    public String getHighestTemp() {
        return getTextFromElement(higestTemp);
    }


    public void iVerifyLowestAndHighestTempIsDisplayed() {
        String minimumTemp = getMinimumTemp();
        String maximumTemp = getMaximumTemp();
        String lowestTemp = getLowestTemp();
        String highestTemp = getHighestTemp();
        Assert.assertEquals(minimumTemp, lowestTemp);
        Assert.assertEquals(maximumTemp, highestTemp);

        System.out.println("The expected minimum tem:" + minimumTemp + " and the actual lowest tem:" + lowestTemp);
        System.out.println("The expected maximum tem:" + maximumTemp + " and the actual highest tem:" + highestTemp);

    }

    public List<WebElement> getTime() {
        return SharedSD.getDriver().findElements(timeFromWeb);
    }

    public List verifyTimelineIsDisplayedCorrectFormat() {
        List<WebElement> elements = getTime();
        List<String> websiteTime = new ArrayList();
        for(int i= 0; i<=11; i++){
            String time = elements.get(i).getText().toUpperCase();
            websiteTime.add(time);
        }
        System.out.println("Time from web " + websiteTime);
        return websiteTime;
    }

    public List verifyTimelineIsDisplayedCorrectFormat2(){
        List<String> currentTime = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        currentTime.add("NOW");
        int twoHours = 11;
        for (int i = 0; i < twoHours;) {
            calendar.add(Calendar.HOUR_OF_DAY, 2);
            currentTime.add(sdf.format(calendar.getTime()));
            i ++;
        }
        System.out.println("Current time " + currentTime);
        return currentTime;
    }
}



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultsPage {

    ElementHelper elementHelper;

    By shareIcon = By.id("com.sahibinden:id/action_share");

    public ResultsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkShareIcon() {
        elementHelper.checkElement(shareIcon);
    }


}

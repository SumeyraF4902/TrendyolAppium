package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiDemosPage {

    ElementHelper elementHelper;

    By googleIcon = By.id("android:id/action_bar");

    public ApiDemosPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkApiDemosPageOpen() {
        elementHelper.checkElement(googleIcon);
    }


}

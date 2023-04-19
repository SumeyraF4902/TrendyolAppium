package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By loginLogo = By.id("com.sahibinden:id/action_account");
    By tabs = By.id("com.sahibinden:id/main_page_category_name");
    By price = AppiumBy.androidUIAutomator("new UiSelector().text(\"11.000 TL\")");


    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginLogo() {
        elementHelper.checkElement(loginLogo);
    }

    public void clickTab(String tab) {
        //elementHelper.click(price);
        elementHelper.clickElementWithText(tabs, tab);
    }


}

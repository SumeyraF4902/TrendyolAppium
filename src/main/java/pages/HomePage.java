package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By loginLogo = By.id("com.sahibinden:id/action_account");
    By tabs = By.id("com.sahibinden:id/main_page_category_name");

    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginLogo() {
        elementHelper.checkElement(loginLogo);
    }

    public void clickTab(String tab) {
        elementHelper.clickElementWithText(tabs,tab);
    }


}

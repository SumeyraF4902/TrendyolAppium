package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PopupPage {

    ElementHelper elementHelper;

    By buttons = By.className("android.widget.Button");

    public PopupPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickButton(String button) {
        elementHelper.clickElementWithText(buttons, button);
    }


}

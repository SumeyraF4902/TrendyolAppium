package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RadioButtonPage {
    ElementHelper elementHelper;


    By title = By.className("android.widget.TextView");
    By radioButtons = By.className("android.widget.RadioButton");
    By clearButton = By.id("io.appium.android.apis:id/clear");
    By selectedText = By.id("io.appium.android.apis:id/choice");

    public RadioButtonPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String getTitle() {
        return elementHelper.getText(title);
    }

    public void checkRadioButton(String button) {
        elementHelper.checkElementWithText(radioButtons, button);
    }

    public String getClearButton() {
        return elementHelper.getText(clearButton);
    }

    public void clickRadioButton(String button) {
        elementHelper.clickElementWithText(radioButtons, button);
    }

    public String getSelectedText() {
        return elementHelper.getText(selectedText);
    }
}

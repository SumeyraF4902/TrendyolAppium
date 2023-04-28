package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PopupMenuPage {
    ElementHelper elementHelper;


    By title =By.className("android.widget.TextView");
    By makePopupButton=By.className("android.widget.Button");
    By popupElements=By.id("android:id/title");
    By popupTitle=By.id("android:id/title");

    public PopupMenuPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public String getTitle() {
        return elementHelper.getText(title);
    }

    public String getMakePopupButtonText( ) {
        return elementHelper.getText(makePopupButton);


    }

    public void clickMakePoopupButton() {
        elementHelper.click(makePopupButton);
    }

    public void checkPopupElement(String popupElement) {
        elementHelper.checkElementWithText(popupElements, popupElement);
    }

    public void clickPopupElement(String popupElement) {
        elementHelper.clickElementWithText(popupElements, popupElement);
    }

    public String getPopupTitle() {
        return elementHelper.getText(popupTitle);
    }
}

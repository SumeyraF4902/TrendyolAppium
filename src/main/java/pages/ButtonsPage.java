package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ElementHelper;

import java.util.List;

public class ButtonsPage {
    ElementHelper elementHelper;


    By title = AppiumBy.androidUIAutomator("new UiSelector().text(\"Views/Buttons\")");

    By button=By.id("android:id/action_bar");
    By normalButton= By.id("io.appium.android.apis:id/button_normal");

    By smallButton=By.id("io.appium.android.apis:id/button_small");
    By switchButton=By.id("io.appium.android.apis:id/button_toggle");

    public ButtonsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    public String getTitle() {
       return elementHelper.getText(title);
    }
    public void checkButtonsPage() {
        elementHelper.checkElement(button);
    }

    public String getTextNormalButton() {
          return  elementHelper.getText(normalButton);
    }

    public String getTextSmaIlButton() {
        return  elementHelper.getText(smallButton);
    }

    public String getTextSwitchButton() {

        return  elementHelper.getText(switchButton);
    }

    public void clickSwictchButton() {
        elementHelper.click(switchButton);
    }
}

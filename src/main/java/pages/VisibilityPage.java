package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class VisibilityPage {
    ElementHelper elementHelper;


    By title = By.id("android:id/action_bar");
    By searchButton = By.className("android.widget.LinearLayout");
    By result= By.id("io.appium.android.apis:id/victim");



    public VisibilityPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String checkViewsVisibility() {
      return elementHelper.getText(title);
    }

    public void getElement(String text) {
      elementHelper.checkElementWithText(searchButton,text);
    }

    public void clickbuton(String buton) {
        elementHelper.clickElementWithText(searchButton,buton);
    }

    public String getResult() {
       return elementHelper.getText(result);

    }
}

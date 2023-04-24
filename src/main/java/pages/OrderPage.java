package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderPage {

    ElementHelper elementHelper;

    By options = By.id("android:id/text1");

    public OrderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickOption(String option) {
        elementHelper.clickElementWithText(options,option);
    }
}

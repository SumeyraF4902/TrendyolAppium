package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By title = By.id("android:id/action_bar");
    By categories=By.id("android:id/text1");

    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkCategoriesPage() {
        elementHelper.checkElement(title);
    }

    public void clickCategory(String catogary) {
        elementHelper.clickElementWithText(categories, catogary);
    }
}

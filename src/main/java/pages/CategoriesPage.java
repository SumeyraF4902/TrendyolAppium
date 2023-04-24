package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By tabs = By.id("com.sahibinden:id/util_primary_text");
    By closeButton = By.xpath("//android.widget.FrameLayout/android.widget.ImageView[2]");


    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickTab(String tab) {
        elementHelper.clickElementWithText(tabs, tab);
    }

    public void clickCloseButton() {
        elementHelper.click(closeButton);
    }


}

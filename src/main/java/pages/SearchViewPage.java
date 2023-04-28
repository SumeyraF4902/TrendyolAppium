package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchViewPage {
    ElementHelper elementHelper;


    By title = By.id("android:id/action_bar_title");
    By searchButton = By.id("io.appium.android.apis:id/action_search");
    By searchArea = By.id("android:id/search_src_text");
    By quaryText = By.id("io.appium.android.apis:id/txt_query");


    public SearchViewPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String searchViewTitle() {
        return elementHelper.getText(title);
    }

    public void clickSearch() {
        elementHelper.click(searchButton);
    }

    public void sendKeysToSearchArea(String name) {

        elementHelper.sendKeys(searchArea, name);
        elementHelper.pressEnter();
    }

    public void checkSearchButton() {
        elementHelper.checkElement(searchButton);
    }
    public String searchResult() {
       return elementHelper.getText(quaryText);
    }
}

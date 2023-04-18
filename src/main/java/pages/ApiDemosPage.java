package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiDemosPage {

    ElementHelper elementHelper;

    By actionBar = By.id("android:id/action_bar");
    By title = By.xpath("//*[@resource-id=\"android:id/action_bar\"]/android.widget.TextView");
    By tab_App = By.xpath("//android.widget.TextView[@content-desc=\"App\"]");
    By tab_actionBar = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]");
    By tab_actionBarUsage = By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Usage\"]");
    By tabs_list = By.id("android:id/text1");
    By tab_touchPaint = MobileBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Touch Paint\"))");
    By tab_touchPaint2 = By.xpath("//android.widget.TextView[@content-desc=\"Touch Paint\"]");


    public ApiDemosPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkApiDemosPageOpen() {
        elementHelper.checkElement(actionBar);
    }

    public String getApiDemosTitle() {
        return elementHelper.getText(title);
    }

    public void clickAppTab() {
        elementHelper.click(tab_App);
    }

    public void clickActionBarTab() {
        elementHelper.click(tab_actionBar);
    }

    public void clickActionBarUsageTab() {
        elementHelper.click(tab_actionBarUsage);
    }

    public void clickTab(String text) {
        elementHelper.clickElementWithText(tabs_list, text);
    }

    public void clickTouchPaintTab() {
        elementHelper.click(tab_touchPaint);
    }

    public void clickTouchPaintTab2() {
        elementHelper.scroll();
        elementHelper.click(tab_touchPaint2);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ActionBarUsagePage {

    ElementHelper elementHelper;

    By searchBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Ara\"]");
    By textBox = By.id("android:id/search_src_text");
    By textArea = By.xpath("//*[@resource-id=\"android:id/content\"]/android.widget.TextView");


    public ActionBarUsagePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickSearchButton() {
        elementHelper.click(searchBtn);
    }

    public void sendKeysSearchArea(String text) {
        elementHelper.sendKeys(textBox, text);
    }

    public String getTextTextArea() {
        return elementHelper.getText(textArea);
    }


}

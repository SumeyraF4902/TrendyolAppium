package utils;

import com.mongodb.annotations.ThreadSafe;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        String time = ConfigReader.getProperty("wait");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(time)));
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void checkElement(By locator) {
        findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public String getText(By locator) {
        return findElement(locator).getText();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    public void clickElementWithText(By locator, String text) {
        boolean check = false;
        List<WebElement> elementList = findElements(locator);
        for (WebElement elem : elementList) {
            if (elem.getText().equals(text)) {
                check = true;
                elem.click();
                break;
            }
        }
        Assert.assertTrue(check, "Listede istediğin textteki elamanı bulamadım!!!");
    }

    public void scroll() {
    }


}

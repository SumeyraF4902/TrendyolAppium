package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class ElementHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementHelper(WebDriver driver) {
        String time = ConfigReader.getProperty("wait");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(time)));
    }

    public WebElement findElement(By locator) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            return scroll(locator).get(0);
        }

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
        int i = 0;
        boolean check = false;
        findElement(locator);
        while (i < 4) {
            List<WebElement> elementList = findElements(locator);
            for (WebElement elem : elementList) {
                if (elem.getText().equals(text)) {
                    check = true;
                    elem.click();
                    break;
                }
            }
            if (check) {
                break;
            } else {
                scrollDown();
                i++;
            }
        }
        Assert.assertTrue(check, "Listede istediğin textteki elamanı bulamadım!!!");
    }

    public List<WebElement> scroll(By by) {
        int i = 0;
        String previusPageSource = ".";
        while (checkElemenEnabled(by) && i < 5 && checkEndOfPage(previusPageSource)) {
            i++;
            previusPageSource = driver.getPageSource();
            scrollDown();
        }
        return driver.findElements(by);
    }

    public boolean checkEndOfPage(String previusPageSource) {
        return !previusPageSource.equals(driver.getPageSource());
    }

    public boolean checkElemenEnabled(By by) {
        return driver.findElements(by).isEmpty();
    }

    public void scrollDown() {
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = driver.manage().window().getSize().getHeight() / 2;
        int endx = driver.manage().window().getSize().getWidth() / 2;
        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);


        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 0);
        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endx, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        ((RemoteWebDriver) driver).perform(List.of(scroll));
    }


}

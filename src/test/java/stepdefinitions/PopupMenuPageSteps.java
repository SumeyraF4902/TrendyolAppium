package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.PopupMenuPage;
import utils.DriverManager;

public class PopupMenuPageSteps {
    PopupMenuPage popupMenuPage = new PopupMenuPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Then("should see Title {string} on Popup Menu Page")
    public void shouldSeeTitleOnPopupMenuPage(String title) {   //popuppage sayfasında oldugunu dogrula
        String currentTitle = popupMenuPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }

    @Given("user is on the Popup Menu Page")
    public void userIsOnThePopupMenuPage() {  // views vw popup menuyü tıkla
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Popup Menu");


    }

    @Then("should Make Popup Button {string} on Popup Menu Page")
    public void shouldMakePopupButtonOnPopupMenuPage(String button) {//Make a popup yazısını doğrula
        String currentButon=popupMenuPage.getMakePopupButtonText();
        Assert.assertEquals(currentButon,button);
    }

    @When("taps Make Popup Button on Popup Menu Page")
    public void tapsMakePopupButtonOnPopupMenuPage()
    {  //Make a popup yazısını tıkla
        popupMenuPage.clickMakePoopupButton();
    }

    @Then("should see Popup Element {string} on Popup Menu Page")
    public void shouldSeePopupElementOnPopupMenuPage(String popupElement) {//make a popup elementlerini kontrol et
        popupMenuPage.checkPopupElement(popupElement);
    }

    @When("taps Popup Element {string} on Popup Menu Page")
    public void tapsPopupElementOnPopupMenuPage(String popupElement) { //make a popup elementlerini tıkla
        popupMenuPage.clickPopupElement(popupElement);
    }

    @Then("should see Popup Menu Tite {string} on Popup Menu Page")
    public void shouldSeePopupMenuTiteOnPopupMenuPage(String title) {// edit tıklandığında share logosunu doğrula
        String curretTitle = popupMenuPage.getPopupTitle();
        Assert.assertEquals(curretTitle, title);

    }



}

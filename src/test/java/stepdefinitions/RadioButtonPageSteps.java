package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.RadioButtonPage;
import utils.DriverManager;

public class RadioButtonPageSteps {
    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Then("should see Title {string} on Radio Button Page")   //kullanıcı Radyo Düğmesi Sayfasında olduğunu dogrula
    public void shouldSeeTitleOnRadioButtonPage(String title) {
        String currentTitle = radioButtonPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }


    @Given("user is on the Radio Button Page")  //kullanıcı Radyo Düğmesi Sayfasında
    public void userIsOnTheRadioButtonPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Radio Group");
    }



    @Then("should see Radio Button {string} on Radio Button Page")  //Radyo Düğmesi Sayfasında {string} Radyo Düğmesini görmeli
    public void shouldSeeRadioButtonOnRadioButtonPage(String radioButton) {
        radioButtonPage.checkRadioButton(radioButton);
    }

    @Then("should see Clear Button {string} on Radio Button Page")  //Radyo Düğmesi Sayfasında {string} Radyo Düğmesini görmeli doogrulama yapabilirim
    public void shouldSeeClearButtonOnRadioButtonPage(String button) {
        String currentButton = radioButtonPage.getClearButton();
        Assert.assertEquals(currentButton, button);
    }

    @When("taps to Radio Button {string} on Radio Button Page")
    public void tapsToRadioButtonOnRadioButtonPage(String radioButton) {  //Radyo   Düğmesi Sayfasında {string} Radyo Düğmesini tıklamalı
        radioButtonPage.clickRadioButton(radioButton);
    }

    @Then("should see Selected Text {string} on Radio Button Page")  // tıklama islemi sonunda çıkan rakamı kontrol etmeli
    public void shouldSeeSelectedTextOnRadioButtonPage(String text) {
        String currentText = radioButtonPage.getSelectedText();
        Assert.assertTrue(currentText.contains(text));
    }
}
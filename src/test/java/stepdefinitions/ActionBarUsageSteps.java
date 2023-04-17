package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ActionBarUsagePage;
import utils.DriverManager;

public class ActionBarUsageSteps {

    ActionBarUsagePage actionBarUsagePage = new ActionBarUsagePage(DriverManager.getDriver());

    @When("Search butonuna tıklanır")
    public void searchButonunaTıklanır() {
        actionBarUsagePage.clickSearchButton();
    }

    @When("Search alanına {string} yazılır")
    public void searchAlanınaYazılır(String text) {
        actionBarUsagePage.sendKeysSearchArea(text);
    }

    @Then("Text area {string} değerini içeriyormu kontrol edilir")
    public void textAreaDeğeriniIçeriyormuKontrolEdilir(String text) {
        String degisken = actionBarUsagePage.getTextTextArea();
        Assert.assertTrue(degisken.contains(text));
    }

}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.PopupMenuPage;
import pages.SwitchesPage;
import utils.DriverManager;

public class SwitchesPageSteps {
    SwitchesPage switchesPage= new SwitchesPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Then("should see Title {string} on Popup Menu Page")
    public void shouldSeeTitleOnPopupMenuPage(String title) {   //popuppage sayfasında oldugunu dogrula
    //    String currentTitle = switchesPage.getTitle();
      //  Assert.assertEquals(currentTitle, title);
    }

    @Then("should see Switches Page")
    public void shouldSeeSwitchesPage() {

    }

    @Given("user is on the Switches Page")
    public void userIsOnTheSwitchesPage() {
    }

    @Then("should see Defaults Switch On on Switches Page")
    public void shouldSeeDefaultsSwitchOnOnSwitchesPage() {
    }

    @When("taps to Defaults Switch on Switches Page")
    public void tapsToDefaultsSwitchOnSwitchesPage() {
    }

    @Then("should see Defaults Switch Off on Switches Page")
    public void shouldSeeDefaultsSwitchOffOnSwitchesPage() {
    }
}

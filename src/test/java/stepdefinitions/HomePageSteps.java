package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @Given("user should see the Home Page")
    public void userShouldSeeTheHomePage() {
        homePage.checkLoginLogo();
    }

    @When("taps {string} on Home Page")
    public void tapsOnHomePage(String tab) {
        homePage.clickTab(tab);
    }

}
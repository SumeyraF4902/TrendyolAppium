package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());

    @Then("should see Results on Result Page")
    public void shouldSeeResultsOnResultPage() {
        resultsPage.checkShareIcon();
    }

    @When("taps filters on Result Page")
    public void tapsFiltersOnResultPage() {
        resultsPage.clickFilters();
    }

    @When("taps order on Result Page")
    public void tapsOrderOnResultPage() {
        resultsPage.clickOrder();
    }

    @Then("should see first car price lower than or equals {string} on Result Page")
    public void shouldSeeFirstCarPriceLowerThanOrEqualsOnResultPage(String price) {
        String currentPrice = resultsPage.getFirstOrderPrice();
        Assert.assertTrue(currentPrice.equals(price));
    }
}
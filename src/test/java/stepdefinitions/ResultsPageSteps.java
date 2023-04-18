package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());

    @Then("should see Results on Result Page")
    public void shouldSeeResultsOnResultPage() {
        resultsPage.checkShareIcon();
    }
}
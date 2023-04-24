package stepdefinitions;

import io.cucumber.java.en.When;
import pages.CategoriesPage;
import pages.FiltersPage;
import utils.DriverManager;

public class FiltersPageSteps {
    FiltersPage filtersPage = new FiltersPage(DriverManager.getDriver());

    @When("taps {string} on Filters Page")
    public void tapsOnFiltersPage(String filter) {
        filtersPage.clickFilter(filter);
    }

    @When("taps {string} button on Filters Page")
    public void tapsButtonOnFiltersPage(String okay) {
        filtersPage.clickOkayButton(okay);
    }

    @When("taps Show Results Button on Filters Page")
    public void tapsShowResultsButtonOnFiltersPage() {
        filtersPage.clickShowResults();
    }

    @When("sendkeys Max Price {string} on Filters Page")
    public void sendkeysMaxPriceOnFiltersPage(String price) {
        filtersPage.sendKeysMaxPrice(price);
    }
}

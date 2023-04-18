package stepdefinitions;

import io.cucumber.java.en.When;
import pages.CategoriesPage;
import utils.DriverManager;

public class CategoriesPageSteps {
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @When("taps {string} on Categories Page")
    public void tapsOnCategoriesPage(String tab) {
        categoriesPage.clickTab(tab);
    }

}
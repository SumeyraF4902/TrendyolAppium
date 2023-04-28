package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CategoriesPage;
import utils.DriverManager;

public class CategoriesPageSteps {
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Given("user should see the Categories Page")
    public void userShouldSeeTheCategoriesPage() {
        categoriesPage.checkCategoriesPage();

    }

    @When("taps {string} on Categories Page")
    public void tapsOnCategoriesPage(String catogary) {
        categoriesPage.clickCategory(catogary);
    }





}
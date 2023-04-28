package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.RadioButtonPage;
import pages.SearchViewPage;
import utils.DriverManager;

public class SearchViewSteps {

    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());
    SearchViewPage searchViewPage=new SearchViewPage(DriverManager.getDriver());

    @Then("should see Title {string} on Search View   Page")
    public void shouldSeeTitleOnSearchViewPage(String title) {
        String currentTitle = searchViewPage.searchViewTitle();
        Assert.assertEquals(currentTitle, title);
    }
    @Given("user is on the Search View Page")  ////kullanıcı Search View Page gitmeli
    public void userIsOnTheSearchViewPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Search View");
        categoriesPage.clickCategory("Action Bar");
    }
    @Then("should see Search Button on Search View Page")  //Search View Page Sayfasında olduğunu dogrula
    public void shouldSeeSearchButtonOnSearchViewPage() {
        searchViewPage.checkSearchButton();
    }

    @When("taps to Search Button on Search View Page")  //Arama butonuna tıklar
    public void tapsToSearchButtonOnSearchViewPage() {
        searchViewPage.clickSearch();
    }

    @When("sendkeys to Search Area {string} on Search View Page")
    public void sendkeysToSearchAreaOnSearchViewPage(String name) {
        searchViewPage.sendKeysToSearchArea(name);
    }

    @Then("should see Result {string} on Search View Page")
    public void shouldSeeResultOnSearchViewPage(String result) {
        String nameSearch = searchViewPage.searchResult();
        Assert.assertEquals(nameSearch,result);

    }


}

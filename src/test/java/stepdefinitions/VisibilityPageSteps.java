package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.VisibilityPage;
import utils.DriverManager;

public class VisibilityPageSteps {
    CategoriesPage categoriesPage=new CategoriesPage(DriverManager.getDriver());
    VisibilityPage visibilityPage = new VisibilityPage(DriverManager.getDriver());


    @Then("should see {string} Visibility Page")
    public void shouldSeeVisibilityPage(String title) {
        String currentTitle= visibilityPage.checkViewsVisibility();
        Assert.assertEquals(currentTitle, title);

    }

    @Given("user is on the Visibility Page")
    public void userIsOnTheVisibilityPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Visibility");

    }

    @Then("should see View Text {string} on Visibility Page")
    public void shouldSeeViewTextOnVisibilityPage(String textButon) {
      visibilityPage.getElement(textButon);

    }

    @Then("should see Buttons {string} on Visibility Page")
    public void shouldSeeButtonsOnVisibilityPage(String textButon) {
        visibilityPage.getElement(textButon);

    }

    @When("taps to Buttons {string} on Visibility Page")
    public void tapsToButtonsOnVisibilityPage(String buton) {
        visibilityPage.clickbuton(buton);
    }

    @Then("should not see View Text {string} on Visibility Page")
    public void shouldNotSeeViewTextOnVisibilityPage(String resullt) {
      String text = visibilityPage.getResult();
      Assert.assertEquals(text, resullt);


    }


}

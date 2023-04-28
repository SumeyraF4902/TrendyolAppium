package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ButtonsPage;

import pages.CategoriesPage;
import utils.DriverManager;

public class ButtonsPageSteps {
  ButtonsPage buttonsPage=new ButtonsPage(DriverManager.getDriver());
  CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


  @Then("should see Title  {string} on ButtonsPage")
  public void shouldSeeTitleOnButtonsPage(String title) {
    String curentTitle=buttonsPage.getTitle();
    Assert.assertEquals(curentTitle, title);
  }

  @Given("user is on the Buttons Page")
  public void userIsOnTheButtonsPage() {
    categoriesPage.clickCategory("Views");
    categoriesPage.clickCategory("Buttons");
    buttonsPage.checkButtonsPage();
  }

  @Then("should Normal Button {string} on Buttons Page")
  public void shouldNormalButtonOnButtonsPage(String button) {
    String currentButton=buttonsPage.getTextNormalButton();
    Assert.assertEquals(currentButton,button);

  }

  @Then("should Small Button {string} on Buttons Page")
  public void shouldSmallButtonOnButtonsPage(String button) {
    String currentButton=buttonsPage.getTextSmaIlButton();
    Assert.assertEquals(currentButton,button);
  }

  @Then("should Switch Button {string} on Buttons Page")
  public void shouldSwitchButtonOnButtonsPage(String button) {
    String currentButton=buttonsPage.getTextSwitchButton();
    Assert.assertEquals(currentButton,button);
  }

  @When("taps Switch Button on Buttons Page")
  public void tapsSwitchButtonOnButtonsPage() {
    buttonsPage.clickSwictchButton();
  }
}

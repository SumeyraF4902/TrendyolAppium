package stepdefinitions;

import io.cucumber.java.en.When;
import pages.OrderPage;
import utils.DriverManager;

public class OrderPageSteps {
    OrderPage orderPage = new OrderPage(DriverManager.getDriver());

    @When("select {string} on Order Page")
    public void selectOnOrderPage(String option) {
        orderPage.clickOption(option);
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApiDemosPage;
import utils.DriverManager;

public class ApiDemosSteps {
    ApiDemosPage apiDemosPage = new ApiDemosPage(DriverManager.getDriver());

    @Given("uygulamanın açıldığı kontrol edilir")
    public void uygulamanınAçıldığıKontrolEdilir() {
        apiDemosPage.checkApiDemosPageOpen();
    }

    @Given("uygulamanın başlığının {string} olduğu kontol edilir")
    public void uygulamanınBaşlığınınOlduğuKontolEdilir(String baslik) {
        String title = apiDemosPage.getApiDemosTitle();
        Assert.assertEquals(title, baslik, "Başlık aynı değil!!!");
    }

    @When("tablarden App tabine tıklanır")
    public void tablardenAppTabineTıklanır() {
        apiDemosPage.clickAppTab();
    }

    @When("tablarden ActionBar tabine tıklanır")
    public void tablardenActionBarTabineTıklanır() {
        apiDemosPage.clickActionBarTab();
    }

    @When("tablarden ActionBarUsage tabine tıklanır")
    public void tablardenActionBarUsageTabineTıklanır() {
        apiDemosPage.clickActionBarUsageTab();
    }


    @When("tablarden {string} tabine tıklanır")
    public void tablardenTabineTıklanır(String text) {
        apiDemosPage.clickTab(text);
    }

    @When("tablarden Touch Paint tabine tıklanır")
    public void tablardenTouchPaintTabineTıklanır() {
        apiDemosPage.clickTouchPaintTab();
    }

    @When("tablarden Touch Paint tabine tıklanırrrrr")
    public void tablardenTouchPaintTabineTıklanırrr() {
        apiDemosPage.clickTouchPaintTab2();
    }
}
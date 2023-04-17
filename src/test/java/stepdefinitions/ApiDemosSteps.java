package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ApiDemosPage;
import utils.DriverManager;

public class ApiDemosSteps {
    ApiDemosPage apiDemosPage = new ApiDemosPage(DriverManager.getDriver());

    @Given("uygulamanın açıldığı kontrol edilir")
    public void uygulamanınAçıldığıKontrolEdilir() {
        apiDemosPage.checkApiDemosPageOpen();
    }
}

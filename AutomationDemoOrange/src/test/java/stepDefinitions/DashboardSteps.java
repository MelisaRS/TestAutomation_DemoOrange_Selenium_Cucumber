package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import utilities.DriverManager;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);

    @Then("The home page should be displayed")
    public void verifyDashboardPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(dashboardPage.pageDashboardTitleIsDisplayed());
    }

    @Then("I click on the my info button")
    public void clickOnButtonMyInfo() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnMyInfoButton();
        //Thread.sleep(5000);
    }
}

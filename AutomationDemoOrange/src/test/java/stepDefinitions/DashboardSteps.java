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
        //necesita un waiters
        Thread.sleep(5000);
        dashboardPage.clickOnMyInfoButton();
        //Thread.sleep(5000);
    }

    @Then("I click on the admin button")
    public void clickOnButtonAdmin() throws InterruptedException {
        //necesita un waiters
        Thread.sleep(5000);
        dashboardPage.clickOnAdminButton();
    }

    @Then("I click on the pim button")
    public void clickOnPimButton() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnPIMButton();
        Thread.sleep(5000);
    }

    public void clickOnBuzzButton() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnBuzzButton();
    }
}

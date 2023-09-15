package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.Admin_Job_EmploymentStatusPage;
import utilities.DriverManager;

public class Admin_Job_EmploymentStatusSteps {

    Admin_Job_EmploymentStatusPage adminJobEmploymentStatusPage = new Admin_Job_EmploymentStatusPage(DriverManager.getDriver().driver);

    @And("The employment status {string} should be displayed")
    public void verifyEmploymentStatusIsDisplayed(String employmentStatus) throws InterruptedException {
        //waiters
        Thread.sleep(5000);
        Assertions.assertTrue(adminJobEmploymentStatusPage.isEmploymentsStatusDisplayed(employmentStatus) );

        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnUserDropDown();
        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnLogoutSelect();
    }

    @And("I click on the user drop down")
    public void clickOnUserDrop() throws InterruptedException {
        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnUserDropDown();
    }

    @And("I click on the logout button")
    public void clickOnLogout() throws InterruptedException {
        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnLogoutSelect();
    }

}

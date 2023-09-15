package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.Admin_UserManagementPage;
import utilities.DriverManager;

public class Admin_UserManagementSteps {

    Admin_UserManagementPage adminUserManagementPage = new Admin_UserManagementPage(DriverManager.getDriver().driver);

    @And("I click on the job comboBox")
    public void clickOnJobComboBoxPage() throws InterruptedException {
        //necesita waiters
        Thread.sleep(5000);
        adminUserManagementPage.clickOnJobComboBox();
    }

    @And("I click on the employment status selection")
    public void clickOnEmploymentStatusSelect() throws InterruptedException {
        //necesita waiters
        Thread.sleep(5000);
        adminUserManagementPage.clickOnEmploymentStatusSelection();
    }
}

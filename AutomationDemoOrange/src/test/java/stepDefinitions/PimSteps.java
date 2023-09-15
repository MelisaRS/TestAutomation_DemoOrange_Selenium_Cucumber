package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import pages.PimPage;
import utilities.DriverManager;

public class PimSteps {

    PimPage pimPage = new PimPage(DriverManager.getDriver().driver);

    @And("I click on add button")
    public void clickAddButton() throws InterruptedException {
        Thread.sleep(5000);
        pimPage.clickOnAddButton();
    }


    @And("I set the employee name field with {string}")
    public void setEmployeeNameInTextBox(String employeeName) throws InterruptedException {
        Thread.sleep(5000);
        pimPage.setEmployeeNameTextBox(employeeName);
    }

    @And("I click on the search button")
    public void clickSearchButton() throws InterruptedException {
        Thread.sleep(5000);
        pimPage.clickOnSearchButton();
    }

    @And("I verify employee name {string}")
    public void verifyIsFirstMiddleNameDisplayed(String firstMiddleName) throws InterruptedException {
        Thread.sleep(5000);
        pimPage.isFirstMiddleNameDisplayed(firstMiddleName);
    }


}

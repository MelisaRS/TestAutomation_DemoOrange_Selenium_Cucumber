package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Admin_UserManagementPage {

    WebDriver driver;

    //@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
    //WebElement jobComboBox;

    @FindBy(xpath = "//a[text()='Employment Status']")
    WebElement employmentStatusSelection;

    public Admin_UserManagementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void clickOnJobComboBox() {
        //waiter
        WebElement jobComboBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")));
        jobComboBox.click();
    }

    public void clickOnEmploymentStatusSelection(){
        employmentStatusSelection.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Admin_Job_EmploymentStatusPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@data-v-6c07a142]")
    List<WebElement> EmploymentsStatusList;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropDown;

    @FindBy(linkText = "Logout")
    WebElement logoutSelect;

    public Admin_Job_EmploymentStatusPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isEmploymentsStatusDisplayed(String employmentStatus){
        //waiter
        //WebElement employmentTitle = new WebDriverWait(driver, Duration.ofSeconds(10))
          //      .until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-text oxd-text--h6 orangehrm-main-title")));


        for (WebElement employmentStatusList : EmploymentsStatusList) {
            if(employmentStatusList.getText().equalsIgnoreCase(employmentStatus)){
                return true;
            }
        }
        return false;
    }

    public void clickOnUserDropDown(){
        userDropDown.click();
    }

    public void clickOnLogoutSelect(){
        logoutSelect.click();
    }
}

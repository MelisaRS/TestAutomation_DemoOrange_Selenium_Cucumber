package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardTitle;

    @FindBy(xpath = "//a[@href = '/web/index.php/pim/viewMyDetails']")
    WebElement myInfoButton;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean pageDashboardTitleIsDisplayed(){
        boolean pageTitleDashBoardIsDisplayed = dashboardTitle.isDisplayed();
        return pageTitleDashBoardIsDisplayed;
    }

    public void clickOnMyInfoButton(){
        myInfoButton.click();
    }

}

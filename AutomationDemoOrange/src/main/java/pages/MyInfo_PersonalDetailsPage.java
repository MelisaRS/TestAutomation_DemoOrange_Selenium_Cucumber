package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyInfo_PersonalDetailsPage {
    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsTitle;

    //@FindBy(name = "firstName")
    //WebElement firstNameTextBox;

    @FindBy(name = "middleName")
    WebElement middleNameTextBox;

    @FindBy(name = "lastName")
    WebElement lastNameTextBox;

    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[2]")
    @FindBy(xpath = "//label[text()='Nickname']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement nickNameTextBox;

    @FindBy(xpath = "//label[text()='Employee Id']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[3]")
    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement employeeIdTextBox;

    @FindBy(xpath = "//label[text()='Other Id']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[4]")
    WebElement otherIdTextBox;

    @FindBy(xpath = "//label[text()=\"Driver's License Number\"]/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[5]")
    WebElement driverLicenseNumberTextBox;

    @FindBy(xpath = "//label[text()='License Expiry Date']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[6]")
    WebElement licenseExpiryDateTextBox;

    @FindBy(xpath = "//label[text()='SSN Number']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[7]")
    WebElement ssnNumberTextBox;

    @FindBy(xpath = "//label[text()='SIN Number']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[8]")
    WebElement sinNumberTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement saveButton;


    public MyInfo_PersonalDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean personalDetailsTitleIsDisplayed(){
        boolean personalInfoTitleIsDisplayed = personalDetailsTitle.isDisplayed();
        return personalInfoTitleIsDisplayed;
    }

    public void setFirstNameTextBox(String firstName) {
        /*
        WebElement firstNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));

        WebElement firstNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("firstName")));
         */

        WebElement firstNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(firstName);
    }

    public void setMiddleNameTextBox(String middleNme){
        middleNameTextBox.clear();
        middleNameTextBox.sendKeys(middleNme);
    }

    public String getMiddleNameTextBox(){
        String getTextmiddle = middleNameTextBox.getAttribute("value");
        return getTextmiddle;
    }

    public void setLastNameTextBox(String lastName){
        lastNameTextBox.sendKeys(lastName);
    }

    public void setNickNameTextBox(String nickName){
        nickNameTextBox.sendKeys(nickName);
    }

    public String getNickNameTextBox(){
        String getNickName = nickNameTextBox.getAttribute("value");
        return getNickName;
    }

    public void setEmployeeIdTextBox(String employeeId){
        employeeIdTextBox.sendKeys(employeeId);
    }

    public void setOtherIdTextBox(String otherId){
        otherIdTextBox.sendKeys(otherId);
    }

    public String getOtherIdTextBox(){
        String getOtherId = otherIdTextBox.getAttribute("value");
        return getOtherId;
    }

    public void setDriverLicenseNumberTextBox(String driverLicenseNumber){
        driverLicenseNumberTextBox.sendKeys(driverLicenseNumber);
    }

    public String getDriverLicenseNumberTextBox(){
        String getDriverLicenseNumber = driverLicenseNumberTextBox.getAttribute("value");
        return getDriverLicenseNumber;
    }

    public void setLicenseExpiryDateTextBox(String licenseExpiryDate){
        licenseExpiryDateTextBox.sendKeys(licenseExpiryDate);
    }

    public String getLicenseExpiryDateTextBox(){
        String getLicenseExpiryDate = licenseExpiryDateTextBox.getAttribute("value");
        return getLicenseExpiryDate;
    }

    public void setSsnNumberTextBox(String ssnNumber){
        ssnNumberTextBox.sendKeys(ssnNumber);
    }

    public String getSsnNumberTextBox(){
        String getSsnNumber = ssnNumberTextBox.getAttribute("value");
        return getSsnNumber;
    }

    public void setSinNumberTextBox(String sinNumber){
        sinNumberTextBox.sendKeys(sinNumber);
    }

    public String getSinNumberTextBox(){
        String getSinNumber = sinNumberTextBox.getAttribute("value");
        return getSinNumber;
    }

    public void clickOnSaveButton(){
        saveButton.click();
    }


}

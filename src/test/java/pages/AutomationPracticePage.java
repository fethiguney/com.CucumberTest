package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
    public AutomationPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[@class='login']")
    public WebElement signIn;

    @FindBy (xpath = "//*[@id='email_create']")
    public WebElement emailAdressBar;

    @FindBy (xpath = "//*[@id='SubmitCreate']")
    public WebElement createAnAccount;

    @FindBy (xpath = "//*[@id='id_gender1']")
    public WebElement genderButton;




}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;

    @FindBy (xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement signInbutton;

    @FindBy (xpath = "//input[@id='ap_email']")
    public WebElement emailBar;

    @FindBy (xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy (xpath = "//h4[@class='a-alert-heading']")
    public WebElement thereWasAProblemText;

    @FindBy (xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelpLink;

    @FindBy (xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgotYourPasswordLink;

    @FindBy (xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    public WebElement createAccountLink;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;





}

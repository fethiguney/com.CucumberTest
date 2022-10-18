package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestPageFormPage {

    public TestPageFormPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@name='username']")
    public WebElement usarnameBar;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement passwordBar;

    @FindBy (xpath = "//*[@name='comments']")
    public WebElement textArea;

    @FindBy (xpath = "//*[@name='filename']")
    public WebElement chooseFile;

    @FindBy (xpath = "(//input[@name='checkboxes[]'])[1]")
    public WebElement checkBox1;

    @FindBy (xpath = "(//input[@name='checkboxes[]'])[2]")
    public WebElement checkBox2;

    @FindBy (xpath = "(//input[@name='checkboxes[]'])[3]")
    public WebElement checkBox3;

    @FindBy (xpath = "//*[@value='rd1']")
    public WebElement radio1;

    @FindBy (xpath = "//*[@value='rd2']")
    public WebElement radio2;

    @FindBy (xpath = "//*[@value='rd3']")
    public WebElement radio3;

    @FindBy (xpath = "//*[@value='ms3']")
    public WebElement selectItem3;

    @FindBy (xpath = "//*[@name='dropdown']")
    public WebElement dropDownMenu;

    @FindBy (xpath = "//*[@value='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//*[@id='_valuefilename']")
    public WebElement fileNameText;







}

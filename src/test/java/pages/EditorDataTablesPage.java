package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorDataTablesPage {

    public EditorDataTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstnameBar;

    @FindBy (xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastnameBar;

    @FindBy (xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionBar;

    @FindBy (xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeBar;

    @FindBy (xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionBar;

    @FindBy (xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;

    @FindBy (xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryBar;

    @FindBy (xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy (xpath = "//*[@type='search']")
    public WebElement tableSearch;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List<WebElement> tableColumnOne;


}

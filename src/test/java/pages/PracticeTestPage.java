package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PracticeTestPage {

    public PracticeTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='button']")
    public WebElement clickMeButton;

    @FindBy (xpath = " //*[text()=' down 32']")
    public  List<WebElement> downTexts;

    @FindBy (xpath = " //*[text()='click']")
    public List<WebElement> clickTexts;
}

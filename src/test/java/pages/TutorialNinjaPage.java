package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialNinjaPage {
    public TutorialNinjaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonePda;

    @FindBy (xpath = "//h4")
    public List<WebElement> phonePdaPagePhones;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    public List<WebElement> phonePdaPagePhonesAddAllCart;

    @FindBy (xpath = "//*[@id='cart-total']")
    public WebElement cartButton;

    @FindBy (xpath = "//*[@class='text-left']")
    public List<WebElement> addedItemsInCart;

}

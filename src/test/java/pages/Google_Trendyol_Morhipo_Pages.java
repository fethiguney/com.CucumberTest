package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Google_Trendyol_Morhipo_Pages {
    public Google_Trendyol_Morhipo_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@title='Ara']")
    public WebElement googleSearchBar;

    @FindBy (xpath = "(//cite[text()='https://www.trendyol.com'])[1]")
    public WebElement trendyolLinkOnGoogleSearch;

    @FindBy (xpath = "//*[text()='KABUL ET']")
    public WebElement trendyolCookiesAccept;

    @FindBy (xpath = "//input[@data-testid='suggestion']")
    public WebElement trendyolSearchBox;

    @FindBy (xpath = "//*[@class='dscrptn']")
    public WebElement trendyolSearchResultText;

    @FindBy (xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoSearchBox;

    @FindBy (xpath = "//*[@id='total-product-count']")
    public WebElement morhipoSearchResulTotalItem;
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.Google_Trendyol_Morhipo_Pages;
import utilities.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class GoogleTrendyoMorhipo {

    Google_Trendyol_Morhipo_Pages googleTrendyolMorhipo=new Google_Trendyol_Morhipo_Pages();

    int sumOfItemsOnTrendyol;
    int sumOfItemsOnMorhipo;

    List<String> windowHandlesList=new ArrayList<>();

    @Given("navigate to google url")
    public void navigateToGoogleUrl() {
        Driver.getDriver().get("https://google.com");
    }

    @And("search on google {string}")
    public void searchOnGoogle(String kelime) {
        googleTrendyolMorhipo.googleSearchBar.sendKeys(kelime, Keys.ENTER);
    }

    @Then("find the trendyol link and navigate")
    public void findTheTrendyolLinkAndNavigate() {
        googleTrendyolMorhipo.trendyolLinkOnGoogleSearch.click();
    }

    @And("search on trendyol {string}")
    public void searchOnTrendyol(String kelime) {
        googleTrendyolMorhipo.trendyolCookiesAccept.click();
        googleTrendyolMorhipo.trendyolSearchBox.sendKeys(kelime, Keys.ENTER);

    }

    @Then("get sum of items on trendyol search")
    public void getSumOfItemsOnTrendyolSearch() {
        String searchResultText=googleTrendyolMorhipo.trendyolSearchResultText.getText();
        sumOfItemsOnTrendyol=Integer.parseInt(searchResultText.replaceAll("\\D", ""));

    }

    @And("navigate to in new tap morhipo url")
    public void navigateToInNewTapMorhipoUrl() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().navigate().to("https://www.morhipo.com");
    }

    @Then("search on morhipo {string}")
    public void searchOnMorhipo(String kelime) {
        googleTrendyolMorhipo.morhipoSearchBox.sendKeys(kelime, Keys.ENTER);

    }

    @When("get sum of items on morhipo search")
    public void getSumOfItemsOnMorhipoSearch() {
        String searchResultNumber=googleTrendyolMorhipo.morhipoSearchResulTotalItem.getText();
        sumOfItemsOnMorhipo=Integer.parseInt(searchResultNumber);

    }

    @Then("compare sum of {string} which you get trendyol and morhipo")
    public void compareSumOfWhichYouGetTrendyolAndMorhipo(String kelime) {
        System.out.println("Total item of search result on Morhipo : "+sumOfItemsOnMorhipo);
        System.out.println("Total item of search result on Trendyol : "+sumOfItemsOnTrendyol);
    }

    @And("close tab first which url has more items")
    public void closeTabFirstWhichUrlHasMoreItems() {
       windowHandlesList=new ArrayList<>(Driver.getDriver().getWindowHandles());

        if (sumOfItemsOnTrendyol>sumOfItemsOnMorhipo) {
            Driver.getDriver().switchTo().window(windowHandlesList.get(1));
            Driver.closeDriver();
        } else {
            Driver.getDriver().switchTo().window(windowHandlesList.get(2));
            Driver.closeDriver();
        }
    }

    @Then("then close rest of tab")
    public void thenCloseRestOfTab() throws AWTException {
     /*   Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);*/
    }

    @And("sayfa url {string} icerdigini test eder")
    public void facebookSayfasindaUrlIcerdiginiTestEder(String kelime) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(kelime));
    }

    @Given("kullanici url ile {string} sayfasina gider")
    public void kullaniciUrlIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
}

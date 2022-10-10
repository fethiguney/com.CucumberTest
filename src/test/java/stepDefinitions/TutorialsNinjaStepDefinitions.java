package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialNinjaPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TutorialsNinjaStepDefinitions {

    List<String> itemsInPage=new ArrayList<>();
    List<String> itemsInCart=new ArrayList<>();
    TutorialNinjaPage tutorialNinjaPage=new TutorialNinjaPage();
    @Given("Kullanici tutroilsninja.com adresine gider")
    public void kullaniciTutroilsninjaComAdresineGider() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Then("Kullanici Phones & PDAs'a tiklar")
    public void kullaniciPhonesPDAsATiklar() {
        tutorialNinjaPage.phonePda.click();
    }

    @And("Kullanici telefonlarin markalarini alir")
    public void kullaniciTelefonlarinMarkalariniAlir() {
        tutorialNinjaPage.phonePdaPagePhones.stream().map(WebElement::getText).forEach(System.out::println);
        itemsInPage=tutorialNinjaPage.phonePdaPagePhones.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    @And("Kullanici tum ögeleri sepete ekler")
    public void kullaniciTumogeleriSepeteEkler()  {

        for (WebElement w:tutorialNinjaPage.phonePdaPagePhonesAddAllCart) {
            w.click();
        }
    }

    @And("Kullanici sepete tiklar")
    public void kullaniciSepeteTiklar() throws InterruptedException {
        Thread.sleep(2000);
        tutorialNinjaPage.cartButton.click();
    }

    @And("Kullanici sepetteki isimleri alir")
    public void kullaniciSepettekiIsimleriAlir() {
        tutorialNinjaPage.addedItemsInCart.stream().map(WebElement::getText).forEach(System.out::println);
        itemsInCart=tutorialNinjaPage.addedItemsInCart.stream().map(WebElement::getText).collect(Collectors.toList());

    }

    @And("Kullanici sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir")
    public void kullaniciSepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() {
        Assert.assertTrue(itemsInCart.containsAll(itemsInPage));
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}

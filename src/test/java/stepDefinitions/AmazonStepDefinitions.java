package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().navigate().refresh();
    }

    @Then("kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("Nutella"));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }

    @And("sonuclarin selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("selenium"));
    }

    @Then("kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("iphone"));
    }



    @And("kullanici amazonda {string} icin arama yapar")
    public void kullaniciAmazondaIcinAramaYapar(String kelime) {
        amazonPage.aramaKutusu.sendKeys(kelime, Keys.ENTER);

    }

    @And("kullanici amazonda sonuclarin {string} icerdigini test eder")
    public void kullaniciAmazondaSonuclarinIcerdiginiTestEder(String kelime) {
       Assert.assertTrue( amazonPage.aramaSonucuElementi.getText().contains(kelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sure)  {
        try {
            Thread.sleep(sure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("kullanici urlin {string} icerdigini test eder")
    public void kullaniciUrlinIcerdiginiTestEder(String kelimeUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(kelimeUrl));
    }

    @Then("amazonda sign in butonuna tiklar")
    public void amazonda_sign_in_butonuna_tiklar() {
    amazonPage.signInbutton.click();
    }
    @Then("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
    amazonPage.emailBar.sendKeys(Faker.instance().internet().emailAddress());
    }
    @Then("gonderdigi e-postanın ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshotWebElement("eposta", amazonPage.emailBar);
    }
    @Then("amazonda continiue tiklar")
    public void amazonda_continiue_tiklar() {
    amazonPage.continueButton.click();
    }
    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
    Assert.assertTrue(amazonPage.thereWasAProblemText.isDisplayed());
    }
    @Then("amazonda Need help e tiklar")
    public void amazonda_need_help_e_tiklar() {
        amazonPage.needHelpLink.click();
    }
    @Then("amazonda forgot your password e tiklar")
    public void amazonda_forgot_your_password_e_tiklar() {
    amazonPage.forgotYourPasswordLink.click();
    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
    Assert.assertTrue(amazonPage.passwordAssistance.isDisplayed());
    }
    @Then("Geri gider")
    public void geri_gider() {
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().back();
    }
    @Then("amazonda Create your account butonuna tiklar")
    public void amazonda_create_your_account_butonuna_tiklar() {
    amazonPage.createAccountLink.click();
    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
    Assert.assertTrue(amazonPage.createAccountText.isDisplayed());
    }
}


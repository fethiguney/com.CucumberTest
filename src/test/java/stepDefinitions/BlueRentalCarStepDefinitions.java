package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalCarPage;

public class BlueRentalCarStepDefinitions {
    BlueRentalCarPage blueRentalCarPage=new BlueRentalCarPage();
    @Then("kullanici blueRentalCar sayfasinda Login yazisina tiklar")
    public void kullaniciBlueRentalCarSayfasindaLoginYazisinaTiklar() {
    blueRentalCarPage.login.click();
    }

    @And("kullanici gecersiz {string}  ve gecersiz {string} girer")
    public void kullaniciGecersizVeGecersizGirer(String email, String password) {
    blueRentalCarPage.emailBar.sendKeys(email);
    blueRentalCarPage.passwordBar.sendKeys(password);
    }

    @And("kullanici blueRentalCar sayfasinda Login butonuna basar")
    public void kullaniciBlueRentalCarSayfasindaLoginButonunaBasar() {
    blueRentalCarPage.loginClick.click();
    }

    @Then("kullanici gecersiz bilgiler ile blueRentalCar sayfasina giris yapilmadigini kontrol eder")
    public void kullaniciGecersizBilgilerIleBlueRentalCarSayfasinaGirisYapilmadiginiKontrolEder() {
        Assert.assertTrue(blueRentalCarPage.loginClick.isDisplayed());
    }



}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class WebDriverPageStepDefinitons {

    WebUniversityPage webUniversityPage=new WebUniversityPage();
    List<String> windowHandles=new ArrayList<>();
    @Then("kullanici webdriver sayfasinda Login Portala kadar asagi iner")
    public void kullaniciWebdriverSayfasindaLoginPortalaKadarAsagiIner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici webdriver sayfasinda Login Portala tiklar")
    public void kullaniciWebdriverSayfasindaLoginPortalaTiklar() {
    webUniversityPage.loginPortal.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        windowHandles=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowHandles.get(1));
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String usarname) {
    webUniversityPage.usarname.sendKeys(usarname);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password) {
    webUniversityPage.password.sendKeys(password);
    }

    @And("kullanici webdriver sayfasinda login butonuna basar")
    public void kullaniciWebdriverSayfasindaLoginButonunaBasar() {
    webUniversityPage.loginClick.click();
    }

    @And("kullanici Popup'ta cikan yazinin {string} oldugunu test eder")
    public void kullaniciPopupTaCikanYazininOldugunuTestEder(String kelime) {
        String popUpmessage=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(kelime, popUpmessage);
        System.out.println(popUpmessage);
        System.out.println(kelime);
    }


    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windowHandles.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="http://webdriveruniversity.com/";
        System.out.println(actualUrl);
        Assert.assertTrue(expectedUrl.contains(actualUrl));


    }
}

package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPages;
import utilities.Driver;

public class MedunnaStepDefinitions {
    MedunnaPages medunna=new MedunnaPages();

    @And("medunna sayfasinda login olmak icin signin tıklar")
    public void medunnaSayfasindaLoginOlmakIcinSigninTıklar() {
    medunna.signinSymbol.click();
    medunna.signinButton.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String usarname) {
        usarname= Faker.instance().gameOfThrones().character();
        medunna.username.sendKeys(usarname);
    }

    @Then("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password=Faker.instance().internet().password();
        medunna.password.sendKeys(password);
    }

    @And("medunna sayfasinda signin tıklar")
    public void medunnaSayfasindaSigninTıklar() {
        medunna.signinWithCredentials.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(medunna.alertMessage);
        medunna.alertMessage.isDisplayed();
    }
}

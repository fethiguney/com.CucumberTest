package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPracticePage;
import utilities.Driver;

public class AutomationPracticeStepDefinitions {

    AutomationPracticePage automationPracticePage=new AutomationPracticePage();
    Faker faker=new Faker();

    Actions actions=new Actions(Driver.getDriver());

    @And("automationpractice sayfasinda sign in linkine tiklar")
    public void automationpracticeSayfasindaSignInLinkineTiklar() {
        automationPracticePage.signIn.click();
    }

    @And("automationpractice sayfasinda Create and account bölümüne email adresi girer")
    public void automationpracticeSayfasindaCreateAndAccountBölümüneEmailAdresiGirer() {
        automationPracticePage.emailAdressBar.sendKeys(faker.internet().emailAddress());
    }

    @And("automationpractice sayfasinda Create an Account butonuna basar")
    public void automationpracticeSayfasindaCreateAnAccountButonunaBasar() {
        automationPracticePage.createAnAccount.click();
    }

    @And("automationpractice sayfasinda kisisel bilgilerini ve iletisim bilgilerini girer")
    public void automationpracticeSayfasindaKisiselBilgileriniVeIletisimBilgileriniGirer() {
        automationPracticePage.genderButton.click();
        actions.sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB). sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).sendKeys("10").
                sendKeys(Keys.TAB).sendKeys("January").
                sendKeys(Keys.TAB).sendKeys("1980").
                sendKeys(Keys.TAB). sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB). sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().city()).
                sendKeys(Keys.TAB).sendKeys("Alaska").
                sendKeys(Keys.TAB).sendKeys("00000").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).
                sendKeys(Keys.TAB).sendKeys("My Adress").perform();
    }

    @And("automationpractice sayfasinda Register butonuna basar")
    public void automationpracticeSayfasindaRegisterButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("automationpractice sayfasinda hesap olustugunu dogrulayin")
    public void automationpracticeSayfasindaHesapOlustugunuDogrulayin() {

    }


}

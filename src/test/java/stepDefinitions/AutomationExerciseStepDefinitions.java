package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Then("kullanici automationexercise ana sayfasinda oldugunu dogrular")
    public void kullaniciAutomationexerciseAnaSayfasindaOldugunuDogrular() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.automationexercise.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @And("kullanici automationexercise test case butonuna basar")
    public void kullaniciAutomationexerciseTestCaseButonunaBasar() {

        automationExercisePage.testcasebutton.click();
    }

    @Then("sayfanin ekran goruntusunu alir")
    public void sayfaninEkranGoruntusunuAlir() throws IOException {
        ReusableMethods.getScreenshot("testcasepage");
    }
}

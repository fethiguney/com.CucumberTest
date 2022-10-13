package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookStepDefiniton {
    FaceBookPage faceBookPage=new FaceBookPage();
    @Given("user navigate to {string}")
    public void userNavigateTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("user enter email {string}")
    public void userEnterEmail(String email) {
        faceBookPage.email.sendKeys(ConfigReader.getProperty(email));
    }
    @Then("user enter password {string}")
    public void userEnterPassword(String password) {
        faceBookPage.password.sendKeys(ConfigReader.getProperty(password));
    }
    @And("user click login button")
    public void userClickLoginButton() {
        faceBookPage.login.click();
    }
}

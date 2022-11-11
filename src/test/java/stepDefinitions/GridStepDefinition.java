package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GridStepDefinition {
    WebDriver driver;
    @Given("user is on the application_url {string}")
    public void userIsOnTheApplication_url(String url) throws MalformedURLException {
       driver=new RemoteWebDriver(new URL("http://192.168.1.42:4444"), new ChromeOptions());
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.manage().window().maximize();
       driver.get(url);

    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        String actualTitle=driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("close the remote driver")
    public void closeTheRemoteDriver() {
        driver.quit();
    }

    @Given("user is on the application_url with firefox {string}")
    public void userIsOnTheApplication_urlWithFirefox(String url) throws MalformedURLException {
        driver=new RemoteWebDriver(new URL("http://192.168.1.42:4444"), new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(url);
    }
}

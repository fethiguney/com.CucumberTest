package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage=new GuruPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinagider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("{string} sutununda tum degerleri yazdirir")
    public void sutunundaTumDegerleriYazdirir(String baslik) {
        int index=0;

        for (int i = 0; i <guruPage.basliklar.size() ; i++) {
            if (guruPage.basliklar.get(i).getText().equals(baslik)) {
                System.out.println(guruPage.basliklar.get(i).getText());
                index=i+1;
            }
        }
        List<WebElement> sutunElementler=Driver.getDriver().
                findElements(By.xpath("(//tbody)[2]//td["+index+"]"));
        sutunElementler.stream().map(WebElement::getText).forEach(System.out::println);
    }



}

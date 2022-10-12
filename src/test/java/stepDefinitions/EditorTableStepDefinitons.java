package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.EditorDataTablesPage;

import java.util.List;
import java.util.stream.Collectors;

public class EditorTableStepDefinitons {

    EditorDataTablesPage editorDataTablesPage=new EditorDataTablesPage();
    @Then("datatables sayfasinda new butonuna basar")
    public void datatablesSayfasindaNewButonunaBasar() {
        editorDataTablesPage.newButton.click();
    }

    @And("kullanici datatables sayfasinda create tusuna basar")
    public void kullaniciDatatablesSayfasindaCreateTusunaBasar() {
        editorDataTablesPage.createButton.click();
    }

    @And("kullanici datatables sayfasinda isim {string} girer")
    public void kullaniciDatatablesSayfasindaIsimGirer(String kelime) {
        editorDataTablesPage.firstnameBar.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda soyisim {string} girer")
    public void kullaniciDatatablesSayfasindaSoyisimGirer(String kelime) {
        editorDataTablesPage.lastnameBar.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda pozisyon {string} girer")
    public void kullaniciDatatablesSayfasindaPozisyonGirer(String kelime) {
        editorDataTablesPage.positionBar.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda office {string} girer")
    public void kullaniciDatatablesSayfasindaOfficeGirer(String kelime) {
        editorDataTablesPage.officeBar.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda kidem {string} girer")
    public void kullaniciDatatablesSayfasindaKidemGirer(String kelime) {
        editorDataTablesPage.extensionBar.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda baslangic tarihi {string} girer")
    public void kullaniciDatatablesSayfasindaBaslangicTarihiGirer(String kelime) {
        editorDataTablesPage.startDate.sendKeys(kelime);
    }

    @And("kullanici datatables sayfasinda maas {string} girer")
    public void kullaniciDatatablesSayfasindaMaasGirer(String kelime) {
        editorDataTablesPage.salaryBar.sendKeys(kelime);
    }

    @When("kullanici datatables sayfasinda isim {string} ile arama yapar")
    public void kullaniciDatatablesSayfasindaIsimIleAramaYapar(String kelime) {
        editorDataTablesPage.tableSearch.sendKeys(kelime);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String kelime) {
        List<String> isimler=editorDataTablesPage.tableColumnOne.stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertTrue(isimler.contains(kelime));
    }

}

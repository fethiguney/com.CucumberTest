package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.TestPageFormPage;

public class TestPagesFormStepDefinitions {

    TestPageFormPage testPageFormPage=new TestPageFormPage();


    @And("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String usarname, String password, String textarea) {
    usarname=Faker.instance().lordOfTheRings().character();
    password=Faker.instance().internet().password();
    textarea=Faker.instance().lorem().fixedString(10);


    testPageFormPage.usarnameBar.sendKeys(usarname);
    testPageFormPage.passwordBar.sendKeys(password);
    testPageFormPage.textArea.clear();
    testPageFormPage.textArea.sendKeys(textarea);

    }
    @And("bir dosya yukler")
    public void birDosyaYukler() {
    String filePath="C:\\Users\\user\\Desktop\\Yeni Microsoft Word Belgesi.docx";
    testPageFormPage.chooseFile.sendKeys(filePath);
    }
    @Then("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
        if (!testPageFormPage.checkBox1.isSelected()){
            testPageFormPage.checkBox1.click();
        }
        if (testPageFormPage.checkBox2.isSelected()) {
            testPageFormPage.checkBox2.click();
        }
        if (testPageFormPage.checkBox3.isSelected()) {
            testPageFormPage.checkBox3.click();
        }
    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
        testPageFormPage.radio2.click();
    }

    @Then("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
        testPageFormPage.selectItem3.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
        Select select=new Select(testPageFormPage.dropDownMenu);
        select.selectByValue("dd3");
    }

    @And("submite tiklar")
    public void submiteTiklar() {
        testPageFormPage.submitButton.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
        Assert.assertTrue(testPageFormPage.fileNameText.isDisplayed());
    }
}

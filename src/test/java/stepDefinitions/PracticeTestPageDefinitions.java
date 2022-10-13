package stepDefinitions;

import dev.failsafe.internal.util.Maths;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class PracticeTestPageDefinitions {

    PracticeTestPage practiceTestPage=new PracticeTestPage();
    Actions actions=new Actions(Driver.getDriver());

    int sumOfDownTexts;
    int sizeOfClickTexts;

    int actualResult;
    @Given("{string} adresine gidin")
    public void adresine_gidin(String string) {
        Driver.getDriver().get(string);
    }
    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer int1) {
        for (int i = 0; i <int1 ; i++) {
            practiceTestPage.clickMeButton.click();
        }
    }
    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer int1) {
        actions=new Actions(Driver.getDriver());
        for (int i = 0; i <int1 ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }
    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<Integer> downTextValues=new ArrayList<>();
        for (int i = 0; i <practiceTestPage.downTexts.size() ; i++) {
            downTextValues.add(Integer.parseInt(practiceTestPage.downTexts.get(i).getText().replaceAll("\\D", "")));
            sumOfDownTexts+=downTextValues.get(i);
        }
        System.out.println(sumOfDownTexts);

    }
    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {

        for (int i = 0; i <practiceTestPage.clickTexts.size() ; i++) {
            sizeOfClickTexts+=practiceTestPage.clickTexts.get(i).getText().length();
        }
        System.out.println(sizeOfClickTexts);

        actualResult=sumOfDownTexts-sizeOfClickTexts;
        System.out.println(actualResult);
        System.out.println("Bir click in uzunlugu : "+practiceTestPage.clickTexts.get(0).getText().length());
    }
    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(Integer int1) {
        int expectedResult=int1;
        Assert.assertEquals(expectedResult, actualResult);
    }
}


  Feature: AutomationExercise WebSite
    Scenario: AutomationExercise test case page screen shot
    Given kullanici url ile "https://www.automationexercise.com" sayfasina gider
    Then kullanici automationexercise ana sayfasinda oldugunu dogrular
    And kullanici automationexercise test case butonuna basar
    Then sayfanin ekran goruntusunu alir
    And sayfayi kapatir

  Scenario: Practice test page
    Given "https://testpages.herokuapp.com/styled/key-click-display-test.html" adresine gidin
    And 50 defa click me ye tiklayin
    And 50 defa Space dugmesine basin
    Then Down yazisindaki iki basamakli sayilarin hepsini toplayin
    And Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin
    Then sonucun 1100 oldugunu dogrulayin

  Scenario: Kullanici sutun basligi ile tum sutunu yazdirir
    Given kullanici "guruUrl" sayfasina gider
    And "Company" sutununda tum degerleri yazdirir

  Scenario Outline: Practice Form doldurma
    Given kullanici url ile "https://testpages.herokuapp.com/styled/basic-html-form-test.html" sayfasina gider
    And   username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And   bir dosya yukler
    Then  checkbox1 i secer
    And   radio2 yi secer
    Then  selection item3 secer
    And   dropdown itmem4 secer
    And   submite tiklar
    Then  dosyanin yuklendigini dogrular
    Examples:
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |

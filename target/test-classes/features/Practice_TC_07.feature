
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
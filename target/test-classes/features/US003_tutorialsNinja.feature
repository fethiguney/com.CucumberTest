@tutorialsninja
Feature: tutorialsninja

  Scenario: Kullanici http://tutorialsninja.com/demo/index.php?route=common/home sayfasina gider ve Phones & PDAs'a tıklar

    Given Kullanici tutroilsninja.com adresine gider
    Then Kullanici Phones & PDAs'a tiklar
    And Kullanici telefonlarin markalarini alir
    And Kullanici tum ögeleri sepete ekler
    And Kullanici sepete tiklar
    And Kullanici sepetteki isimleri alir
    And Kullanici sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir
    And Sayfayi kapatir

  Feature: Parametre kullanimi
    @amazon
    Scenario: Parametre kullaniminda ConfigReader kullanimi
      Given kullanici "amazonUrl" sayfasina gider
      And kullanici amazonda "nutella" icin arama yapar
      And kullanici amazonda sonuclarin "nutella" icerdigini test eder
      Then sayfayi kapatir

    @facebook
      Scenario: Parametre kullanimi
        Given kullanici "facebookUrl" sayfasina gider
        Then kullanici 2 saniye bekler
        And sayfa url "facebook" icerdigini test eder
        Then sayfayi kapatir

      Scenario: Amazon Url
        Given kullanici "amazonUrl" sayfasina gider
        Then kullanici 1 saniye bekler
        And sayfa url "amazon" icerdigini test eder
        Then sayfayi kapatir

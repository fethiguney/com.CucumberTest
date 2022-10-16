
  Feature: Parametre kullanimi
    @gp1
    Scenario: Parametre kullaniminda ConfigReader kullanimi
      Given kullanici "amazonUrl" sayfasina gider
      And kullanici amazonda "nutella" icin arama yapar
      And kullanici amazonda sonuclarin "nutella" icerdigini test eder
      Then sayfayi kapatir

    @gp1
      Scenario: Parametre kullanimi
        Given kullanici "facebookUrl" sayfasina gider
        Then kullanici 2 saniye bekler
        And sayfa url "facebook" icerdigini test eder
        Then sayfayi kapatir
    @gp1
      Scenario: Amazon Url
        Given kullanici "amazonUrl" sayfasina gider
        Then kullanici 1 saniye bekler
        And sayfa url "kamazon" icerdigini test eder
        Then sayfayi kapatir


  Feature: US006 Parametre kullanimi
    Scenario: TC01 Parametre kullanimi
      Given kullanici url ile "https://hepsiburada.com" sayfasina gider
      Then kullanici 2 saniye bekler
      And sayfa url "hepsiburada" icerdigini test eder
      Then sayfayi kapatir
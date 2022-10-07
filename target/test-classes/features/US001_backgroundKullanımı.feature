Feature: US001 Background Kullanimi
  Background: Ortak adim
    Given kullanici amazon sayfasina gider

    @background
    Scenario:  TC01 Kullanici amazonda nutella aratir
      Then kullanici nutella icin arama yapar
      And sonuclarin nutella icerdigini test eder
      And sayfayi kapatir

  @background
  Scenario: TC02 kullanici amazonda selenium aratir
    Then kullanici selenium aratir
    And sonuclarin selenium icerdigini test eder
    And sayfayi kapatir

  @background
  Scenario: TC03 kullanici amazonda iphone aratir
    Then kullanici iphone aratir
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
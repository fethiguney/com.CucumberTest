
@background
Feature: US001 Background Kullanimi
  Background:Tum senaryolar icin baslangic adimi buradan baslar
    Given kullanici amazon sayfasina gider

    @gp2
    Scenario:  TC01 Kullanici amazonda nutella aratir
      Then kullanici nutella icin arama yapar
      And sonuclarin nutella icerdigini test eder
      And sayfayi kapatir

  @gp2
  Scenario: TC02 kullanici amazonda selenium aratir
    Then kullanici selenium aratir
    And sonuclarin selenium icerdigini test eder
    And sayfayi kapatir

  @gp2
  Scenario: TC03 kullanici amazonda iphone aratir
    Then kullanici iphone aratir
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
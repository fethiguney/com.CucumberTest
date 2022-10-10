Feature: Amazon Search

  @grup1
  Scenario: TC01 Kullanici amazonda nutella aratir
    Given kullanici amazon sayfasina gider
    Then kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir

  @grup1
  Scenario: TC02 kullanici amazonda selenium aratir
    Given kullanici amazon sayfasina gider
    Then kullanici selenium aratir
    And sonuclarin selenium icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 kullanici amazonda iphone aratir
    Given kullanici amazon sayfasina gider
    Then kullanici iphone aratir
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir

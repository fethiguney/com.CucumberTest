Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratır
    Given kullanici amazon sayfasina gider
    Then kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir



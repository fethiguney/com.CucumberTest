
  Feature: Trendyol ve Morhibo'da makas aratma
    Scenario: Trendyol ve Morhibo makas aratıp sonuclari karsilastirma
    Given navigate to google url
    And search on google "trendyol"
    Then find the trendyol link and navigate
    And search on trendyol "makas"
    Then get sum of items on trendyol search
    And navigate to in new tap morhipo url
    Then search on morhipo "makas"
    When get sum of items on morhipo search
    Then compare sum of "makas" which you get trendyol and morhipo
    And close tab first which url has more items
    Then then close rest of tab
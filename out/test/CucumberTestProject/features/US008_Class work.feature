
  Feature: US008 Class work

    Scenario Outline: Kullanici sutun basligi ile liste alabilmeli
      Given kullanici "guruUrl" sayfasina gider
      And "<Basliklar>" sutununda tum degerleri yazdirir
      Examples:
        | Basliklar           |
        | Company             |
        | Prev Close (Rs)     |
        | Current Price (Rs)  |
        | % Change            |

      Scenario: Kullanici Sayfayi kapatir
        Given sayfayi kapatir
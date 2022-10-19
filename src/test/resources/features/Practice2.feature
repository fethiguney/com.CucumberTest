Feature: Practice Test
  Scenario Outline: Practice Nagatif Test
  Given kullanici url ile "https://medunna.com" sayfasina gider
  And medunna sayfasinda login olmak icin signin tıklar
  And username icin "<username>" kullanici adini gonderir
  Then password icin "<password>" parolasini gonderir
  And medunna sayfasinda signin tıklar
  Then Authentication information not correct uyarisini dogrular
    Examples:
      | username | password |
      | username | password |
      | username | password |


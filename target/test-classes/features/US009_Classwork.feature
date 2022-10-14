Feature: US009_Classwork 

  @web
  Scenario: Kullanici ve Url testi
    Given kullanici url ile "http://webdriveruniversity.com" sayfasina gider
    Then kullanici webdriver sayfasinda Login Portala kadar asagi iner
    And kullanici webdriver sayfasinda Login Portala tiklar
    And kullanici diger windowa gecer
    And kullanici "username" kutusuna bilgileri girer
    And kullanici "password" bolumune bilgileri girer
    And kullanici webdriver sayfasinda login butonuna basar
    And kullanici Popup'ta cikan yazinin "validation failed" oldugunu test eder
    And kullanici Ok diyerek Popup'i kapatir
    And kullanici ilk sayfaya geri doner
    And kullanici ilk sayfaya donuldugunu test eder
Feature: US010 Kullanici giris testi
  Scenario: Kullanici sitede hesap olusturur
    Given kullanici url ile "http://automationpractice.com/index.php" sayfasina gider
    And automationpractice sayfasinda sign in linkine tiklar
    And automationpractice sayfasinda Create and account bölümüne email adresi girer
    And automationpractice sayfasinda Create an Account butonuna basar
    And automationpractice sayfasinda kisisel bilgilerini ve iletisim bilgilerini girer
    And automationpractice sayfasinda Register butonuna basar
    Then automationpractice sayfasinda hesap olustugunu dogrulayin

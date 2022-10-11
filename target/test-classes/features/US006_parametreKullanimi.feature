
  Feature: US006 Parametre kullanimi
    Scenario: TC01 Parametre kullanimi
      Given kullanici url ile "https://hepsiburada.com" sayfasina gider
      Then kullanici 2 saniye bekler
      And sayfa url "hepsiburada" icerdigini test eder
      Then sayfayi kapatir


    Scenario: TC02 kullanici gecersiz bilgiler ile giris yapamaz
      Given kullanici "bluerentalUrl" sayfasina gider
      Then kullanici blueRentalCar sayfasinda Login yazisina tiklar
      And kullanici gecersiz "blueRentInvalidEmail"  ve gecersiz "blueRentInvalidPassword" girer
      And kullanici blueRentalCar sayfasinda Login butonuna basar
      Then  kullanici gecersiz bilgiler ile blueRentalCar sayfasina giris yapilmadigini kontrol eder
      Then sayfayi kapatir


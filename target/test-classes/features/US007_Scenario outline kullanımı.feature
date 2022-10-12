
Feature: US007 Scenario outline kullanımı
  Scenario Outline: TC01 kullanici gecersiz bilgiler ile giris yapamaz
    Given kullanici "bluerentalUrl" sayfasina gider
    Then kullanici blueRentalCar sayfasinda Login yazisina tiklar
    And kullanici gecersiz "<usarname>"  ve gecersiz "<password>" girer
    Then kullanici gecersiz bilgiler ile blueRentalCar sayfasina giris yapilmadigini kontrol eder
    And sayfayi kapatir
    Examples:
      | usarname               | password |
      | gecersiz@gmail.com     | 00000 |
      | budagecersiz@gmail.com | 90183 |
      | invalid@gmail.com      | 4521 |

  Scenario Outline:
    When kullanici url ile "https://editor.datatables.net" sayfasina gider
    Then datatables sayfasinda new butonuna basar
    And kullanici datatables sayfasinda isim "<firstname>" girer
    And kullanici datatables sayfasinda soyisim "<lastname>" girer
    And kullanici datatables sayfasinda pozisyon "<position>" girer
    And kullanici datatables sayfasinda office "<office>" girer
    And kullanici datatables sayfasinda kidem "<extension>" girer
    And kullanici datatables sayfasinda baslangic tarihi "<startDate>" girer
    And kullanici datatables sayfasinda maas "<salary>" girer
    And kullanici 1 saniye bekler
    And kullanici datatables sayfasinda create tusuna basar

    Examples:
      | firstname | lastname | position | office | extension | startDate | salary |
      | ALi        | Veli      | Qa       | Google   | Senior    | 2022-06-10  | 15000  |
      | Ahmet      | Mehmet    | Qa       | Google   | Junior    | 2021-01-15  | 10500  |
      | Hasan      | Duman     | Dev      | Amazon   | Junior    | 2020-07-05 | 25000  |
      | Akin       | Alkan     | Dev      | Amazon   | Senior    | 2018-10-20  | 50000  |
      | Orhan      | Duman     | PO       | WallMart | Senior    | 2019-12-10  | 30000  |

    When kullanici datatables sayfasinda isim "Ahmet" ile arama yapar
    Then isim bolumunde "Ahmet" oldugunu dogrular
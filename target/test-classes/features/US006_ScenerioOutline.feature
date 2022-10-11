
  Feature: US007 kullanici amazonda istedigi kelimeleri aratir
    Scenario Outline: TC01 kullanici birden fazla kelime aratir
      Given kullanici "amazonUrl" sayfasina gider
      Then kullanici amazonda "<istenenKelime>" icin arama yapar
      And kullanici amazonda sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
      And sayfayi kapatir
      Examples:
        | istenenKelime | istenenKelimeKontrol |
        | nutella       | nutella |
        | selenium      | selenium |
        | sql           | sql |

   @outline
    Scenario Outline: TC02 kullanici birden fazla web sitesine gider
      Given kullanici "<arananUrl>" sayfasina gider
      Then kullanici 1 saniye bekler
      And kullanici urlin "<arananKelime>" icerdigini test eder
      Then sayfayi kapatir
      Examples:
        | arananUrl | arananKelime |
        | amazonUrl | amazon       |
        | facebookUrl | facebook |
        | bluerentalUrl | bluerental |


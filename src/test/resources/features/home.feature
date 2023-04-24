@Sahibinden
Feature: Sahibinden

  @CheckResult
  Scenario: Check Search Result
    Given user should see the Home Page
    When taps "Emlak" on Home Page
    When taps "Konut" on Categories Page
    When taps "Satılık" on Categories Page
    When taps "Daire" on Categories Page
    When taps "Devam Et" button on Popup
    Then should see Results on Result Page

  @CheckFilters
  Scenario: Check Filters
    Given user should see the Home Page
    When taps "Vasıta" on Home Page
    When taps Close Button on Categories Page
    When taps "Otomobil" on Categories Page
    When taps "Alfa Romeo" on Categories Page
    When taps "156" on Categories Page
    When taps "1.6 TS" on Categories Page
    When taps "1.6 TS" on Categories Page
    When taps "Devam Et" button on Popup
    When taps filters on Result Page
    When taps "Fiyat" on Filters Page
    When sendkeys Max Price "200000" on Filters Page
    When taps "TAMAM" button on Filters Page
    When taps Show Results Button on Filters Page
    When taps order on Result Page
    When select "Fiyata göre (Önce en yüksek)" on Order Page
    Then should see first car price lower than or equals "200.000 TL" on Result Page
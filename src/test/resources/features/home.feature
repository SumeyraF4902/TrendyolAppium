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
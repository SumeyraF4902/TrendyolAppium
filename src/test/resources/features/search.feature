@SearchPage
Feature: Google Search Page

  @Ornek1
  Scenario: Find Element
    Given uygulamanın açıldığı kontrol edilir

  @Ornek2
  Scenario: Get Text
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir

  @Ornek3
  Scenario: Click
    Given uygulamanın açıldığı kontrol edilir
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden App tabine tıklanır

  @Ornek4
  Scenario Outline: SendKeys
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden "<tab1>" tabine tıklanır
    When tablarden "<tab2>" tabine tıklanır
    When tablarden "<tab3>" tabine tıklanır
    When Search butonuna tıklanır
    When Search alanına "<text>" yazılır
    Then Text area "<text>" değerini içeriyormu kontrol edilir
    Examples:
      | tab1 | tab2       | tab3             | text    |
      | App  | Action Bar | Action Bar Usage | enes    |
      | App  | Action Bar | Action Bar Usage | enes    |
      | App  | Action Bar | Action Bar Usage | enes    |

  @Ornek5
  Scenario: Scroll UiSelector/UiScrollable
    Given uygulamanın açıldığı kontrol edilir
    When tablarden "Graphics" tabine tıklanır
    When tablarden Touch Paint tabine tıklanır

  @Ornek6
  Scenario: Scroll JavascriptExecutor
    Given uygulamanın açıldığı kontrol edilir
    When tablarden "Graphics" tabine tıklanır
    When tablarden Touch Paint tabine tıklanırrrrr

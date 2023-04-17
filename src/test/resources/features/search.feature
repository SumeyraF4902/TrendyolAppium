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
  Scenario: SendKeys
    Given uygulamanın başlığının "API Demos" olduğu kontol edilir
    When tablarden "App" tabine tıklanır
    When tablarden "Action Bar" tabine tıklanır
    When tablarden "Action Bar Usage" tabine tıklanır
    When Search butonuna tıklanır
    When Search alanına "enes" yazılır
    Then Text area "enes" değerini içeriyormu kontrol edilir
@ApiDemos
Feature: Api Demos
  @ButtonsPage
  Scenario: Check Buttons Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Buttons" on Categories Page
    Then should see Title  "Views/Buttons" on ButtonsPage

  @ButtonsPage @CheckActions
  Scenario: Check Buttons Page Actions
    Given user is on the Buttons Page
    Then should Normal Button "NORMAL" on Buttons Page
    Then should Small Button "SMALL" on Buttons Page
    Then should Switch Button "KAPALI" on Buttons Page
    When taps Switch Button on Buttons Page
    Then should Switch Button "AÇIK" on Buttons Page
    #NORMAL MI KONTROL ET
    #SMALL MI KONTROL ET
    #KAPALI MI KONTROL ET
    #KAPALI TIKLA
    #AÇIK MI KONTROL ET

  @PopupMenuPage
  Scenario: Check Popup Menu Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Popup Menu" on Categories Page
    Then should see Title "Views/Popup Menu" on Popup Menu Page


  @PopupMenuPage @CheckActions
  Scenario: Check Popup Menu Page Actions
    Given user is on the Popup Menu Page
    Then should Make Popup Button "MAKE A POPUP!" on Popup Menu Page
    When taps Make Popup Button on Popup Menu Page
    Then should see Popup Element "Search" on Popup Menu Page
    Then should see Popup Element "Add" on Popup Menu Page
    Then should see Popup Element "Edit" on Popup Menu Page
    When taps Popup Element "Edit" on Popup Menu Page
    Then should see Popup Menu Tite "Edit" on Popup Menu Page
    #MAKE A POPUP! yazısını dogrula
    #MAKE A POPUP! yazısını tıla
    #MAKE A POPUP! elementlerini KONTROL
   #Search elementlerini KONTROL ET
  #Add elementlerini KONTROL ET
  #Edit elementlerini KONTROL ET
    #Edit elementini TIKLA
    #Edit yazısıını  KONTROL ET

  @RadioButtonPage
  Scenario: Check Radio Button Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Radio Group" on Categories Page
    Then should see Title "Views/Radio Group" on Radio Button Page

  @RadioButtonPage @CheckActions
  Scenario: Check Radio Button Page Actions
    Given user is on the Radio Button Page
    Then should see Radio Button "Snack" on Radio Button Page
    Then should see Radio Button "Breakfast" on Radio Button Page
    Then should see Radio Button "Lunch" on Radio Button Page
    Then should see Radio Button "Dinner" on Radio Button Page
    Then should see Radio Button "All of them" on Radio Button Page
    Then should see Clear Button "CLEAR" on Radio Button Page
    When taps to Radio Button "Dinner" on Radio Button Page
    Then should see Selected Text "2131296432" on Radio Button Page
    When taps to Radio Button "Lunch" on Radio Button Page
    Then should see Selected Text "2131296577" on Radio Button Page
     #Views/Radio Groupyazısını dogrula
    #Radio Group page sayfasına git
    #Views/Radio elementlerini KONTROL
   #Snack elementlerini KONTROL ET
  #Breakfast elementlerini KONTROL ET
  #Lunch elementlerini KONTROL ET
  #Dinner elementlerini KONTROL ET
  #All of them elementlerini KONTROL ET
    #Clear elementini KONTROL ET
    #Dinner elementini TIKLA
    #rakamı  KONTROL ET
#Lunch elementini TIKLA
  #rakamı  KONTROL ET

  @SearchView
  Scenario: Check Search View Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Search View" on Categories Page
    When taps "Action Bar" on Categories Page
    Then should see Title "Views/Search View/Action Bar" on Search View   Page

  @SearchView @CheckActions
  Scenario: Check Search View Page Actions
    Given user is on the Search View Page
    Then should see Search Button on Search View Page
    When taps to Search Button on Search View Page
    When sendkeys to Search Area "sumeyra" on Search View Page
    Then should see Result "sumeyra" on Search View Page

    #Views/Search View/Action Bar page sayfasına git
    #Views/Search View/Action Bar sayfasına gittigini dogrula
    #Search Buttonu tıklla
    #Search Buttonu "sumeyra" gonder
    #arattığında sumeyra yazısını kontrol et
  @Switches
  Scenario: Check Switches Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Switches" on Categories Page
    Then should see Switches Page

  @Switches @CheckActions
  Scenario: Check Radio Button Page Actions
    Given user is on the Switches Page
    Then should see Defaults Switch On on Switches Page
    When taps to Defaults Switch on Switches Page
    Then should see Defaults Switch Off on Switches Page


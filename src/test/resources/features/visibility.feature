@ApiDemos
Feature: Api Demos

@Visibility
Scenario: Check Visibility Page
Given user should see the Categories Page
When taps "Views" on Categories Page
When taps "Visibility" on Categories Page
Then should see "Views/Visibility" Visibility Page

@Visibility @CheckActions
Scenario: Check Visibility Page Actions
Given user is on the Visibility Page
Then should see View Text "VİS" on Visibility Page
Then should see Buttons "GONE" on Visibility Page
When taps to Buttons "INVİS" on Visibility Page
Then should not see View Text "View B" on Visibility Page
When taps to Buttons "VİS" on Visibility Page
Then should see View Text "View B" on Visibility Page

#Senaryo: Görünürlük Sayfası Eylemlerini Kontrol Edin
#Belirtilen kullanıcı Görünürlük Sayfasındadır
#Ardından, Görünürlük Sayfasında Metni Görüntüle "" görmelidir
#Ardından, Görünürlük Sayfasında "" Düğmelerini görmelisiniz
#Görünürlük Sayfasında "" Düğmelerine dokunulduğunda
#O zaman Görünürlük Sayfasında Metni Görüntüle "" görünmemelidir
#Görünürlük Sayfasında "" Düğmelerine dokunulduğunda
#Ardından, Görünürlük Sayfasında Metni Görüntüle "" görmelidir

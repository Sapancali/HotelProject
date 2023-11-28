@hotel_project
Feature:US0004

@new_code
  Scenario:TC_001_Otel_düzeltme_ve_silme_Positive_Test_Code_Degistirme
    Given kullanıcı crystalkeyhotels adresine gider
    And kullanıcı ustteki Login butonuna tiklar
    When kullanıcı username ve password girer
    Then kullanıcı Login butonuna tıklar
    Then kullanıcı Hotel Management dropDown'a tıklar
    Then kullanıcı Hotel List seçer
    Then kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
    Then kullanıcı Code butonuna tıklayıp yeni bir code girer
    Then kullanıcı Save butonuna tıklar
    Then kullanıcı Succesfully mesajına tıklar
    Then kullanıcı sekmeleri kapatır


  @new_name_and_address
    Scenario: TC_002_Otel_düzeltme_ve_silme_Positive_Test_isim_ve_adres_degistirme
      Given kullanıcı crystalkeyhotels adresine gider
      And kullanıcı ustteki Login butonuna tiklar
      When kullanıcı username ve password girer
      Then kullanıcı Login butonuna tıklar
      Then kullanıcı Hotel Management dropDown'a tıklar
      Then kullanıcı Hotel List seçer
      Then kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
      Then kullanıcı Name butonuna tıklayıp yeni bir isim girer
      Then kallanıcı Adres butonuna tıklayıp yeni bir Adres girer
      Then kullanıcı Save butonuna tıklar
      Then kullanıcı Succesfully mesajına tıklar
      Then kullanıcı sekmeleri kapatır

  @name_empty
    Scenario: TC_003_Otel_düzeltme_ve_silme_Negative_Test_Name_boş
      Given kullanıcı crystalkeyhotels adresine gider
      And kullanıcı ustteki Login butonuna tiklar
      When kullanıcı username ve password girer
      Then kullanıcı Login butonuna tıklar
      Then kullanıcı Hotel Management dropDown'a tıklar
      Then kullanıcı Hotel List seçer
      Then kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
      Then kullanıcı Name kısmını boş bırakır
      Then kullanıcı Save butonuna tıklar
      Then kullanıcı Name hata mesajını alır
      Then kullanıcı sekmeleri kapatır

  @address_empty
    Scenario: TC_004_Otel_düzeltme_ve_silme_Negative_Test_Address_boş
      Given kullanıcı crystalkeyhotels adresine gider
      And kullanıcı ustteki Login butonuna tiklar
      When kullanıcı username ve password girer
      Then kullanıcı Login butonuna tıklar
      Then kullanıcı Hotel Management dropDown'a tıklar
      Then kullanıcı Hotel List seçer
      Then kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
      Then kullanıcı Address kısmını boş bırakır
      Then kullanıcı Save butonuna tıklar
      Then kullanıcı Address hata mesajını alır
      Then kullanıcı sekmeleri kapatır


  @address_and_phone_empty
  Scenario: TC_005_Otel_düzeltme_ve_silme_Negative_Test_Address_ve_Phone_boş
    Given kullanıcı crystalkeyhotels adresine gider
    And kullanıcı ustteki Login butonuna tiklar
    When kullanıcı username ve password girer
    Then kullanıcı Login butonuna tıklar
    Then kullanıcı Hotel Management dropDown'a tıklar
    Then kullanıcı Hotel List seçer
    Then kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
    Then kullanıcı Address kısmını boş bırakır
    Then kullanıcı Phone kısmını boş bırakır
    Then kullanıcı Save butonuna tıklar
    Then kullanıcı Address ve Phone hata mesajını alır
    Then kullanıcı sekmeleri kapatır

  @hotel_delete
  Scenario: TC_006_Otel_silme_Positive_Test_Otel_silme
    Given kullanıcı crystalkeyhotels adresine gider
    And kullanıcı ustteki Login butonuna tiklar
    When kullanıcı username ve password girer
    Then kullanıcı Login butonuna tıklar
    Then kullanıcı Hotel Management dropDown'a tıklar
    Then kullanıcı Hotel List seçer
    Then kullanıcı hotel aramak için Code butonuna tıklar ve yeni bir kod girer
    Then Kullanıcı Search butonuna tıklar
    Then kullanıcı  hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar
    Then kullanıcı delete butonuna tıklar
    Then kullanıcı Would you like to continue? uyarısını görür ve OK tıklar
    Then kullanıcı sekmeleri kapatır

  @add_hotel_room
  Scenario: US006_TC001_Add_Hotel_Room
    Given kullanıcı crystalkeyhotels adresine gider
    And kullanıcı ustteki Login butonuna tiklar
    When kullanıcı username ve password girer
    Then kullanıcı Login butonuna tıklar
    Then kullanıcı Hotel Management dropDown'a tıklar
    Then kullanıcı Hotel Rooms butonuna tıklar
    Then kullanıcı ADD HOTELROOM a tıklar
    Then kullanıcı IDHotel den bir hotel seçer
    Then kullanıcı Code kısmına bir kod girer
    Then kullanıcı Name kısmına bir isim girer
    Then kullanıcı Lacation kısmına bir yer girer
    Then kullanıcı Price kısmına aşağıdan bir fiyat sürükler
    Then kullanıcı Room type kısmından bir oda tipi seçer
    Then kullanıcı Max Adult count kısmına bir sayı girer
    Then kullanıcı Max Children count kısmına bir sayı girer
    Then kullanıcı Approved kutucuğuna tıklar
    Then kullanıcı Save butonuna tıklar ve bilgileri kaydeder
    Then kullanıcı application kapatır

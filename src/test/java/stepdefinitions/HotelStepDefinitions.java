package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HotelDatatablesPage;
import pages.hotel.HotelLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class HotelStepDefinitions {

    HotelLoginPage hotelloginPage=new HotelLoginPage();
    pages.HotelDatatablesPage hotelDatatablesPage =new HotelDatatablesPage();
    @Given("kullanıcı crystalkeyhotels adresine gider")
    public void kullanıcı_crystalkeyhotels_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("hotel_url"));
        try{
            Thread.sleep(1000);
            hotelloginPage.advancedLink.click();
            Thread.sleep(1000);
            hotelloginPage.proceedLink.click();
            Thread.sleep(1000);
            hotelloginPage.advancedLink.click();
            Thread.sleep(1000);
            hotelloginPage.proceedLink.click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Advanced Link and Proceed Link is not displayed");
        }
    }
    @Given("kullanıcı ustteki Login butonuna tiklar")
    public void kullanıcı_ustteki_login_butonuna_tiklar() {
        hotelloginPage.ustlogin.click();
    }
    @When("kullanıcı username ve password girer")
    public void kullanıcı_username_ve_password_girer() {
        hotelloginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
        hotelloginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
    }
    @Then("kullanıcı Login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        hotelloginPage.loginButton.click();

    }
    @Then("kullanıcı Hotel Management dropDown'a tıklar")
    public void kullanıcı_hotel_management_drop_down_a_tıklar() {
        hotelDatatablesPage.hotelManagementLink.click();

    }
    @Then("kullanıcı Hotel List seçer")
    public void kullanıcı_hotel_list_seçer() throws InterruptedException {
        hotelDatatablesPage.hotelListLink.click();
        Thread. sleep(1000);

    }
    @Then("kullanıcı daha önce oluşturulan hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar")
    public void kullanıcı_daha_önce_oluşturulan_hotel_bilgilerinin_sağında_bulunan_detail_butonuna_tıklar() {
        hotelDatatablesPage.detailsButton.click();

    }
    @Then("kullanıcı Code butonuna tıklayıp yeni bir code girer")
    public void kullanıcı_code_butonuna_tıklayıp_yeni_bir_code_girer() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String herBirWindow : tumWindowsHandle){
            if (!herBirWindow.equals(window1Handle)){
                Driver.getDriver().switchTo().window(herBirWindow);
                break;
            }
        }
        hotelDatatablesPage.code.clear();
        hotelDatatablesPage.code.sendKeys(ConfigReader.getProperty("new_code"));
    }
    @Then("kullanıcı Save butonuna tıklar")
    public void kullanıcı_save_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(1000);
        hotelDatatablesPage.save.click();

    }
    @Then("kullanıcı Succesfully mesajına tıklar")
    public void kullanıcı_succesfully_mesajına_tıklar() throws InterruptedException {
        Thread.sleep(2000);
        hotelDatatablesPage.okbuton.click();
    }
    @Then("kullanıcı Name butonuna tıklayıp yeni bir isim girer")
    public void kullanıcı_name_butonuna_tıklayıp_yeni_bir_isim_girer() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String herBirWindow : tumWindowsHandle){
            if (!herBirWindow.equals(window1Handle)){
                Driver.getDriver().switchTo().window(herBirWindow);
                break;
            }
        }
        hotelDatatablesPage.name.clear();
        hotelDatatablesPage.name.sendKeys(ConfigReader.getProperty("new_name"));
    }
    @Then("kallanıcı Adres butonuna tıklayıp yeni bir Adres girer")
    public void kallanıcı_adres_butonuna_tıklayıp_yeni_bir_adres_girer() {
        hotelDatatablesPage.address.clear();
        hotelDatatablesPage.address.sendKeys(ConfigReader.getProperty("new_address"));
    }
    @Then("kullanıcı Name kısmını boş bırakır")
    public void kullanıcı_name_kısmını_boş_bırakır() throws InterruptedException {
        String window1Handle = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String herBirWindow : tumWindowsHandle){
            if (!herBirWindow.equals(window1Handle)){
                Driver.getDriver().switchTo().window(herBirWindow);
                break;
            }
        }
        Thread.sleep(1000);
        hotelDatatablesPage.name.clear();
    }
    @Then("kullanıcı Name hata mesajını alır")
    public void kullanıcı_name_hata_mesajını_alır() {
       Assert.assertTrue(hotelDatatablesPage.nameError.getText().contains("Name"));
}
    @Then("kullanıcı Address kısmını boş bırakır")
    public void kullanıcı_address_kısmını_boş_bırakır() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String herBirWindow : tumWindowsHandle){
            if (!herBirWindow.equals(window1Handle)){
                Driver.getDriver().switchTo().window(herBirWindow);
                break;
            }
        }
        hotelDatatablesPage.address.clear();
    }
    @Then("kullanıcı Address hata mesajını alır")
    public void kullanıcı_address_hata_mesajını_alır() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(hotelDatatablesPage.addressError.getText().contains("Address"));
    }
    @Then("kullanıcı Phone kısmını boş bırakır")
    public void kullanıcı_phone_kısmını_boş_bırakır() {

        hotelDatatablesPage.phone.clear();
    }
    @Then("kullanıcı Address ve Phone hata mesajını alır")
    public void kullanıcı_address_ve_phone_hata_mesajını_alır() {
        Assert.assertTrue(hotelDatatablesPage.addressError.getText().contains("Address"));
        Assert.assertTrue(hotelDatatablesPage.phoneError.getText().contains("Phone"));
    }
    @Then("kullanıcı delete butonuna tıklar")
    public void kullanıcı_delete_butonuna_tıklar() throws InterruptedException {
        String window1Handle = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowsHandle = Driver.getDriver().getWindowHandles();

        for (String herBirWindow : tumWindowsHandle){
            if (!herBirWindow.equals(window1Handle)){
                Driver.getDriver().switchTo().window(herBirWindow);
                break;
            }
        }
        hotelDatatablesPage.hotelDelete.click();
        Thread.sleep(1000);
    }
    @Then("kullanıcı Would you like to continue? uyarısını görür ve OK tıklar")
    public void kullanıcı_would_you_like_to_continue_uyarısını_görür_ve_ok_tıklar() {
        Assert.assertTrue(hotelDatatablesPage.deleteMessage.getText().contains("Would you like to continue?"));
        hotelDatatablesPage.deleteOk.click();
    }
    @Then("kullanıcı hotel aramak için Code butonuna tıklar ve yeni bir kod girer")
    public void kullanıcı_hotel_aramak_için_code_butonuna_tıklar_ve_yeni_bir_kod_girer() {
        hotelDatatablesPage.codeSearch.sendKeys(ConfigReader.getProperty("new_code"));
    }
    @Then("Kullanıcı Search butonuna tıklar")
    public void kullanıcı_search_butonuna_tıklar() throws InterruptedException {
        hotelDatatablesPage.search.click();
        Thread.sleep(1000);
    }
    @Then("kullanıcı  hotel bilgilerinin sağında bulunan DETAILS butonuna tıklar")
    public void kullanıcı_hotel_bilgilerinin_sağında_bulunan_details_butonuna_tıklar() {
        hotelDatatablesPage.searchDetailsButton.click();
    }
    @Then("kullanıcı Hotel Rooms butonuna tıklar")
    public void kullanıcı_hotel_rooms_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(1000);
        hotelDatatablesPage.hotelRooms.click();
    }
    @Then("kullanıcı ADD HOTELROOM a tıklar")
    public void kullanıcı_add_hotelroom_a_tıklar() {
        hotelDatatablesPage.addHotelRoom.click();
    }
    @Then("kullanıcı IDHotel den bir hotel seçer")
    public void kullanıcı_id_hotel_den_bir_hotel_seçer() {
        Select select=new Select(hotelDatatablesPage.idHotel);
        select.selectByVisibleText(ConfigReader.getProperty("idHotel"));
    }
    @Then("kullanıcı Code kısmına bir kod girer")
    public void kullanıcı_code_kısmına_bir_kod_girer() {
        hotelDatatablesPage.roomCode.sendKeys(ConfigReader.getProperty("customer_code"));
    }
    @Then("kullanıcı Name kısmına bir isim girer")
    public void kullanıcı_name_kısmına_bir_isim_girer() {
        hotelDatatablesPage.customerName.sendKeys(ConfigReader.getProperty("customer_name"));

    }
    @Then("kullanıcı Lacation kısmına bir yer girer")
    public void kullanıcı_lacation_kısmına_bir_yer_girer() {
        hotelDatatablesPage.location.sendKeys(ConfigReader.getProperty("location"));
    }
    @Then("kullanıcı Price kısmına aşağıdan bir fiyat sürükler")
    public void kullanıcı_price_kısmına_aşağıdan_bir_fiyat_sürükler() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        Thread.sleep(1000);
        actions.dragAndDrop(hotelDatatablesPage.price700, hotelDatatablesPage.price).perform();
    }
    @Then("kullanıcı Room type kısmından bir oda tipi seçer")
    public void kullanıcı_room_type_kısmından_bir_oda_tipi_seçer() {
        Select select=new Select(hotelDatatablesPage.roomType);
        select.selectByVisibleText(ConfigReader.getProperty("room_type"));
    }
    @Then("kullanıcı Max Adult count kısmına bir sayı girer")
    public void kullanıcı_max_adult_count_kısmına_bir_sayı_girer() {
        hotelDatatablesPage.maxAdult.sendKeys(ConfigReader.getProperty("max_adult"));
    }
    @Then("kullanıcı Max Children count kısmına bir sayı girer")
    public void kullanıcı_max_children_count_kısmına_bir_sayı_girer() {
        hotelDatatablesPage.maxChild.sendKeys(ConfigReader.getProperty("max_child"));
    }
    @Then("kullanıcı Approved kutucuğuna tıklar")
    public void kullanıcı_approved_kutucuğuna_tıklar() {
        hotelDatatablesPage.approved.click();
    }
    @Then("kullanıcı Save butonuna tıklar ve bilgileri kaydeder")
    public void kullanıcı_save_butonuna_tıklar_ve_bilgileri_kaydeder() throws InterruptedException {
        hotelDatatablesPage.customerSave.click();
        Thread.sleep(2000);
        hotelDatatablesPage.roomSuccessOk.click();
    }
    @Then("kullanıcı sekmeleri kapatır")
    public void kullanıcı_sekmeleri_kapatır() {
        // Yan sekmenin pencere ID'sini alın
        String newTabId = Driver.getDriver().getWindowHandles().toArray()[1].toString();

        // Yan sekmeyi kapatın
        Driver.getDriver().switchTo().window(newTabId);
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[0].toString());
        Driver.closeDriver();
    }
    @Then("kullanıcı application kapatır")
    public void kullanıcı_application_kapatır() {

        Driver.closeDriver();
    }

}

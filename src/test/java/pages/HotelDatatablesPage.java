package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HotelDatatablesPage {
    public HotelDatatablesPage(){PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Hotel Management")
    public WebElement hotelManagementLink;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@target='_blank']")
    public WebElement searchDetailsButton;

   @FindBy(id="Code")
    public WebElement code;

   @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement save;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okbuton;

    @FindBy(id="Name")
    public WebElement name;

    @FindBy(id="Address")
    public WebElement address;

    @FindBy(xpath = "//label[@for='Name']")
    public WebElement nameError;

    @FindBy(xpath = "//label[@for='Address']")
    public WebElement addressError;

    @FindBy(id="Phone")
    public WebElement phone;

    @FindBy(xpath = "//label[@for='Phone']")
    public WebElement phoneError;

    @FindBy(id="btnDelete")
    public WebElement hotelDelete;

    @FindBy (xpath = "//*[.='Would you like to continue?']")
    public WebElement deleteMessage;

    @FindBy (xpath = "//*[.='OK']")
    public WebElement deleteOk;

    @FindBy(name="Code")
    public WebElement codeSearch;

    @FindBy (xpath = "//*[.='Search']")
    public WebElement search;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(partialLinkText = "ADD HOTELROOM")
    public WebElement addHotelRoom;

    @FindBy(id = "IDHotel")
    public WebElement idHotel;

    @FindBy(id = "Code")
    public WebElement roomCode;

    @FindBy(id = "Name")
    public WebElement customerName;

    @FindBy(id = "Location")
    public WebElement location;

    @FindBy(id = "Price")
    public WebElement price;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChild;

    @FindBy(id = "IsAvailable")
    public WebElement approved;

    @FindBy(id = "btnSubmit")
    public WebElement customerSave;

    @FindBy (xpath = "//li[@data-id='700']")
    public WebElement price700;

     @FindBy (xpath = "//button[@data-bb-handler='ok']")
     public WebElement roomSuccessOk;


}

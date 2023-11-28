package pages.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelLoginPage {
    public HotelLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ustlogin;
    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id="btnSubmit")
    public WebElement loginButton;

    @FindBy(id="details-button")
    public WebElement advancedLink;

    @FindBy(id="proceed-link")
    public WebElement proceedLink;
}

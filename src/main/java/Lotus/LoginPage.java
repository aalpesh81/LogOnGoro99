package Lotus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Lotus.Utils.clickElement;
import static Lotus.Utils.typeText;

/**
 * Created by alpesh_savani on 21/11/2016.
 */
public class LoginPage extends DriverManager {

    @FindBy(name="uid")
    private WebElement _userName;

    @FindBy (name="password")
    private WebElement _password;

    @FindBy (xpath="//tr[3]/td[2]/input")
    private WebElement _loginBtn;

    public void logIn(){
        typeText(_userName, "mngr54753");
        typeText(_password, "YzUrabu");
        clickElement(_loginBtn);
    }
}

package Lotus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by alpesh_savani on 21/11/2016.
 */
public class Utils extends DriverManager{

    WebDriver driver;
//    public static void openBrowser(){
//        driver = new FirefoxDriver();
//    }
//
//    public static void openWebPage(){
//        driver.get("http://demo.nopcommerce.com/");
//    }


    public static void typeText(WebElement element, String text){
        element.sendKeys(text);
    }

    public static void clickElement(WebElement element){
        element.submit();
    }

    public static String getText(WebElement element){
        return element.getText();
    }
}

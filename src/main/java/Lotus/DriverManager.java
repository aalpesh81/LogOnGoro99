package Lotus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by alpesh_savani on 21/11/2016.
 */
public class DriverManager {

    protected static WebDriver driver;

    public DriverManager(){
        PageFactory.initElements(driver, this);
    }


    @BeforeMethod
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4/");
    }

    @AfterMethod
    public static void closeBrowser(){
        driver.quit();
    }

}

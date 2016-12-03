package Lotus;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by alpesh_savani on 21/11/2016.
 */
public class TestSuits extends DriverManager {

    @Test
    public static void logOnGuru99(){
        LoginPage loginPage = new LoginPage();
        loginPage.logIn();


        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scr, new File("C:/selenium/error.png"));
        } catch (IOException e){

        }
    }
}

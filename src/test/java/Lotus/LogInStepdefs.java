package Lotus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by alpesh_savani on 27/11/2016.
 */
public class LogInStepdefs {
    WebDriver driver;

    @Given("^user is on Guru99 login page$")
    public void user_is_on_Guru_login_page(int arg1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user enter valid credentils$")
    public void user_enter_valid_credentils() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be albe to see welcome user message$")
    public void user_should_be_albe_to_see_welcome_user_message()  {
        // Write code here that turns the phrase above into concrete actions
    }
}

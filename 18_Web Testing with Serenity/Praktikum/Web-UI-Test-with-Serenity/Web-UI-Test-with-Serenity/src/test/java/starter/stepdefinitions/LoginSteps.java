package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Homepage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    Homepage homepage;

    @Given("I am on the Login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("standard_user");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click Login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("I am on the homepage")
    public void onTheHomepage(){
        homepage.validateOnHomepage();
    }
}

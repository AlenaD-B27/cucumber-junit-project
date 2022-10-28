package com.cydeo.step_definitions;

import com.cydeo.pages.WebtableLoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {
    WebtableLoginPage webtableLoginPage = new WebtableLoginPage();

    @Given("user is on the login page of webtable app")
    public void user_is_on_the_login_page_of_webtable_app() {
        Driver.getDriver().get(ConfigReader.getProperty("webtable_env"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webtableLoginPage.inputUsername.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webtableLoginPage.inputPassword.sendKeys(password);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        webtableLoginPage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


    @When("user enters username {string}, password {string} and logs in")
    public void userEntersUsernamePasswordAndLogsIn(String username, String password) {
//        webtableLoginPage.inputUsername.sendKeys(username);
//        webtableLoginPage.inputPassword.sendKeys(password);
//        webtableLoginPage.loginButton.click();

        webtableLoginPage.login(username, password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {



        webtableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }
}

package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearBasePage;
import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;

public class SB_LoginSteps {

    SmartBearLoginPage loginPage = new SmartBearLoginPage();


    @When("User is logged into SmartBear Tester account on Order page")
    public void user_is_logged_into_smart_bear_tester_account_on_order_page(){

        Driver.getDriver().get(ConfigReader.getProperty("smart_bear_env"));
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("smart_bear_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("smart_bear_password"));
        loginPage.submitBtn.click();
        loginPage.goToOrder();


    }
}

package com.cydeo.step_definitions;


import com.cydeo.pages.WebtableLoginPage;
import com.cydeo.pages.WebtableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.Collection;


public class WebTableOrder_StepDefs {
    WebtableLoginPage loginPage = new WebtableLoginPage();
    WebtableOrderPage orderPage = new WebtableOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigReader.getProperty("webtable_env"));
        loginPage.login(ConfigReader.getProperty("webtable_username"), ConfigReader.getProperty("webtable_password"));
        loginPage.goToOrder();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        for(String eachOption: BrowserUtils.dropdownOptionsAsString(orderPage.productDropdown)){
            if(eachOption.equals(product)){
                orderPage.productDropdown.click();
            }
        }
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {

        orderPage.quantityBox.clear();
        orderPage.quantityBox.sendKeys(String.valueOf(quantity));
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String fullName) {
        orderPage.nameBox.sendKeys(fullName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        orderPage.streetBox.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.cityBox.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        orderPage.stateBox.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        orderPage.zipBox.sendKeys(zip);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
/*
       for(WebElement eachType : orderPage.creditCardRadios){
            if(eachType.getAttribute("value").equalsIgnoreCase(cardType)){
                eachType.click();
            }
          }
 */

        BrowserUtils.clickRadioButton(orderPage.creditCardRadios, cardType);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        orderPage.creditCardNumberBox.sendKeys(cardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expDate) {
        orderPage.expDateBox.sendKeys(expDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processBtn.click();
    }



}

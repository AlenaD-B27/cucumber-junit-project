package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearBasePage;
import com.cydeo.pages.SmartBearOrderPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SB_OrderSteps {

    SmartBearOrderPage orderPage = new SmartBearOrderPage();


    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {}
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String product) {
        orderPage.productDropdown.selectByVisibleText(product);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String number) {
        orderPage.quantityBox.sendKeys(number);
    }
    @When("User enters {string} to customer name")
    public void user_enters_to_customer_name(String fullName) {
        orderPage.nameBox.sendKeys(fullName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        orderPage.streetBox.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        orderPage.cityBox.sendKeys(city);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        orderPage.stateBox.sendKeys(state);
    }
    @When("User enters {string}")
    public void user_enters(String zip) {
        orderPage.zipBox.sendKeys(zip);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
        for(WebElement each : orderPage.radios){
            if(each.getAttribute("value").equals(cardType)){
                each.click();
            }
        }
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        orderPage.cardNumberBox.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
        orderPage.expirationBox.sendKeys(expDate);
    }
    @When("User clicks process button")
    public void user_clicks_button() {
        orderPage.processBtn.click();
    }








}

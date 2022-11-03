package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Etsy_StepDefinitions {

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
    }


    @Then("user sees {string} title")
    public void userSeesTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Given("user is on the Home page")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyHomePage.searchBox.sendKeys("Wooden Spoon");
    }
    @Then("user clicks search button")
    public void user_clicks_search_button() {
        etsyHomePage.searchBtn.click();
    }
    @Then("user sees Wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitleContains = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleContains));
    }

    @Then("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchWord) {
        etsyHomePage.searchBox.sendKeys(searchWord);
    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String titleContains) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(titleContains));
    }



}

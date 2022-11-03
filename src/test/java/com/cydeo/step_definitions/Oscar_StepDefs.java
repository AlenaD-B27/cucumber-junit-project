package com.cydeo.step_definitions;

import com.cydeo.pages.OscarPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Oscar_StepDefs {

OscarPage oscarPage = new OscarPage();
WebDriverWait explicitWait = new WebDriverWait(Driver.getDriver(), 10);



    @Given("Open Chrome browser")
    public void open_chrome_browser() {
    }
    @When("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(url);
    }
    @When("Click Search network")
    public void click_search_network() {
        oscarPage.searchButton.click();
    }
    @When("From Coverage year dropdown Select {string} option")
    public void from_coverage_year_dropdown_select_option(String year) {
        oscarPage.coverageYearDropdown.click();
        oscarPage.selectOption(year);
    }
    @When("From Coverage access dropdown Select {string} option")
    public void from_coverage_access_dropdown_select_option(String accessOption) {
        oscarPage.coverageAccessDropdown.click();
        oscarPage.selectOption(accessOption);
    }
    @When("From Network partner dropdown Select {string} option")
    public void from_network_partner_dropdown_select_option(String partnerOption) {
        oscarPage.networkPartnerDropdown.click();
        oscarPage.selectOption(partnerOption);
    }
    @When("From Coverage area dropdown Select {string}")
    public void from_coverage_area_dropdown_select(String coverageArea) {
        oscarPage.coverageAreaDropdown.click();
        oscarPage.selectOption(coverageArea);
    }
    @Then("Click Continue button")
    public void click_continue_button() {
        explicitWait.until(ExpectedConditions.elementToBeClickable(oscarPage.continueBtn));
        oscarPage.continueBtn.click();
    }
    @Then("Verify title contains {string}")
    public void verify_title_contains(String partlyTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(partlyTitle));
    }

}

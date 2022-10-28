package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearBasePage;
import com.cydeo.pages.SmartBearListPage;
import com.cydeo.utilities.BrowserUtils;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SB_ListSteps {


    SmartBearListPage listPage = new SmartBearListPage();

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {

        listPage.goToList();
        BrowserUtils.waitForVisibilityOf(listPage.header);

        String actualName = "";

        for(WebElement each : listPage.namesInTable()){
            if(each.getText().equals(expectedName)){
                actualName = each.getText();
            }
        }
        System.out.println(actualName);


        Assert.assertEquals(expectedName, actualName);

    }



}

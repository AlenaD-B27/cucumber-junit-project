package com.cydeo.step_definitions;

import com.cydeo.pages.WebtableListPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTableList_StepDefs {

    WebtableListPage listPage = new WebtableListPage();
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedData) {


        List<String> dataStrings = new ArrayList<>();

        for(WebElement each : listPage.firstRowTableData){
            dataStrings.add(each.getText());
        }


        String actualData = "";

        for(String eachData : dataStrings){
            if(eachData.equals(expectedData)){
                actualData = eachData;
                break;
            }
        }

        Assert.assertEquals(expectedData, actualData);

    }
}

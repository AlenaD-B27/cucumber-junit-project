package com.cydeo.pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebtableListPage extends WebtableBasePage {


    @FindBy(xpath = "//tbody/tr[1]/td")
    public List<WebElement> firstRowTableData;

    public List<String> dataToString(){
        List<String> dataStrings = new ArrayList<>();
        for(WebElement each : firstRowTableData){
            dataStrings.add(each.getText());
        }
        return dataStrings;
    }


}

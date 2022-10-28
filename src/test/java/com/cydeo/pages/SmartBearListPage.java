package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SmartBearListPage extends SmartBearBasePage{


    @FindBy(xpath = "//table[@rules='all']//tr/td")
    private List<WebElement> tableData;


    @FindBy(xpath = "//h2")
    public WebElement header;

    public List<WebElement> namesInTable(){
        List<WebElement> nameData = new ArrayList<>();
        for (int i = 1; i < tableData.size(); i += 13) {
            nameData.add(tableData.get(i));
        }
        return nameData;
    }




}

package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class SmartBearBasePage {

    public SmartBearBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement listOfOrdersModule;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderModule;

    public void goToList(){
        listOfOrdersModule.click();
    }

    public void goToOrder(){
        orderModule.click();
    }




}

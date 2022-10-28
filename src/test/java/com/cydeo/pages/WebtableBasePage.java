package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class WebtableBasePage {
    public WebtableBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[.='Order']")
    private WebElement orderModule;

    public void goToOrder(){
        orderModule.click();
    }

    @FindBy(xpath = "//button[.='View all orders']")
    private WebElement listOfOrdersModule;

    public void goToListOfOrders(){
        listOfOrdersModule.click();
    }




}

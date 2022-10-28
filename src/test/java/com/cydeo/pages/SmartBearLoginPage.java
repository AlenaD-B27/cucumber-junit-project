package com.cydeo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SmartBearLoginPage extends SmartBearBasePage {


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement submitBtn;


}

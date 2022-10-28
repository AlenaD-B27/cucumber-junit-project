package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class WebtableOrderPage extends WebtableBasePage{

    @FindBy(tagName = "select")
    public WebElement productDropdown;

    @FindBy(css = "input[name='quantity']")
    public WebElement quantityBox;

    @FindBy(css = "input[name='name']")
    public WebElement nameBox;

    @FindBy(css = "input[name='street']")
    public WebElement streetBox;

    @FindBy(css = "input[name='city']")
    public WebElement cityBox;

    @FindBy(css = "input[name='state']")
    public WebElement stateBox;

    @FindBy(css = "input[name='zip']")
    public WebElement zipBox;

    @FindBy(css = "input[type='radio']")
    public List<WebElement> creditCardRadios;

    @FindBy(css = "input[name='cardNo']")
    public WebElement creditCardNumberBox;

    @FindBy(css = "input[name='cardExp']")
    public WebElement expDateBox;

    @FindBy(css = "button[type='submit']")
    public WebElement processBtn;








}

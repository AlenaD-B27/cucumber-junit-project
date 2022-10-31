package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class WebtableOrderPage extends WebtableBasePage{

    @FindBy(name = "product")
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

    @FindBy(css = "input[name='card']")     //there might be more than one radio button in the same page, so they can have all the same attribute like type=radio, so type is not recommended as locator (bad habit)
    public List<WebElement> creditCardRadios;

    @FindBy(css = "input[name='cardNo']")
    public WebElement creditCardNumberBox;

    @FindBy(css = "input[name='cardExp']")
    public WebElement expDateBox;

    @FindBy(css = "button[type='submit']")
    public WebElement processBtn;








}

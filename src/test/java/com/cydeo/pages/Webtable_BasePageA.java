package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webtable_BasePageA {



        @FindBy(xpath = "//button[@class=\"button nav__item active\"]")
        public WebElement viewAllOrdersNavItemButton;

        @FindBy(css = "html > body > div:nth-of-type(1) > nav > div:nth-of-type(2) > a:nth-of-type(2) > button")
        public WebElement viewAllProductsNavItemButton;

        @FindBy(xpath = "//*[text() = 'Order']")
        public WebElement orderNavItemButton;

        @FindBy(xpath = "//button[@class=\"button __logout\"]")
        public WebElement logoutButton;

        public Webtable_BasePageA(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }


}

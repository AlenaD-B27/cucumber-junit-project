package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OscarPage {

    public OscarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void selectOption (String option){
        Driver.getDriver().findElement(By.xpath("//div//li[contains(@id, '" + option + "')]")).click();
    }


    @FindBy(xpath = "//button[.='Search network']")
    public WebElement searchButton;

    @FindBy(xpath = "//label[contains(@id,'Coverage year')]")
    public WebElement coverageYearDropdown;

    @FindBy(xpath = "//label[contains(@id,'Coverage access')]")
    public WebElement coverageAccessDropdown;

    @FindBy(xpath = "//label[contains(@id,'Network partner')]")
    public WebElement networkPartnerDropdown;

    @FindBy(xpath = "//label[contains(@id,'Coverage area')]")
    public WebElement coverageAreaDropdown;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueBtn;


}

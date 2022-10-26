package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(css = "span.wt-icon.wt-nudge-b-2.wt-nudge-r-1")
    public WebElement searchBtn;







}

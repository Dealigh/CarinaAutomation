package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Hotels extends BasicTravelsPage{


    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement add;

    public Hotels(WebDriver driver) {
        super(driver);
        setPageURL("/hotels");
    }
}

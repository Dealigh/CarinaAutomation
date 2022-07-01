package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Hotels extends BasicTravelsPage{


    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement openAdd;

    @FindBy(xpath = "//*[@id=\"layoutDrawer_content\"]/main/div/header/div/div/div[1]/p/small")
    private ExtendedWebElement tittle;

    public Hotels(WebDriver driver) {
        super(driver);
        setPageURL("/hotels");
    }

    public void oppeningAdd(){
        openAdd.click();
    }

    public String getTittle(){
       return tittle.getText();
    }
}

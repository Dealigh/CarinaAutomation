package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Hotels extends BasicTravelsPage {
    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement openAdd;

    @FindBy(xpath = "//p[@class=\"lead mb-0 text-white\"]")
    private ExtendedWebElement tittle;

    @FindBy(xpath = "//th[@data-orderby='pt_hotels.hotel_stars']")
    private ExtendedWebElement order;

    @FindBy(xpath = "//input[@value='30']")
    private ExtendedWebElement clickBox;

    @FindBy(xpath = "//a[@href=contains(text(),'Swissotel Le Plaza Basel')]")
    private ExtendedWebElement edit;

    @FindBy(xpath = "//a[@href=contains(text(),'Swissotel Le Plaza Basel')]")
    private ExtendedWebElement editOne;

    @FindBy(xpath = "//a[@href=contains(text(),'Jumeirah Beach Hotel')]")
    private ExtendedWebElement editJume;

    @FindBy(xpath = "//a[@href=contains(text(),'Grand Plaza')]")
    private ExtendedWebElement editPlaza;

    public Hotels(WebDriver driver) {
        super(driver);
        setPageURL("/hotels");
    }

    public void openingAddPage() {
        openAdd.click();
    }

    public String getTittle() {
        return tittle.getText();
    }

    public void justOrderTwice() {
        order.click();
        order.click();
    }

    public void setClickBox() {
        clickBox.click();
    }

    public void setEdit() {
        edit.click();
    }

    public void setEditJume() {
        editJume.click();
    }

    public void setEditPlaza() {
        editPlaza.click();
    }
}

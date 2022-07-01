package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TourEditPage extends BasicTravelsPage {
    private final static String URL_COMPLEMENT = "Spectaculars-Of-The-Nile-3-Nights";

    @FindBy(xpath = "//input[@name=\"tourname\"]")
    private ExtendedWebElement tourNameBox;

    @FindBy(xpath = "//*[@id=\"update\"]")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//select[@name=\"tourstars\"]")
    private ExtendedWebElement starsButton;

    @FindBy(xpath = "//option[@value=\"3\"]")
    private ExtendedWebElement selectStarsValue;

    @FindBy(xpath = "//input[@name=\"tourdays\"]")
    private ExtendedWebElement tourDaysBox;

    @FindBy(xpath = "//input[@name=\"ffrom\"]")
    private ExtendedWebElement fromBox;

    @FindBy(xpath = "//input[@name=\"fto\"]" )
    private ExtendedWebElement toBox;

    public TourEditPage(WebDriver driver) {
        super(driver);
        setPageURL("/tours/manage/" + URL_COMPLEMENT);
    }

    public void clickTourNameBox() {
        tourNameBox.click();
    }

    public void typeTourNameBox(String name) {
        tourNameBox.type(name);
    }

    public void clickSubmitButton () {
        submitButton.click();
    }

    public void clickStarsButton() {
        starsButton.click();
    }

    public void clickSelectStartsValue(){
        selectStarsValue.click();
    }

    public void clickTourDaysBox() {
        tourDaysBox.click();
    }

    public void typeTourDaysBox(String daysAmount) {
        tourDaysBox.type(daysAmount);
    }

    public void clickFromBox() {
        fromBox.click();
    }

    public void typeFromBox(String date) {
        fromBox.type(date);
    }

    public void clickToBox() {
        toBox.click();
    }

    public void typeToBox(String date){
        toBox.type(date);
    }
}

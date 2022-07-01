package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ToursPage extends BasicTravelsPage {

    @FindBy(xpath = "//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div/div[1]/div[3]/a")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//input[@name=\"phrase\"]")
    private ExtendedWebElement searchBox;

    @FindBy(xpath = "//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div/div[1]/div[3]/span[1]/span/a")
    private ExtendedWebElement searchGoButton;

    @FindBy(xpath = "//input[@value=\"36\"]")
    private ExtendedWebElement selectButton;

    @FindBy(xpath = "//*[@id=\"layoutDrawer_content\"]/main/div/div[1]/div/div[1]/div[2]/table/tbody/tr[1]/td[13]/span/a[1]")
    private ExtendedWebElement editButton;

    @FindBy(xpath = "//button[@id=\"deleteAll\"]")
    private ExtendedWebElement deleteButton;

    public ToursPage(WebDriver driver) {
        super(driver);
        setPageURL("/tours");
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void typeInSearchBox(String search) {
        searchBox.type(search);
    }

    public void clickSearchGoButton() {
        searchGoButton.click();
    }

    public void clickSelectButton() {
        selectButton.click();
    }

    public void clickEditButton() {
        editButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }
}

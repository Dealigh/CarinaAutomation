package com.solvd.Automation.webgui.pages.dropdownNav;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.Automation.webgui.components.LeftMenuBar;
import com.solvd.Automation.webgui.components.NavigationBar;
import com.solvd.Automation.webgui.pages.BasicTravelsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasicTravelsPage {

    @FindBy(xpath = "//nav[@class]")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//input[@name='slogan']")
    private ExtendedWebElement nameTextField;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private ExtendedWebElement saveChangesButton;

    @FindBy(xpath = "//h4[text()=\"Changes Saved!\"]")
    private ExtendedWebElement changesSavedText;

    public SettingsPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(saveChangesButton);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public void typeNameText(String newName) {
        nameTextField.type(newName);
    }

    public void clickSaveChangeButton() {
        saveChangesButton.click();
    }

    public boolean getChangesSavedText() {
        return changesSavedText.isElementPresent();
    }
}

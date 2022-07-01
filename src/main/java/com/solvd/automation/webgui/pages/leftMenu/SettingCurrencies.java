package com.solvd.automation.webgui.pages.leftMenu;

import com.solvd.automation.webgui.components.LeftMenuBar;
import com.solvd.automation.webgui.components.NavigationBar;
import com.solvd.automation.webgui.pages.BasicTravelsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SettingCurrencies extends BasicTravelsPage {

    @FindBy(xpath = "//nav[@class]")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    public SettingCurrencies(WebDriver driver) {
        super(driver);
    }
}

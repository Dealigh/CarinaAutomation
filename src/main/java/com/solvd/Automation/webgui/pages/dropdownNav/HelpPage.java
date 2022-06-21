package com.solvd.Automation.webgui.pages.dropdownNav;

import com.solvd.Automation.webgui.components.NavigationBar;
import com.solvd.Automation.webgui.pages.BasicTravelsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends BasicTravelsPage {

    @FindBy(className = "//nav[@class]")
    private NavigationBar navigationBar;

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}

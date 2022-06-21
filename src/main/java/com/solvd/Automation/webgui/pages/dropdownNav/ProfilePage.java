package com.solvd.Automation.webgui.pages.dropdownNav;

import com.solvd.Automation.webgui.components.NavigationBar;
import com.solvd.Automation.webgui.pages.BasicTravelsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasicTravelsPage {

    @FindBy(className = "//nav[@class]")
    private NavigationBar navigationBar;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}

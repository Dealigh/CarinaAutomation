package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.automation.webgui.components.BookingsMenu;
import com.solvd.automation.webgui.components.LeftMenuBar;
import com.solvd.automation.webgui.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasicTravelsPage {

    @FindBy(className = "navbar")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//div[@class='row gx-3']")
    private BookingsMenu buttonsBookings;

    @FindBy(xpath = "//h1[text()=\"Dashboard\"]")
    private ExtendedWebElement dashboardTitle;

    public DashboardPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(dashboardTitle);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public LeftMenuBar getLeftMenuBar() {
        return leftMenuBar;
    }

    public String getMainTitle() {
        return dashboardTitle.getText();
    }
}

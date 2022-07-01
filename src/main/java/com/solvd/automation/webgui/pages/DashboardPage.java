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

    @FindBy (xpath ="//a[@aria-controls='hotelsmodule']")
    private ExtendedWebElement hotels;

    @FindBy (xpath ="//a[@data-bs-target=\"#Hotels\"]")
    private ExtendedWebElement anotherHotels;

    @FindBy (xpath ="//*[@id=\"Hotels\"]/nav/a[1]")
    private ExtendedWebElement theLastHotels;

    @FindBy(xpath = "//a[@aria-controls='toursmodule']")
    private ExtendedWebElement toursFirstModule;

    @FindBy (xpath = "//a[@data-bs-target=\"#Tours\"]")
    private ExtendedWebElement toursSecondModule;

    @FindBy (xpath = "//*[@id=\"Tours\"]/nav/a[1]")
    private ExtendedWebElement toursThirdModule;

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

    public void clickHotel(){
        hotels.click();
    }

    public void secondHotel(){
        anotherHotels.click();
    }

    public void lastHotels(){
        theLastHotels.click();
    }

    public void clickTour() {
        toursFirstModule.click();
        toursSecondModule.click();
        toursThirdModule.click();
    }

}

package com.solvd.automation.webgui.pages;

import com.solvd.automation.webgui.components.BookingsMenu;
import com.solvd.automation.webgui.components.LeftMenuBar;
import com.solvd.automation.webgui.components.NavigationBar;
import com.solvd.automation.webgui.components.Table;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingsPage extends BasicTravelsPage {

    @FindBy(xpath = "//nav[@class]")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//div[@class='row gx-3']")
    private BookingsMenu bookingsMenuButtons;

    @FindBy(xpath = "//tbody")
    private Table bookingsTable;

    public BookingsPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public Table getBookingsTable() {
        return bookingsTable;
    }

    public BookingsMenu getBookingsMenu() {
        return bookingsMenuButtons;
    }
}

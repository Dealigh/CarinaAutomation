package com.solvd.Automation.webgui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.Automation.webgui.components.BookingsMenu;
import com.solvd.Automation.webgui.components.LeftMenuBar;
import com.solvd.Automation.webgui.components.NavigationBar;
import com.solvd.Automation.webgui.components.Table;
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

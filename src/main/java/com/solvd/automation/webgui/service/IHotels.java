package com.solvd.automation.webgui.service;

import com.solvd.automation.webgui.pages.DashboardPage;
import org.openqa.selenium.WebDriver;

public interface IHotels{
    default void hotels(WebDriver driver) {
        DashboardPage dash = new DashboardPage(driver);
        dash.clickHotel();
        dash.secondHotel();
        dash.lastHotels();
    }
}

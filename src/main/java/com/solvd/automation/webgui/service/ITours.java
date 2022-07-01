package com.solvd.automation.service;

import com.solvd.automation.webgui.pages.DashboardPage;
import org.openqa.selenium.WebDriver;

public interface ITours {
    default void tours (WebDriver driver) {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickTour();
    }
}

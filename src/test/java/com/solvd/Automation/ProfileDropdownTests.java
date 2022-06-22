package com.solvd.Automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.Automation.webgui.pages.DashboardPage;
import com.solvd.Automation.webgui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileDropdownTests extends BasicTravelTest {

    @Test(description = "User logout from profile dropdown, 4")
    @MethodOwner(owner = "Rodriguez_Daniel")
    public void logOutSession() {
        authUtil.login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage
                .getNavigationBar()
                .openProfileDropdown()
                .clickLogout();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPageOpened());
    }
}

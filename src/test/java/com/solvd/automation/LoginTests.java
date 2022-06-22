package com.solvd.automation;


import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.solvd.automation.webgui.pages.DashboardPage;
import com.solvd.automation.webgui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BasicTravelTest {

    @Test(description = "Forgot Account Button Test, 1")
    @MethodOwner(owner = "Rodriguez_Daniel")
    public void testForgotAccButton() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.open();
        loginPage.clickForgotAcc();
        loginPage.typeResetEmail("user@jstravels.org");
        pause(3);
        loginPage.clickResetButton();
        Assert.assertEquals(loginPage.getEmailNotFoundText(), "Email Not Found");
    }

    @Test(description = "Login Test, 2")
    @MethodOwner(owner = "Rodriguez_Daniel")
    public void testLoginAdminAcc() {
        authUtil.login();
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isPageOpened());
    }
}

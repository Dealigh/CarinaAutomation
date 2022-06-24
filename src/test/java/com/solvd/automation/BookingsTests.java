package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.webgui.components.BookingsMenu;
import com.solvd.automation.webgui.components.Table;
import com.solvd.automation.webgui.pages.BookingsPage;
import com.solvd.automation.webgui.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingsTests extends BasicTravelTest {

    @Test(description = "Unpaid booking condition, 5")
    @MethodOwner(owner = "Rodriguez_Daniel")
    public void testUnpaidBookingsMenu() {
        login(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        BookingsMenu bookingsMenu = dashboardPage
                .getNavigationBar()
                .openBookingsPage()
                .getBookingsMenu();
        BookingsPage bookingsPage = bookingsMenu.clickUnpaidBookingButton();
        Table table = bookingsPage.getBookingsTable();

        String bookingStatus = table.getChosenPaidStatus(Integer.toString(1)).toUpperCase();
        Assert.assertEquals(bookingStatus, "UNPAID");
    }
}

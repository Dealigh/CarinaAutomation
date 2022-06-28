package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.solvd.automation.webgui.pages.Hotels;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelTest extends BasicTravelTest {

    @Test(description = "Entering Hotels Page after Log In")
    @MethodOwner(owner = "Gabriel")
    public void hotelTest() {
        login(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        Assert.assertTrue(hotels.isPageOpened());
    }

}

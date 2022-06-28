package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.solvd.automation.webgui.pages.leftMenu.Hotels;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelTest extends BasicTravelTest {

    @Test(description = "Entering Hotels Page after Log In")
    @MethodOwner(owner = "LGK")
    public void hotelTest() {
        login(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        Assert.assertTrue(hotels.isPageOpened());
    }

    @Test(description = "Entering Hotels")
    @MethodOwner(owner = "LGK")
    public void hotelPage() {
        hotels(getDriver());
    }
}

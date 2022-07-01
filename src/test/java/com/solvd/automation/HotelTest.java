package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.solvd.automation.webgui.pages.HotelEditPage;
import com.solvd.automation.webgui.pages.Hotels;

import com.solvd.automation.webgui.pages.HotelsAdd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelTest extends BasicTravelTest {

    @Test(description = "Entering Hotels Page after Log In")
    @MethodOwner(owner = "Gabriel")
    public void hotelTest() {
        login.loginService(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        Assert.assertEquals(hotels.getTittle(), "Hotels Management");
    }

    @Test(description = "Entering Add Web Page")
    @MethodOwner(owner = "Gabriel")
    public void addTestPage() {
        login.loginService(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        HotelsAdd newAdd = new HotelsAdd(getDriver());
        hotels.openingAddPage();
        Assert.assertTrue(newAdd.isPageOpened());
    }

    @Test(description = "Trying to Add a New Hotel")
    @MethodOwner(owner = "Gabriel")
    public void addHotelTrouble() {
        login.loginService(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        hotels.openingAddPage();
        HotelsAdd newHotel = new HotelsAdd(getDriver());
        newHotel.typeName("Mar del Plata");
        newHotel.getLocation();
        newHotel.typingBA("buenos aires");
        newHotel.clickBA();
        newHotel.submit();
        Assert.assertTrue(hotels.isPageOpened());
    }

    @Test(description = "sorting out in descending stars ranking and editing one")
    @MethodOwner(owner = "Gabriel")
    public void selectAndEdit() {
        login.loginService(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        hotels.justOrderTwice();
        hotels.setClickBox();
        hotels.setEdit();
        HotelEditPage edit = new HotelEditPage(getDriver());
        Assert.assertEquals(edit.getTitle(), "Main Settings");
    }

    @Test(description = "Checking 3 hotels and returning to hotels page")
    @MethodOwner(owner = "Gabriel")
    public void movingBackAndFoward() {
        login.loginService(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        hotels.justOrderTwice();
        getDriver().navigate().refresh();
        hotels.setEdit();
        getDriver().navigate().back();
        hotels.setEditJume();
        getDriver().navigate().back();
        hotels.setEditPlaza();
        getDriver().navigate().back();
        Assert.assertTrue(hotels.isPageOpened());
    }
}

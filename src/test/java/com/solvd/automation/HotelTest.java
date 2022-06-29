package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.solvd.automation.webgui.pages.Hotels;

import com.solvd.automation.webgui.pages.HotelsAdd;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelTest extends BasicTravelTest {

    @Test(description = "Entering Hotels Page after Log In")
    @MethodOwner(owner = "Gabriel")
    public void hotelTest() {
        login(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        //  Assert.assertTrue(hotels.isPageOpened());
        Assert.assertEquals(hotels.getTittle(), "Hotels Management");
    }

    @Test(description = "Entering Add Web Page")
    @MethodOwner(owner = "Gabriel")
    public void addTestPage() {
        login(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        HotelsAdd newAdd = new HotelsAdd(getDriver());
        hotels.oppeningAdd();
        Assert.assertTrue(newAdd.isPageOpened());
    }


    @Test(description = "Entering Add Web Page")
    @MethodOwner(owner = "Gabriel")
    public void addHotel() {
        login(getDriver());
        hotels(getDriver());
        Hotels hotels = new Hotels(getDriver());
        hotels.oppeningAdd();
        HotelsAdd newHotel = new HotelsAdd(getDriver());
        newHotel.typeName("Mar del Plata");
        newHotel.clickBeforeDescription();
//        newHotel.typeDescription("asd").sendKeys();
//        newHotel.typeDescription("asd").sendKeys(Keys.valueOf("description of the hotel"));
        newHotel.getLocation();
        newHotel.typingBA("buenos aires");
        newHotel.clickBA();
//        newHotel.submit();

    }


}

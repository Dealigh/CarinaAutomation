package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.webgui.pages.TourEditPage;
import com.solvd.automation.webgui.pages.ToursPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTest extends BasicTravelTest {

    private final static String SEARCH = "Hong";
    private final static String EDIT_TITTLE = "Spectaculars Of The Nile 4 Nights";
    private final static String EDIT_DAYS = "4";
    private final static String FROM_DATE = "20/08/2022";
    private final static String TO_DATE = "30/08/2022";
    ;

    @Test(description = "Go to tours page after login.")
    @MethodOwner(owner = "Leandro")
    public void goToToursPage() {
        login.loginService(getDriver());
        tours(getDriver());
        ToursPage toursPage = new ToursPage(getDriver());
        Assert.assertTrue(toursPage.isPageOpened());
    }

    @Test(description = "Search tours by name")
    @MethodOwner(owner = "Leandro")
    public void searchTourTest() {
        goToToursPage();
        ToursPage toursPage = new ToursPage(getDriver());
        toursPage.clickSearchButton();
        toursPage.typeInSearchBox(SEARCH);
        toursPage.clickSearchGoButton();
        Assert.assertTrue(toursPage.isPageOpened());
    }

    @Test(description = "Select one tour.")
    @MethodOwner(owner = "Leandro")
    public void selectTourTest() {
        goToToursPage();
        ToursPage toursPage = new ToursPage(getDriver());
        toursPage.clickSelectButton();
    }

    @Test(description = "Edit one selected tour.")
    @MethodOwner(owner = "Leandro")
    public void editTourTest() {
        goToToursPage();
        ToursPage toursPage = new ToursPage(getDriver());
        toursPage.clickEditButton();
        TourEditPage tourEditPage = new TourEditPage(getDriver());
        Assert.assertTrue(tourEditPage.isPageOpened());
        tourEditPage.clickTourNameBox();
        tourEditPage.typeTourNameBox(EDIT_TITTLE);
        tourEditPage.clickStarsButton();
        tourEditPage.clickSelectStartsValue();
        tourEditPage.clickTourDaysBox();
        tourEditPage.typeTourDaysBox(EDIT_DAYS);
        tourEditPage.clickFromBox();
        tourEditPage.typeFromBox(FROM_DATE);
        tourEditPage.clickToBox();
        tourEditPage.typeToBox(TO_DATE);
        pause(5);
        //tourEditPage.clickSubmitButton();
        //Assert.assertTrue(toursPage.isPageOpened());
    }

    @Test(description = "Delete one selected tour.")
    @MethodOwner(owner = "Leandro")
    public void deleteTourEdit() {
        selectTourTest();
        ToursPage toursPage = new ToursPage(getDriver());
        toursPage.clickDeleteButton();
        Assert.assertTrue(toursPage.isPageOpened());
    }
}

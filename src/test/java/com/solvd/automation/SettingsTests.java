
package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.webgui.pages.DashboardPage;
import com.solvd.automation.webgui.pages.dropdownNav.SettingsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTests extends BasicTravelTest {

    @Test(description = "Change name in Settings, 3")
    @MethodOwner(owner = "Rodriguez_Daniel")
    public void testChangeName() {
        login(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        SettingsPage settingsPage = dashboardPage.getLeftMenuBar().openSettingsSubmenu();

        settingsPage.typeNameText("JS Travels | Travel Technology Partner");
        pause(3);
        settingsPage.clickSaveChangeButton();

        Assert.assertTrue(settingsPage.getChangesSavedText());
    }
}

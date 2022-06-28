package com.solvd.automation.webgui.pages.leftMenu;

import com.solvd.automation.webgui.pages.BasicTravelsPage;
import org.openqa.selenium.WebDriver;

public class Hotels extends BasicTravelsPage {

    public Hotels(WebDriver driver) {
        super(driver);
        setPageURL("/hotels");
    }

}

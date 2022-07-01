package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HotelEditPage extends BasicTravelsPage{


    @FindBy(xpath = "//h4[@class='mb-3']")
    private ExtendedWebElement title;



    public HotelEditPage(WebDriver driver) {
        super(driver);
        setPageURL("/hotels/manage/Rendezvous-Hotels");

    }


    public String getTitle(){
        return title.getText();
    }


}

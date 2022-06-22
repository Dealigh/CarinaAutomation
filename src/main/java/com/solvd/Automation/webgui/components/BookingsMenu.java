package com.solvd.Automation.webgui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.Automation.webgui.pages.BookingsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookingsMenu extends AbstractUIObject{

    @FindBy(xpath = "//div[text() = \"Confrimed Bookings\"]")
    private ExtendedWebElement confirmedButton;

    @FindBy(xpath = "//div[text() = \"Pending Bookings\"]")
    private ExtendedWebElement pendingButton;

    @FindBy(xpath = "//div[text() = \"Cancelled Bookings\"]")
    private ExtendedWebElement cancelButton;

    @FindBy(xpath = "//div[text() = \"Paid Bookings\"]")
    private ExtendedWebElement paidButton;

    @FindBy(xpath = "//div[text() = \"Unpaid Bookings\"]")
    private ExtendedWebElement unpaidButton;

    @FindBy(xpath = "//div[text() = \"Refunded Bookings\"]")
    private ExtendedWebElement refundedButton;

    public BookingsMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public BookingsPage clickUnpaidBookingButton() {
        unpaidButton.click();
        return new BookingsPage(getDriver());
    }
}

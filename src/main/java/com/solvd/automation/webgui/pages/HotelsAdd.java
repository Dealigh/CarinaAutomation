package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class HotelsAdd extends BasicTravelsPage{

    @FindBy(xpath = "//*[@id='add']")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//input[@name='hotelname']")
    private ExtendedWebElement hotelNameInput;

    @FindBy(xpath = "//iframe[@title='Rich Text Editor, hoteldesc']")
    private ExtendedWebElement clickHotelDescriptionInput;

    @FindBy(xpath = "//*[@id='cke_1_contents']//iframe")
    private ExtendedWebElement hotelDescriptionInput;

    @FindBy (xpath = "//div[@class='select2-container locationlist']")
    private ExtendedWebElement location;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
    private ExtendedWebElement typeBA;

    @FindBy(xpath = "//*[@id='select2-drop']/ul/li[2]/div/span")
    private ExtendedWebElement buenosAires;


    public HotelsAdd(WebDriver driver) {
        super(driver);
        setPageURL("/hotels/add");
    }


    public void submit(){
        submitButton.click();
    }

    public void typeName(String name){
        hotelNameInput.type(name);
    }

    public void clickBeforeDescription(){
        clickHotelDescriptionInput.click();
    }

    public void typeDescription(String description ){
        hotelDescriptionInput.type(description);
    }

    public void getLocation(){
        location.click();
    }

    public void typingBA(String name){
        typeBA.type(name);
    }

    public void clickBA(){
        buenosAires.click();
    }

}

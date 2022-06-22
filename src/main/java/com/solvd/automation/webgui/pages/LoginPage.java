package com.solvd.automation.webgui.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasicTravelsPage {

    @FindBy(xpath = "//input[@name='email']")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//label[@class='checkbox']")
    private ExtendedWebElement rememberMeCheck;

    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@id='link-forgot']")
    private ExtendedWebElement forgotAccButton;

    @FindBy(xpath = "//input[@id='resetemail']")
    private ExtendedWebElement emailResetInput;

    @FindBy(xpath = "//button[@id='btn-forgot']")
    private ExtendedWebElement resetEmailButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private ExtendedWebElement forgotAccountText;

    @FindBy(xpath = "//div[text()=\"Redirecting Please Wait...\"]")
    private ExtendedWebElement succesfulLoginText;

    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(loginButton);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public void clickSubmitButton() {
        loginButton.click();
    }

    public void clickForgotAcc() {
        forgotAccButton.click();
    }

    public void typeEmail(String email) {
        emailInput.type(email);
    }

    public void typePassword(String password) {
        passwordInput.type(password);
    }

    public String getEmail() {
        return emailInput.getText();
    }

    public String getText() {
        return passwordInput.getText();
    }

    public void clickRememberMeCheck() {
        rememberMeCheck.click();
    }

    public void typeResetEmail(String email) {
        emailResetInput.type(email);
    }

    public void clickResetButton() {
        resetEmailButton.click();
    }

    public String getEmailNotFoundText() {
        return forgotAccountText.getText();
    }

    public String getSuccesfullLoginText() {
        return succesfulLoginText.getText();
    }
}

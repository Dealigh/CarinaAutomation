package com.solvd.automation.webgui.service;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.solvd.automation.webgui.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Login {

    public void loginService(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(R.TESTDATA.get("test_account"));
        loginPage.typePassword(R.TESTDATA.get("test_password"));
        loginPage.clickSubmitButton();
    }
}

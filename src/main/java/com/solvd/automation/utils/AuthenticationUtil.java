package com.solvd.automation.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.solvd.automation.webgui.pages.LoginPage;

public class AuthenticationUtil implements IDriverPool {

    public void login() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        loginPage.typeEmail(R.TESTDATA.get("test_account"));
        loginPage.typePassword(R.TESTDATA.get("test_password"));
        loginPage.clickSubmitButton();
    }
}

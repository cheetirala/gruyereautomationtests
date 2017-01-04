package com.gruyere.tests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject{

    @FindBy(name="uid")
    private WebElementFacade userid;

    @FindBy(name="pw")
    private WebElementFacade passwd;

    @FindBy(xpath="//input[@type='submit']")
    private WebElementFacade submit;

    public void login_with_credentials(String username, String password){
        userid.type(username);
        passwd.type(password);
        submit.click();
    }

}

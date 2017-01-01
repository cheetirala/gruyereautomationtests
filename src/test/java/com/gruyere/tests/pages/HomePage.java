package com.gruyere.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://google-gruyere.appspot.com/781631377927/")
public class HomePage extends PageObject {

    @FindBy(linkText="Sign up")
    private WebElementFacade signUp;

    public void go_to_signup_page() {
         signUp.click();
    }
}
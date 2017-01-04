package com.gruyere.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://google-gruyere.appspot.com/781631377927/")
public class HomePage extends PageObject {

    @FindBy(linkText="Sign up")
    private WebElementFacade signUp;

    @FindBy(linkText="Sign in")
    private WebElementFacade signIn;

    @FindBy(linkText="New Snippet")
    private WebElementFacade newSnippet;

    @FindBy(linkText="Upload")
    private WebElementFacade upload;

    public void go_to_signup_page() {
         signUp.click();
    }

    public void go_to_signIn_page() {
        signIn.click();
    }

    public void go_to_create_snippet_page() {
        newSnippet.click();
    }

    public void go_to_upload_page() {
        upload.click();
    }
}
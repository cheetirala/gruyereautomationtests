package com.gruyere.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewSnippetPage extends PageObject{

    @FindBy(name="snippet")
    private WebElementFacade snippetDetails;

    @FindBy(xpath="//input[@type='submit']")
    private WebElementFacade submit;

    public void add_snippet_details(String details) {
        snippetDetails.type(details);
    }

    public void submit_snippet() {
        submit.click();
    }
}

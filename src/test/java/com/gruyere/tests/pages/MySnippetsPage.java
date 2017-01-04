package com.gruyere.tests.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MySnippetsPage extends PageObject{

    @FindBy(xpath="/html/body/div[2]/div[2]/table/tbody/tr[2]/td[3]")
    private WebElementFacade firstSnippet;

    public String getFirstSnippet() {
        return firstSnippet.getText();
    }
}

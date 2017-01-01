package com.gruyere.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SignUpPage extends PageObject {

  @FindBy(name="uid")
  private WebElementFacade userid;

    @FindBy(name="pw")
    private WebElementFacade passwd;

    @FindBy(xpath="//input[@type='submit']")
    private WebElementFacade submit;

  @FindBy(css=".message")
  private WebElementFacade successMessage;

    public void enter_username(String username) {
      userid.type(username);
    }


    public void enter_password(String password) {
        passwd.type(password);
    }


    public void submit() {
       submit.click();
    }

    public String getSuccessMessage(){
      return successMessage.getText();
    }
}
package com.gruyere.tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FileUploadPage extends PageObject{

    @FindBy(name="upload_file")
    private WebElementFacade chooseFile;

    @FindBy(xpath="//input[@type='submit']")
    private WebElementFacade submit;

    @FindBy(xpath="/html/body/div[2]/h2")
    private WebElementFacade uploadMessage;


    public void uploadFile(String file) {
        chooseFile.sendKeys(file);
        submit.click();
    }

    public String getSuccessMessage() {
        return uploadMessage.getText();
    }
}

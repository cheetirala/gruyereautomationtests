package com.gruyere.tests.steps;

import com.gruyere.tests.steps.serenity.EndUserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UploadSteps {
    @Steps
    private EndUserSteps userSteps;

    @When("^I would like to upload a file$")
    public void i_would_like_to_upload_a_file() throws Throwable {
         userSteps.navigate_to_upload_page();
    }

    @When("^I upload a file (.*)$")
    public void i_upload_a_file_test_txt(String fileName) throws Throwable {
        userSteps.upload_file(System.getProperty("user.dir") + "/" + fileName);
    }

    @Then("^(.*) message should be displayed$")
    public void upload_Complete_message_should_be_displayed(String uploadMessage) throws Throwable {
        userSteps.should_display_upload_complete_message(uploadMessage);
    }

}

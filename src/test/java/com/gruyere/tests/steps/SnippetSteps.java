package com.gruyere.tests.steps;

import com.gruyere.tests.steps.serenity.EndUserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SnippetSteps {

    @Steps
    private EndUserSteps userSteps;

    @When("^I log into Gruyere with valid credentials (.*) (.*)$")
    public void i_log_into_Gruyere_with_valid_credentials(String username, String password) throws Throwable {
       userSteps.login_with_valid_credentials(username, password);
    }

    @When("^I would like to create a new snippet$")
    public void i_would_like_to_create_a_new_snippet() throws Throwable {
          userSteps.would_like_to_create_new_snippet();
    }

    @When("^I enter snippet details(.*)$")
    public void i_enter_snippet_details(String snippetDetails) throws Throwable {
          userSteps.enter_snippet_details(snippetDetails);
    }

    @When("^I submit the snippet details$")
    public void submit_the_snippet_details() throws Throwable {
        userSteps.submit_snippet();
    }

    @Then("^a new snippet (.*) should be created$")
    public void a_new_snippet_should_be_created(String snippet) throws Throwable {
        userSteps.new_snippet_should_be_created(snippet);
    }
}

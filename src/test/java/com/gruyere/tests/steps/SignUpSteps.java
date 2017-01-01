package com.gruyere.tests.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.gruyere.tests.steps.serenity.EndUserSteps;

public class SignUpSteps {

    @Steps
    EndUserSteps userSteps;

    @Given("^I navigate to Gruyere home page$")
    public void i_navigate_to_Gruyere_home_page() throws Throwable {
      userSteps.is_the_home_page();
    }

    @When("^I would like to sign up$")
    public void i_would_like_to_sign_up() throws Throwable {
       userSteps.navigate_to_signup_page();
    }

    @When("^I enter my username (.*)$")
    public void i_enter_my_username(String username) throws Throwable {
       userSteps.enter_username(username);
    }

    @When("^I enter my password (.*)$")
    public void i_enter_my_password(String password) throws Throwable {
      userSteps.enter_password(password);
    }
    @When("^I submit my credentials$")
    public void i_submit_my_credentials() throws Throwable {
     userSteps.submit_credentials();
    }

    @Then("^an account is created successfully$")
    public void an_account_is_created() throws Throwable {
      userSteps.verify_account_created();
    }
}

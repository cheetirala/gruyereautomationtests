package com.gruyere.tests.steps.serenity;

import com.gruyere.tests.pages.HomePage;
import com.gruyere.tests.pages.SignUpPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps  {

    HomePage homePage;
    SignUpPage signUpPage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void navigate_to_signup_page() {
        homePage.go_to_signup_page();
    }

    @Step
    public void enter_username(String username) {
       signUpPage.enter_username(username);
    }

    @Step
    public void enter_password(String password) {
        signUpPage.enter_password(password);
    }

    @Step
    public void submit_credentials() {
        signUpPage.submit();
    }

    @Step
    public void verify_account_created() {
        assertThat(signUpPage.getSuccessMessage()).isEqualTo("Account created.");
    }
}
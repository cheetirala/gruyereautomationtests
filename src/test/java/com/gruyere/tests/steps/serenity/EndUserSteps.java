package com.gruyere.tests.steps.serenity;

import com.gruyere.tests.pages.*;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps  {

    private HomePage homePage;
    private SignUpPage signUpPage;
    private SignInPage signInPage;
    private NewSnippetPage snippetPage;
    private MySnippetsPage mySnippetsPage;
    private FileUploadPage uploadPage;

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
        double random = Math.random() * 1000 + 1;
        signUpPage.enter_username(username + random);
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

    @Step
    public void login_with_valid_credentials(String username, String password){
        homePage.go_to_signIn_page();
        signInPage.login_with_credentials(username, password);
    }

    @Step
    public void would_like_to_create_new_snippet(){
        homePage.go_to_create_snippet_page();
    }

    @Step
    public void enter_snippet_details(String details){
        snippetPage.add_snippet_details(details);
    }

    @Step
    public void submit_snippet(){
        snippetPage.submit_snippet();
    }

    @Step
    public void new_snippet_should_be_created(String snippet) {
        assertThat(mySnippetsPage.getFirstSnippet()).isEqualTo(snippet);
    }

    @Step
    public void navigate_to_upload_page() {
        homePage.go_to_upload_page();
    }

    @Step
    public void upload_file(String fileName) {
        uploadPage.uploadFile(fileName);
    }

    @Step
    public void should_display_upload_complete_message(String uploadMessage) {
        assertThat(uploadPage.getSuccessMessage()).isEqualTo(uploadMessage);
    }
}
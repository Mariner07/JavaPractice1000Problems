package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDefinition {
    @Given("user opens website")
    public void openWebsite() {

    }
    @Given("user is on login page")
    public void verifyLoginPage() {
    }
    @When("user enters username {string} and password {string}")
    public void doLogin(String string, String string2) {

    }
    @When("click on login button")
    public void click_on_login_button() {

    }
    @Then("verify user is navigated to homepage")
    public void verify_user_is_navigated_to_homepage() {

    }

    @When("user clicks on logout")
    public void userClicksOnLogout() {
        
        
    }

    @Then("verify user is faced with error")
    public void verifyUserIsFacedWithError() {
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
    }

    @Then("verify user is navigated to login page")
    public void verifyUserIsNavigatedToLoginPage() {
        
    }

    @Then("verify user is on homege")
    public void verifyUserIsOnHomege() {
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        
    }

    @Given("Mark opens website")
    public void markOpensWebsite() {
        
    }

    @And("Mark on login page")
    public void markOnLoginPage() {
        
    }

    @When("Mark enters invalid login {string} and invalid password {string}")
    public void markEntersInvalidLoginAndInvalidPassword(String arg0, String arg1) {


    }

    @Then("verify error message shows up")
    public void verifyErrorMessageShowsUp() {
    }

    @Then("verify table has below data")
    public void verifyTableHasBelowData(DataTable dataTable) {
        List<List<String>> data= dataTable.asLists();

        for(int i =0; i<data.size(); i++){
            for(int j=0; j<data.get(i).size(); j++){
                System.out.print(data.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    @When("user clicks on user badge icon")
    public void userClicksOnUserBadgeIcon() {
    }

    @And("select on logout option")
    public void selectOnLogoutOption() {
    }
}

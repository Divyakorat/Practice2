package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterSussess registerSussess=new RegisterSussess();
    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
        homePage.verifyUserIsOnHomePage();

    }

    @When("^user click on my Account$")
    public void user_click_on_my_Account()  {
        homePage.userClickOnMyAccount();

    }

    @When("^user click on register$")
    public void user_click_on_register()  {
        homePage.userclickonregister();

    }

    @When("^user Enter all details$")
    public void user_Enter_all_details()  {
        registerPage.UserEnterRegistrationDetails();

    }

    @Then("^user should be able see success message successfully$")
    public void user_should_be_able_see_success_message_successfully()  {
        registerSussess.registerSuccssMessage();

    }


}

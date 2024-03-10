package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.ResultPage;
import pageobjects.SignInPage;

public class AmazonSteps {
    @Given("user enter the productname")
    public void userentername() {
        HomePage.enterProductName("iphone"); // user inject the product name by using the HomePage class dot methods i.e static without creating an object
        HomePage.clickSearchIcon(); // perform click operation by using the HomePage class dot methods i.e static without creating an object
    }

    @Then("validate the title of searchresult page")
    public void validateresultPage() {
        Assert.assertEquals("Amazon.in : iphone", ResultPage.getResultPageTitle());  // assert for validation expected and actual result
        ResultPage.selectResult(3);  // by string concadianation user input index value and result choosen
    }

    @Given("user enter credi")
    public void userCredi() {
        HomePage.clickSignIn();
        SignInPage.enterMailId();
        SignInPage.clickContinue();
        SignInPage.enterPassword();
        SignInPage.clickSignin();
    }


    @Then("validate errormassage")
    public void valError() {
        SignInPage.getErrorMassage();
    }


}
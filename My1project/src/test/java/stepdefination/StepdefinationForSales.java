package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;
import reusable.ReadExcelData;

import java.io.IOException;

import static org.bouncycastle.cms.RecipientId.password;

public class StepdefinationForSales extends BaseCode {

//  public static WebDriver sd;// global declaration

//  @Given("navigate to webpage salesforce")
    public void url1() {
        sd = new ChromeDriver();
        sd.get("https://login.salesforce.com/?locale=in");
    }



    @And("click on login button")
    public void loginto() {

//        sd.findElement(By.xpath("//input[@name='Login']")).click();  // using the x-path locator
//        sd.findElement(By.cssSelector("input[class='button r4 wide primary']")).click(); // compund class using the css selector locator
//    sd.findElement(By.cssSelector(".button.r4.wide.primary")).click(); // css selector locator . reprasent class & compound class spaces removed by dots
//        sd.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();  // use compound class using xpath locator
      sd.findElement(By.xpath("//input[normalize-space(@class)='button r4 wide primary']")).click();  // x-path using the normalize-space for attribute value having spaces in text anywhere starting,mid,end
    }

    @Then("validate credentials of web page")
    public void validate() {
        String error = sd.findElement(By.xpath("//div[@id='error']")).getText();
        String ExpectedResult="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
//        System.out.println(error);   // print out statement in console for self verification
        Assert.assertEquals(ExpectedResult,error);  // in realtime we use assert only for check validation if it execute  test pass else fails the test
}

    @When("user enter username {string} and password {string}")
    public void userEnt(String username, String password) throws IOException {
//        sd.findElement(By.xpath("//input[@name='username']")).sendKeys("syedilyas");  // inject user name from the when statement of feature file
//        sd.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("ilyas12345"); // inject password from the when statement of feature file
//        sd.findElement(By.xpath("//input[@name='username']")).sendKeys(ReadExcelData.getExcelData("ilyas-sheet",0,2));  // inject username from the excel sheet by creating the reusable file i.e .xlsx

//        sd.findElement(By.cssSelector("input[id='username']")).sendKeys(ReadExcelData.getExcelData("ilyas-sheet",0,2));  // enter username using css selector finding element
        sd.findElement(By.cssSelector("#username")).sendKeys(ReadExcelData.getExcelData("ilyas-sheet",0,2)); // using css selector by # for id
        sd.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys(password);  // inject password from the excel sheet by creating the reusable file i.e .xlsx
    }




}
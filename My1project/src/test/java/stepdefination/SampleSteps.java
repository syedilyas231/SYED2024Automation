package stepdefination;

import io.cucumber.java.en.Given;
import pageobjects.HomePage1ByConstructorExample;

public class SampleSteps {
    HomePage1ByConstructorExample syed;
    public SampleSteps(){  // creating a constructor i.e same name of class
//   syed=new HomePage1ByConstructorExample();  // constructor-call by creating an object i.e homepage1 (hence its create inside the method it act like local variable
    }
    @Given("sample")
    public void m1() throws InterruptedException {
        syed=new HomePage1ByConstructorExample(); //  constructor-call by creating an object i.e homepage1 (hence its create inside the method it act like local variable
        syed.enterProductName("shoes").clickSearchIcon(); //clubbing all methods which is called "method chaining"
    }
}

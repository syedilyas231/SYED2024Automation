package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class HomePage1ByConstructorExample extends BaseCode {  // inject one class knowledge to another class by extends
    public HomePage1ByConstructorExample enterProductName(String productname){   // ctrate method by meaningful name & when ever the data inject from the user than paramaatrized the method i.e string-datatype
        sd.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);  // user inject the product name by sendkeys method
      return this;  // in order to achieve "method chaining"
    }
    public HomePage1ByConstructorExample clickSearchIcon(){   // creting method for clicksearchicon & static used for without creating an objet class
        sd.findElement(By.id("nav-search-submit-button")).click();
        return this;   // in order to achieve "method chaining"
    }


}

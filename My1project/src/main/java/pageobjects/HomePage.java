package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class HomePage extends BaseCode {  // inject one class knowledge to another class by extends
    public static void enterProductName(String productname){   // ctrate method by meaningful name & when ever the data inject from the user than paramaatrized the method i.e string-datatype
        sd.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);  // user inject the product name by sendkeys method
    }
    public static void clickSearchIcon(){   // creting method for clicksearchicon & static used for without creating an objet class
        sd.findElement(By.id("nav-search-submit-button")).click();
    }
    public static void  clickSignIn(){  // static for creating a method without creating an object
        WebElement ahmed= sd.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions syed=new Actions(sd);  // creating an object for actions class for mouse hover actions
        syed.clickAndHold(ahmed).build().perform(); // click and hold mehod to execute with build & perform methos
        sd.findElement(By.partialLinkText("sign ")).click();  // click on sign in link by using linktext or partialLinktext
    }
}

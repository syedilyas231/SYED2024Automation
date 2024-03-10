package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.time.Duration;
import java.util.Set;

import static reusable.BaseCode.sd;

public class AmazonCodeSteps extends BaseCode {
    @Given("select categery in homepage")
    public void selectcat() {
        WebElement selectnodeelement = sd.findElement(By.id("searchDropdownBox"));// creat webelement
        Select cat = new Select(selectnodeelement);// create an object for select class
//        cat.selectByIndex(3); // using by index
//        cat.selectByVisibleText("Baby"); // using by visibletext
        int dropdowncount = selectnodeelement.findElements(By.tagName("option")).size();//by size method count and store in data type int
        for (int i = 0; i < dropdowncount; i++) {
            String val = selectnodeelement.findElements(By.tagName("option")).get(i).getText();//extract text and store in string datatype
            System.out.println(val);// print statement
        }//

    }


    @Given("user navigate to baby wishlist page")
    public void usernavigatetobabywishlistpage() {
//        WebElement accountListElement = sd.findElement(By.id("nav-link-accountList"));
 WebElement accountListElement=sd.findElement(By.xpath("//a[@id='nav-link-accountList']"));//create webelement
        Actions act = new Actions(sd); // create an object for class actions
        act.clickAndHold(accountListElement).build().perform();   // run clickAndHold method using built and perform methods
//    sd.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        WebDriverWait explicitwait=new WebDriverWait(sd,Duration.ofSeconds(10));// // apply explicit wait to perticular line by "webdriverWait calss"
       explicitwait.pollingEvery(Duration.ofSeconds(2));  // pollingevery method check every 2 sec node is loaded or not if its loaded then it will break the waiting loop of 10 sec
       explicitwait.ignoring(NoSuchElementException.class);  // ignoring the exception if its not loaded in 2 sec the it will through an exception
        explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Baby Wishlist"))); // validation of the field loaded or not -->until metod--> expextedCondition class--> presenceOfElementLocated method
//        sd.findElement(By.linkText("Baby Wishlist")).click();// perform click operation
        sd.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));  // by using keys function in built in selenium we use keyboard actions & open in new window i.e window handlimg
        Set <String>  handlevalue=sd.getWindowHandles();  // get properties of all windows by method called getwindowsHandles paramaterised in set list
        for(String winProp:handlevalue){  // all windows i.e parent's & child's windows properties get to loop and initialise parent properties and in next loop get child window properties
            sd.switchTo().window(winProp);  //windows get winprop properties and switch to child window in next loop
//            System.out.println(sd.getTitle());  // print out the windows title
            if(sd.getTitle().contains("Baby Wishlist")){  // contains search for partial match method & execute the loop
                Assert.assertTrue(true);  // if assert condition is true pass the test
                break;  // it will terminate the loop (keeping the window in child window terminal) when ever u find any element it will search in child dom structure
            }
            sd.switchTo().defaultContent();  // defaultcontent always indicate the switching back to parent window
        }

    }

    @Given("user handle the drag and drop")
    public void dragm(){
        WebElement frameelement=sd.findElement(By.className("demo-frame"));//create webelement to iframe
        sd.switchTo().frame(frameelement); //  switch to parent html to child html
        WebElement drag=sd.findElement(By.xpath("//div[@id='draggable']"));// create webelement to drag node
        WebElement drop=sd.findElement(By.xpath("//div[@id='droppable']"));// create webelement to drop node
        Actions DaD=new Actions(sd); // create object for actions class
        DaD.dragAndDrop(drag,drop).build().perform();// run dragAndDrop metod using by built and perform methodds
        sd.switchTo().defaultContent();// switch to child html to parent html
    }



}
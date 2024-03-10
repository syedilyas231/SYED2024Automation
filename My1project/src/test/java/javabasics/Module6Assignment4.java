package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assignment4 {
    public static void main(String[] args) {
            /// module 6 assignment 4 //
//        Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        http://only-testing-blog.blogspot.com/2014/09/selectable.html
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
//        Step 3: Drag the slider up to 50% and drop the slider
     WebElement sd=driver.findElement(By.xpath("//div[normalize-space(@id)='slider']"));
     Actions syed=new Actions(driver);
     syed.dragAndDropBy(sd,50,0).build().perform();
//        Step 4: Close browser
             driver.close();

    }
}

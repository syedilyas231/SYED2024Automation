package javabasics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Module4Assignment2 {
    public static void main(String[] args) throws InterruptedException {
            /// module 4 assignment 2 //
//        1. Automate Oracle Registration Page in Chrome Browser
//        https://profile.oracle.com/myprofile/account/create-account.jspx

//        WebDriver driver=new ChromeDriver();
//        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");




//        2. Automate dropdowns part of Oracle Registration Page in Firefox Browser
//        https://profile.oracle.com/myprofile/account/create-account.jspx

        WebDriver driver=new FirefoxDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        Thread.sleep(3000);
      WebElement s2=driver.findElement(By.name("sView1:r1:0:country"));
       Select ilyas=new Select(s2);
       ilyas.selectByVisibleText("India");
        WebElement s1=driver.findElement(By.name("sView1:r1:0:state"));
       Select ahmed=new Select(s1);
       ahmed.selectByVisibleText("Telangana");
    }

}

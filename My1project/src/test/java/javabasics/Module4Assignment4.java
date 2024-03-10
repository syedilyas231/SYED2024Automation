package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Module4Assignment4 {
    public static void main(String[] args) {
           // module 4 assignment 4 //
//        1. Write a Test Script to get number of links available on Facebook Page
//        https://www.facebook.com/
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
       List<WebElement>  ilyas=new ArrayList<WebElement> (driver.findElements(By.tagName("a")));
        System.out.println(ilyas.size());


    }
}

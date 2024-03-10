package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assignment2 {
    public static void main(String[] args) {
            // module 6 Assignment 2 //
//        Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        Step 2: Open test URL:
//        http://only-testing-blog.blogspot.com/2014/09/selectable.html
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
//        Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
        WebElement s1=driver.findElement(By.xpath("//button[normalize-space(text())='Double-Click Me To See Alert']"));
        Actions act=new Actions(driver);
        act.doubleClick(s1).build().perform();
        String s=driver.switchTo().alert().getText();
        System.out.println(s);
        //        Step 4: Accept Alert
        driver.switchTo().alert().accept();
//        Step 5: Close browser
        driver.close();
    }
}

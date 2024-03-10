package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module5Assignment4 {
    public static void main(String[] args) throws InterruptedException {
          // module 5 assignment 4 //
//        Step 1: Launch Firefox browser
        WebDriver driver=new FirefoxDriver();
//        Step 2: Open test URLhttps://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
        driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
        Thread.sleep(3000);
//        Step 3: Click on click here to show confirm alert button
        driver.findElement(By.xpath("//button[normalize-space(text())='Click here to show confirm alert']")).click();

//        Step 4: Get the text displayed on alert into console
        String s2=driver.switchTo().alert().getText();
        System.out.println(s2);
        //Thread.sleep(3000);
//        Step 5: Accept the web alert to delete account
          driver.switchTo().alert().accept();
//        Step 6: Get the text displayed on alert into console
        String s11=driver.switchTo().alert().getText();
        System.out.println(s11);
        //Thread.sleep(3000);
//        Step 7: Accept the alert
            driver.switchTo().alert().accept();
           // Thread.sleep(3000);
//        Step 8: Close browse
           driver.close();
    }
}

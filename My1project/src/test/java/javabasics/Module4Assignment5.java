package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module4Assignment5 {
    public static void main(String[] args) throws InterruptedException {
    // module 4 assignment 5//
//        1. TC-1 launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        2. TC-2 go to Facebook Registration Page
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(3000);
//        3. TC-3 fill First Name Textbox with input
        driver.findElement(By.name("firstname")).sendKeys("syed");
        Thread.sleep(3000);
//        4. TC-4 clear the input from First Name Textbox
        driver.findElement(By.name("firstname")).clear();
//        5. TC-5 again fill the First Name Textbox with input
        driver.findElement(By.name("firstname")).sendKeys("ahmed");
        Thread.sleep(3000);
//        6. TC-6 Get the input from Textbox and display it in Console
        System.out.println(driver.findElement(By.name("firstname")).getText()); //driver.findElement(By.name("firstname")).getText()
        Thread.sleep(3000);
//        7. TC-6 Close browse
         driver.close();




    }
}

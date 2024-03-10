package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Modue5Assignment5 {
    public static void main(String[] args) throws InterruptedException {
            /// module 5 Assignment 5 //
//        Step 1: Launch Firefox browser
        WebDriver driver=new FirefoxDriver();
//        Step 2: Open test URL :
//        https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chrome
//        browser
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//        Step 3: Switch into Frame
        driver.switchTo().frame(0);
//        Step 4: Click on Try it Button
        driver.findElement(By.xpath("//button[normalize-space(text())='Try it']")).click();
//        Step 5: Send the text into Alert
        driver.switchTo().alert().sendKeys("syedilyasahmed");
//        Step 6: Accept the Web Alert
        driver.switchTo().alert().accept();
//        Step 7: Get the text displayed on page into Console
        WebElement s12=driver.findElement(By.id("demo"));
        System.out.println(s12.getText());
        Thread.sleep(3000);
//        Step 8: Close browser
        driver.close();
    }
}

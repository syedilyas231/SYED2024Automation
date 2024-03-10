package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assignment3 {
    public static void main(String[] args) {
            // module 6 assignment 3//
//        Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        Step 2: Open test URL:
//        http://only-testing-blog.blogspot.com/2014/09/selectable.html
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
//        Step 3: Right click on Double-Click Me to See Alert Button
        WebElement s1=driver.findElement(By.xpath("//button[normalize-space(text())='Double-Click Me To See Alert']"));
        Actions act=new Actions(driver);
        act.contextClick(s1).build().perform();
//        Step 4: Close browser
        driver.close();

    }
}

package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module7Assignment1 {
    public static void main(String[] args) {
//        Step 1: Launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        Step 2: Open test URL: https://smallpdf.com/word-to-pdf
        driver.get("https://smallpdf.com/word-to-pdf");
//        Step 3: Click on Choose File Button
        driver.findElement(By.xpath("//span[normalize-space(text())='Choose Files']")).click();
//        WebElement s1=driver.findElement(By.xpath("//span[normalize-space(text())='Choose Files']"));
//        Actions role=new Actions(driver);
//        role.clickAndHold(s1).build().perform();
//        Step 4: Automate Window Alert by uploading file

//        Step 5: Close browser
    }
}

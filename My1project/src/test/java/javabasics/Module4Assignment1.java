package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class Module4Assignment1 {
    public static <select> void main(String[] args) throws InterruptedException {
        // module 4 assignment 1//

//    1. Automate Facebook Registration Page using Direct Locator's in Chrome
//   Browser https://www.facebook.com/

//        WebDriver sdf = new ChromeDriver();
//        sdf.get("https://www.facebook.com");
//        sdf.findElement(By.partialLinkText("Create new")).click();
//        Thread.sleep(2000);
//        sdf.findElement(By.name("firstname")).sendKeys("syed");
//        sdf.findElement(By.name("lastname")).sendKeys("ahmed");
//        sdf.findElement(By.name("reg_email__")).sendKeys("8686868686");
//        sdf.findElement(By.name("reg_passwd__")).sendKeys("asffhhhhhg");
//        WebElement s1 = sdf.findElement(By.name("birthday_day"));
//        Select day = new Select(s1);
//        day.selectByValue("22");
//        WebElement s2 = sdf.findElement(By.name("birthday_month"));
//        Select month = new Select(s2);
//        month.selectByValue("12");
//        WebElement s3 = sdf.findElement(By.name("birthday_year"));
//        Select year = new Select(s3);
//        year.selectByValue("2008");
//        sdf.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
//        Thread.sleep(3000);
//        sdf.findElement(By.name("websubmit")).click();
//

//            2. Automate dropdowns part of Facebook Registration Page using Direct
//    Locator's in Firefox Browser- https://www.facebook.com/

   WebDriver sdf=new FirefoxDriver();
   sdf.get("https://www.facebook.com");
   sdf.findElement(By.partialLinkText("Create new")).click();
   Thread.sleep(3000);
        WebElement s1 = sdf.findElement(By.name("birthday_day"));
        Select day = new Select(s1);
        day.selectByValue("20");
        WebElement s2 = sdf.findElement(By.name("birthday_month"));
        Select month = new Select(s2);
        month.selectByValue("11");
        WebElement s3 = sdf.findElement(By.name("birthday_year"));
        Select year = new Select(s3);
        year.selectByValue("2008");
    }
}

package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Module3Assignment1 {
    public static void main(String[] args) {

         // module 3 assignment 1 answers //
//        1. TC-1 launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
//        3. TC-3 maximize the browser window
        driver.manage().window().maximize();
//        4. TC-4 get the title of page
        System.out.println(driver.getTitle());
//        5. TC-5 click on know more link text
        driver.switchTo().frame("login_page");
        driver.findElement(By.partialLinkText("Know M")).click();
//        6. TC-6 switch from 0th window to 1st window
        List<String> sd=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(sd.get(1));
//       7. TC-7 after switching get  title of page
        System.out.println(driver.getTitle());
//        8. TC-8 switch from 1st window to 0th window
        driver.switchTo().window(sd.get(0));
//        9. TC-9 after switching, get the title of page
        System.out.println(driver.getTitle());
//        10. TC-10 close all windows of the browser
        driver.quit();

    }
}

package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        // module 2 assignment 3 answers//
//        1. TC-1 launch firefox browser
        WebDriver driver=new FirefoxDriver();
//        2. TC-2 go to test URL https://www.google.com
        driver.get("https://www.google.com");
//        3. TC-3 specify wait time for 5 sec
        Thread.sleep(5000);
//        4. TC-4 get the title of page into console
        System.out.println( driver.getTitle());
//        5. TC-5 close the browser
        driver.close();
    }
}

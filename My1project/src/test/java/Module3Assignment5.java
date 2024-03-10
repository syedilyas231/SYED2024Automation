import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Module3Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        // module 3 assignment 5 answers //
//        1. TC-1 launch Chrome browser
        WebDriver driver=new ChromeDriver();
//        2. TC-2 go to test URL - https://www.google.com
        driver.get("https://www.google.com");
//        3. TC-3 maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(5000);
//        4. TC-4 get the URL of page
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
//        5. TC-5 navigate to test URL - https://www.selenium.dev/
        driver.navigate().to("https://www.selenium.dev");
        Thread.sleep(5000);
//        6. TC-6 get the URL of page
        System.out.println(driver.getCurrentUrl());
//        7. TC-7 navigate back to test URL - https://www.google.com
        driver.navigate().back();
        Thread.sleep(5000);
//        8. TC-8 get the URL of page
        System.out.println(driver.getCurrentUrl());
//        9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
        driver.navigate().forward();
        Thread.sleep(5000);
//        10. TC-9 get the URL of page
        System.out.println(driver.getCurrentUrl());
//        11.TC-10 refresh the current page
        driver.navigate().refresh();
        Thread.sleep(5000);
//        12. TC-11 get the URL of page
        System.out.println(driver.getCurrentUrl());
//        13. TC-12 close the browser
        driver.close();


    }
}

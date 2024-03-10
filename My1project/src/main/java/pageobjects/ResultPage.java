package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class ResultPage extends BaseCode {   // inject of one class knowledge to other class by extends inheritence
    public  static String getResultPageTitle() {  //creating method with appropiate meaningfull name
        return sd.getTitle();  // get title method to get title name which is in-built method & we may use gettitle for validation
        // when ever we may going to validate  something we needs to "written from the respective method"
    }
    public static void selectResult( int Index){
        sd.findElement(By.xpath("//div[@data-cel-widget='search_result_"+Index+"']//a")).click();
    }
}
package stepdefination;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static reusable.BaseCode.sd;

public class TablehandlingSteps {
    String colcount1value;
    @Given("user extract the coloum 1 value")
    public void m122() {
        WebElement infosystab = sd.findElement(By.xpath("//table[@class='infobox vcard']"));
        int colcount = infosystab.findElements(By.tagName("th")).size(); // size method store the size & its an int type datatype
        List<String> colvalue = new ArrayList<String>(); //creating an object-- colvalue is empty list

        for (int n = 2; n < colcount; n++) {  // for loop-- coloum 1 value itirate from infosys wiki webpage table
            String col1 = infosystab.findElements(By.tagName("th")).get(n).getText();// get method will get change index & gettext method will extract text and store in String datatype
            colvalue.add(col1);  // add method added the gettext i.e string data type
//          System.out.println(col1);   // print stmnt for user reference only but not store the values

        }
        System.out.println(colvalue);   // print stmnt of list
                  // using for loop
       int colcount1 = infosystab.findElements(By.tagName("td")).size();
        List<String> colcount1value = new ArrayList<String>(); // empty list
        for (int h = 2; h < colcount1; h++) {  // for loop -- coloum 2 values itirate from infosys wiki webpage table
            String col11 = infosystab.findElements(By.tagName("td")).get(h).getText();
            colcount1value.add(col11); // list  add by string datatype i.e gettext
//           System.out.println(col11);

        }
      System.out.println(colcount1value);  // print stmnt of list



//                 // using the forHash loop concept intead of tradiitional for loop
//        List<WebElement> input = infosystab.findElements(By.tagName("td")); // input from webpage stores in webelement variable name input
//        List <String>  nl =new ArrayList<String>(); //  empty list
//        for ( WebElement output:input ){  // output-type is webelement stores in variable name output & input is from input list
//           nl.add(output.getText());  // by add method add gettext to list
//
//
//        }
//        System.out.println(colcount1value);
//        for (String dropvalue:nl){
//            for(equalsIgnoreCase("books"))
//            {
//                Assert.assertTrue(true);  // asserttrue always check condition true if condition true test wil pass
//                break;  // it will terminate block once the result find i.e books after no needs execute loop
//
//            }
//        }
    }



}
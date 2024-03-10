package pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import reusable.BaseCode;

public class SignInPage extends BaseCode {

public static void enterMailId(){
    sd.findElement(By.id("ap_email")).sendKeys(props.getProperty("email"));
}
  public static void clickContinue(){
    sd.findElement(By.xpath("//input[@class='a-button-input']")).click();
  }
  public static void enterPassword(){
    sd.findElement(By.id("ap_password")).sendKeys(props.getProperty("password"));

  }
  public static void clickSignin(){
      sd.findElement(By.id("signInSubmit")).click();
  }
  public static String getErrorMassage(){
   String error= sd.findElement(By.xpath("//span[normalize-space(text())='Your password is incorrect']")).getText();
    return error;


}


}


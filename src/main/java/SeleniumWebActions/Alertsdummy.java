package SeleniumWebActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class Alertsdummy {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/alerts");
     
//      2. Locate the elements
      WebElement infoAlert = driver.findElement(By.id("alertButton"));
      WebElement confirmationAlert = driver.findElement(By.id("confirmButton"));
      WebElement promptAlert = driver.findElement(By.id("promtButton"));
         
//      3. Get the text message from information alert and click on 'OK' button    
      infoAlert.click();
      Alert alert = driver.switchTo().alert();  // switch from main window to alert
      String alertText = alert.getText(); //get alert text
      System.out.println(alertText);
      alert.accept();  // to click on ok button
     

//      4. Get the text message from confirmation alert and click on 'CANCEL' button
      confirmationAlert.click();
      JavascriptExecutor js2 = (JavascriptExecutor)driver;
      js2.executeScript("arguments[0].scrollIntoView",confirmationAlert);
      String confirmationAlertText = alert.getText(); //get alert text
      System.out.println(confirmationAlertText);
      alert.dismiss();  // to click on cancel button    
     
      
      JavascriptExecutor js21 = (JavascriptExecutor)driver;
      js21.executeScript("arguments[0].scrollIntoView",promptAlert);
//      5. Get the text message from promt alert and click on 'OK' button    
      promptAlert.click();
      String promptAlertText = alert.getText(); //get alert text
      System.out.println(promptAlertText);
      alert.sendKeys("Selenium"); //Enter text in alert text box
      alert.accept();  // to click on ok button        
     
//      6. Close the Browser windows
      //driver.quit();

	}

}

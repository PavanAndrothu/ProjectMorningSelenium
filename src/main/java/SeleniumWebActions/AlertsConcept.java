package SeleniumWebActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class AlertsConcept {

	
    /*
     * Alert alert = driver.switchTo().alert(); // switch from main window to alert
     * alert.getText(); //get alert text
     * alert.accept(); // to click on ok button
     * alert.dismiss(); // to click on cancel button
     * alert.sendKeys("Selenium");//Enter text in alert text box
     *
     */
	
	public static void main(String[] args) throws InterruptedException {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/alerts");

     
//      2. Locate the elements
      WebElement infoalert = driver.findElement(By.id("alertButton"));
      WebElement confirmationalert = driver.findElement(By.id("confirmButton"));
      WebElement promptalert = driver.findElement(By.id("promtButton"));
      
      
      
      
//      
//      JavascriptExecutor js = (JavascriptExecutor)driver;
//      js.executeScript("arguments[0].scrollIntoView()",infoalert); 

      
//      3. Infoalert
      infoalert.click();
      Alert alert = driver.switchTo().alert();
      String alerttext = alert.getText();
      System.out.println(alerttext);
      Thread.sleep(5000);
      alert.accept(); // click on OK
      

      JavascriptExecutor js1 = (JavascriptExecutor)driver;
      js1.executeScript("arguments[0].scrollIntoView()",confirmationalert); 
      Thread.sleep(5000);
//      4. confoalert
      confirmationalert.click();


      String confirmationalerttext = alert.getText();
      System.out.println(confirmationalerttext);
      Thread.sleep(5000);
      alert.dismiss(); // click on dismiss
      
      
      JavascriptExecutor js2 = (JavascriptExecutor)driver;
      js2.executeScript("arguments[0].scrollIntoView()",promptalert);
      Thread.sleep(5000);
      
//    4. promtalert
    promptalert.click();

    String promptalerttext = alert.getText();
    System.out.println(promptalerttext);
    alert.sendKeys("Selenium"); //Enter text in alert text box
    Thread.sleep(5000);
    alert.accept(); // click on dismiss
    
    
    System.out.println("done");
    
   driver.quit();
    
      

	}

}

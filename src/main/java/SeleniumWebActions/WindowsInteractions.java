package SeleniumWebActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class WindowsInteractions {

	public static void main(String[] args) throws InterruptedException, IOException {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/upload-download");


//      2. Locate the element to upload button label
      WebElement upload = driver.findElement(By.xpath("//label[@for='uploadFile']"));
      
 
//		3. Launch upload window
      upload.click();
      Thread.sleep(5000);
      
//      4. select the file and upload
      Runtime.getRuntime().exec("C:\\Autoit\\upload.exe");

      // wait till file upload
      Thread.sleep(5000);
      
      
      //5. close the browser
      driver.quit();
      
      
	}

}

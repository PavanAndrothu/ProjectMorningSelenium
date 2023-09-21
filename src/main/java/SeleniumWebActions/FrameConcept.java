package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class FrameConcept {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/frames");

     
//      2. Locate the elements
      WebElement mainwindowelement = driver.findElement(By.xpath("//div[text()='Elements']"));
      
      
      //Switch to frame  from main window
//    driver.switchTo().frame(0);
    driver.switchTo().frame("frame1");
//    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
   
      WebElement frameelement = driver.findElement(By.id("sampleHeading"));

      
//    3. Get the frame element text
    System.out.println(frameelement.getText());
   
    //Switch back to default main window
    driver.switchTo().defaultContent();
   
//    4. Click on main window element
    mainwindowelement.click();
   
//    5. Close browser
    driver.quit();

	}

}

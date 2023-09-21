 package SeleniumWebActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class multiplebrowsertabs {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
      WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/browser-windows");
      String mainWindow = driver.getWindowHandle();

//      2. Launch new window
      WebElement newTabButton = driver.findElement(By.id("tabButton"));
      newTabButton.click();

//      2. Locate the elements
      WebElement mainWindowElement = driver.findElement(By.xpath("//div[text()='Elements']"));

      // switch to new window
      Set<String> windowIds = driver.getWindowHandles();
      List<String> windows = new ArrayList<String>(windowIds);
     
     
      for (int i = 0; i < windows.size(); i++) {
          if (!windows.get(i).equals(mainWindow)) {
//              break;
//              driver.close();
          }
      }
     
      WebElement newTabElement = driver.findElement(By.id("sampleHeading"));

//      3. Get the new window element text
      System.out.println(newTabElement.getText());
     
      //Switch to main window
      driver.switchTo().window(mainWindow);

//      4. Click on main window element
      mainWindowElement.click();

//      5. Close browser
      driver.quit();

	}

}

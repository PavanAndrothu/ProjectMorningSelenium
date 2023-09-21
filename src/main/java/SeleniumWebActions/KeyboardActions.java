package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumframework.WebDriverClass;

public class KeyboardActions {

	public static void main(String[] args) {
//      1. Launch the Application and get driver
        WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome", "https://demoqa.com/buttons");
	        
		 
//       2. Locate the interaction menu element
         WebElement element = driver.findElement(By.xpath("//div[@class='main-header']"));
         element.click();
        
         for (int i=0; i<10;i++) {
             new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
         }
//	        // find google search element
//	        WebElement googlesearch = driver.findElement(By.xpath("//input[@title='Search']"));
//	        
//	        // search with word selenium and click on enter button
//	        Actions action = new Actions(driver);
//	        action.sendKeys(googlesearch,"selenium").keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
//	        
//	        
//	        action.keyDown(Keys.ALT).keyDown(Keys.F4).keyUp(Keys.ALT).keyUp(Keys.F4).perform();
//	        
//	        
       System.out.println("done");

	}

}

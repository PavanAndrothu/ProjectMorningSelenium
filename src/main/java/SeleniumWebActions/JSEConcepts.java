package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class JSEConcepts {

	public static void main(String[] args) {
		 WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/buttons");
	        
	        
	        WebElement interactionMenu = driver.findElement(By.xpath("//div[text() ='Interactions']"));
	        
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", interactionMenu);
	        
	        

	        
	        
//	        5. Click directly using JSE Click
//	        JavascriptExecutor jse = (JavascriptExecutor)driver;
//	        jse.executeScript("arguments[0].click();", interactionMenu);
	           
//	        JavascriptExecutor jse = (JavascriptExecutor)driver;
//	        jse.executeScript("arguments[0].value='textToEnter';", interactionMenu);
			
	        interactionMenu.click();
	        
	        System.out.println("done");

	}

}

package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumframework.WebDriverClass;

public class ImageElements {

	public static void main(String[] args) {
	
//		1.Launch the Application
		WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Edge", "https://demoqa.com/");
		
		
	//	2.locate hyperlink
		WebElement logoImage = driver.findElement(By.xpath("//img[contains(@src,'Toolsqa')]"));
		
	// 3. Verify image in the web application
		if(logoImage.isDisplayed())
			System.out.println("Image is available");
		else
			System.out.println("Image is not available");
// 4.Close the browser
		driver.close();
		

	}

}

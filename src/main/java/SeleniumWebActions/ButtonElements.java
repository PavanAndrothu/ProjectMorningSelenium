package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonElements {

	
    /*
     * element.isDisplayed(); //is element displayed ?
     * element.isEnabled(); // is element enabled ?
     * element.getText(); // get text value from element
     * element.getAttribute("AttributeName"); //get attribute value from element
     * element.click(); // click on the element
     *
     */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/buttons");
		
//		locate the "click me" button
		
		WebElement ClickmeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		
//verify button is displayed
		if(ClickmeButton.isDisplayed())
			System.out.println("Button is Available");
		else
			System.out.println("Button is not Available");
		
		//verify button is enabled
		if(ClickmeButton.isEnabled())
			System.out.println("Button is available");
		else
			System.out.println("Button is not available");
		
		//veify button is label
		String buttonLabel = ClickmeButton.getText();
		
		if(buttonLabel.equals("Click Me"))
			System.out.println("Label is Matching");
		else
			System.out.println("Label is Not Matching");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ClickmeButton);
		
		
		//click on the button 
		ClickmeButton.click();
		//Close the browser window
		driver.close(); 
		
		System.out.println("completed");
		
	}

}

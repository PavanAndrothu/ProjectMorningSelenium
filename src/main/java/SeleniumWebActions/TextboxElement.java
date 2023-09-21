package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextboxElement {

    /*
     * element.getAttribute("placeholder"); //to get placeholder value
     * element.clear(); //to clear previous values
     * element.sendKeys("value"); //to update the text
     */
	
	
	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/text-box");
		
		
		WebElement Textbox = driver.findElement(By.xpath("//input[@id='userName']"));
		
		//verify Textbox is displayed
				if(Textbox.isDisplayed())
					System.out.println("Textbox is Available");
				else
					System.out.println("Textbox is not Available");
				
				//verify Textbox is enabled
				if(Textbox.isEnabled())
					System.out.println("Textbox is available");
				else
					System.out.println("Textbox is not available");
				
//		        8. Verify textbox placeholder value
				String placeholder = Textbox.getAttribute("placeholder");
				if(placeholder.equals("Full Name"))
					System.out.println("placeholder is matching");
				else
					System.out.println("placeholder is not matching");
				//9. clear textbox
				
				Textbox.clear();
				
				//10. enter the text
				 Textbox.sendKeys("Pavan Androthu");
				 
				
				 
				 driver.close();
				

	}

}

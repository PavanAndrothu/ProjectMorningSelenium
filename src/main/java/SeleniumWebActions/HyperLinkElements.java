package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumframework.WebDriverClass;

public class HyperLinkElements {

	public static void main(String[] args) throws InterruptedException {
//		1.Launch the Application
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver(Options); 
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		//3.Navigate to “http://qatechhub.com”.
		driver.navigate().to("https://demoqa.com/broken");
		Thread.sleep(5000);

		//WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome", "https://demoqa.com/broken");
		
		
	//	2.locate hyperlink
		WebElement Hyperlink = driver.findElement(By.xpath("//a[contains(text(),'Valid Link')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", Hyperlink);
		Hyperlink.click();
		
//      3. Validate hyperlink
        
        //option 1 (get  href attribute value of link element and compare)
        if(Hyperlink.getAttribute("href").equals("http://demoqa.com/"))
            System.out.println("Link is valid");
        else
            System.out.println("Link is not valid");
       
        //option 2 (click on hyperlink and get the updated browser url)
        Hyperlink.click();
        if(driver.getCurrentUrl().equals("https://demoqa.com/"))
            System.out.println("Link is valid");
        else
            System.out.println("Link is not valid");
       
        //option 3 (click on hyperlink and verify whether new page element is displayed)
        WebElement newPageElement = driver.findElement(By.xpath("//h5[text()='Elements']"));
        if(newPageElement.isDisplayed())
            System.out.println("Link is valid");
        else
            System.out.println("Link is not valid");
        
        
        System.out.println("completed");


	}

}

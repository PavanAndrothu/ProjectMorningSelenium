package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverClass {

	WebDriver driver;
	
	public WebDriver launchApplicationAndGetDriver(String browser, String URL) {
//      1. Launch the Browser
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
        	driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
		    WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}   
               
//    2. Maximize the browser window
        driver.manage().window().maximize();
       
//    3. Delete all cookies from the browser window
        driver.manage().deleteAllCookies();
       
//    4. Enter URL and Launch the Application (https://demoqa.com/buttons)
        driver.get(URL);
        
		return driver;

	}

}

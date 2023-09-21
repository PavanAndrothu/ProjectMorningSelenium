package Selenium.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyfirstAutomationProject {

	public static void main(String[] args) {
//      1. Launch browser (browser = chrome)
		System.setProperty("webdriver.chrome.driver", "G:\\SQL\\chrome\\chromedriver\\chromedriver.exe");// which browser and where is your browser driver ?
		WebDriver driver = new ChromeDriver();  //launch browser window
		
//      2. Maximize the browser window
		driver.manage().window().maximize();
		
//		 3. Enter URL and Launch the Application
		driver.get("https://www.facebook.com/");
		
		
//	        4. Verify the application title
		System.out.println(driver.getTitle());
		
//	        5. Close the browser window
		driver.close();

	}

}

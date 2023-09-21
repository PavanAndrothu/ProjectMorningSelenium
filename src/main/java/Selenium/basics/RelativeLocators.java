package Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	//Syntax : RelativeLocator.with(LocatorOfTargetElement).direction(LocatorOfReferenceElement);

	//above
	//below
	//toLeftOf
	//toRightOf
	//near
	
	public static void main(String[] args) {
//      1. Launch the Browser (browser = chrome)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
               
//    2. Maximize the browser window
        driver.manage().window().maximize();
       
//    3. Delete all cookies from the browser window
        driver.manage().deleteAllCookies();
       
//    4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)
        driver.get("https://parabank.parasoft.com/parabank/index.htm&quot"); //wait until each element loads in the page
   
//    5. Locate 'about us' element using relative locators
        WebElement aboutUsLink = driver.findElement(RelativeLocator.with(By.xpath("a[text()='About Us']")).below(By.cssSelector("li[class='Solutions']")));
       
        WebElement aboutUsLink2 = driver.findElement(RelativeLocator.with(By.xpath("a[text()='About Us']")).above(By.xpath("//a[text()='Services']")));
       
   

	}

}

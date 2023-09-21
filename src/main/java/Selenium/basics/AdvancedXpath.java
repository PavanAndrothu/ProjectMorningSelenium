package Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedXpath {

	public static void main(String[] args) {
//      1. Launch the Browser (browser = chrome)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
               
//    2. Maximize the browser window
        driver.manage().window().maximize();
       
//    3. Delete all cookies from the browser window
        driver.manage().deleteAllCookies();
       
//    4. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.co.in/"); //wait until each element loads in the page
        
//      5. Locate 'about us' element
        WebElement aboutUsLink = driver.findElement(By.xpath("//li[@class='Solutions']/following-sibling::li/child::a[text()='About Us']"));
       

	}

}

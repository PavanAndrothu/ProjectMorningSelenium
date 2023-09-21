package Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//cssSelector syntax:

//Syntax 1:  tagName#id

//Syntax 2:  tagName.className

//Syntax 3:  tagName[attribute='attributeValue']


public class CSSLocators {

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
   
//    5. Locate google search text box using different locators
       
    //locate using syntax 1
    WebElement    googleSearchTextBox_id = driver.findElement(By.cssSelector("input#search"));
   
    //locate using syntax 2
    WebElement    IndiaLink = driver.findElement(By.cssSelector("div.uU7dJB"));    
   
    //locate using syntax 3
    WebElement    googleSearchTextBox_tagName = driver.findElement(By.cssSelector("input[title='Search']"));   

	}

}

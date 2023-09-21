package Selenium.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLocators {

    public static void main(String[] args) {
       
//        1. Launch the Browser (browser = chrome)
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
                   
//        2. Maximize the browser window
            driver.manage().window().maximize();
           
//        3. Delete all cookies from the browser window
            driver.manage().deleteAllCookies();
           
//        4. Enter URL and Launch the Application (https://www.google.co.in/)
            driver.get("https://www.google.co.in/"); //wait until each element loads in the page
       
//        5. Locate google search text box using different locators
           
        //locate using 'id' locator
        WebElement    googleSearchTextBox_id = driver.findElement(By.id("search"));
       
        //locate using 'name' locator
        WebElement    googleSearchTextBox_name = driver.findElement(By.name("q"));        
       
        //locate using 'className' locator
        WebElement    googleSearchTextBox_className = driver.findElement(By.className("gLFyf gsfi"));    
       
        //locate using 'tagName' locator
        WebElement    googleSearchTextBox_tagName = driver.findElement(By.tagName("input"));    
       
//        6. Locate 'how search works' link using linkText and Partial Link Text locators
       
        //link text locator
        WebElement    howSearchWorksLink_linkText = driver.findElement(By.linkText(" How Search works ")); //complete text value of hyperlink
       
        //partialLinkText Locator
        WebElement    howSearchWorksLink_partialLinkText = driver.findElement(By.partialLinkText("Search works")); //partial text value of hyperlink
           

    }

}
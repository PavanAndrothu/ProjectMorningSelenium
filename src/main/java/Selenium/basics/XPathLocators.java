package Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathLocators {
    //Xpath (XML Path)
	   
    //Absolute X-path (Full X-path) ==> starts with /  ==> it contains all html tags from beginning of html page till target element
   
    //Relative X-path ==> starts with //   ==> will consider target element only
	
    /****************Level 1************************/
	   
    //Syntax 1 : //tagName[@Attribute='attributeValue']
    //Syntax 2 : //tagName[text()='textValue']
	
    /****************Level 2************************/ // (contains -can have partial value any where )
	   
    //Syntax 3 : //tagName[contains(@Attribute,'partialAttributeValue')]
    //Syntax 4 : //tagName[contains(text(),'partialTextValue')]
   
    /****************Level 3************************/  // (starts-with -should not delete beginning value )
   
    //Syntax 5 : //tagName[starts-with(@Attribute,'partialAttributeValue')]
    //Syntax 6 : //tagName[starts-with(text(),'partialTextValue')]
   
    /****************Level 4************************/
   
    //Syntax 7 : //tagName[@Attribute1='attributeValue2' and contains(@Attribute,'partialAttributeValue') and starts-with(@Attribute,'partialAttributeValue')]
    //Syntax 8 : //tagName[text()='textValue' and @Attribute='attributeValue']
   
    /****************Level 5************************/
   
    //Syntax 9 : UniqueReferenceElementXpath/Relationship::TargetElementXpath
   
    //parent
    //child
    //following-sibling
    //preceding-sibling
    //ancestor
    //following
    //preceding    

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in/");
		
	   //   5. Locate 'Gmail' Element using Absolute Xpath
		WebElement gmail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
		
		
//      6. Locate 'Gmail' Element using Relative Xpath
		 //Syntax 1
		WebElement gmail_1 = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?authuser=0&amp;ogbl']"));
		
		//Syntax 2
		WebElement gmail_2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//Syntax 3
		WebElement gmail_3 = driver.findElement(By.xpath("//a[contains(@href,'mail/&')]"));
		
		//Syntax 4
		WebElement gmail_4 = driver.findElement(By.xpath("//a[contains(text(),'mail')]"));
		
		//Syntax 5
		WebElement gmail_5 = driver.findElement(By.xpath("//a[starts-with(@href, 'https://mail.google.com/mail/?')]"));
		
		//Syntax 6
		WebElement gmail_6 = driver.findElement(By.xpath("//a[starts-with(text(), 'Gma')]"));
		
        //Syntax 7
        WebElement gmail_7 = driver.findElement(By.xpath("//a[contains(@href,'mail/&') and @class='gb_d']"));
       
        //Syntax 8
        WebElement gmail_8 = driver.findElement(By.xpath("//a[text()='Gmail' and @class='gb_d']"));
		
		
		
		
	}

}

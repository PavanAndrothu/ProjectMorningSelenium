package Selenium.basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
		
		
//	    1. Launch the Browser (browser = chrome)
      //  System.setProperty("webdriver.chrome.driver", "G:\\\\SQL\\\\chrome\\\\chromedriver\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
               
//    2. Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(4000);
       
       
//    3. Delete all cookies from the browser window
        driver.manage().deleteAllCookies();
        Thread.sleep(4000);

       
//    4. Enter URL and Launch the Application (https://www.google.co.in/)
        driver.get("https://www.google.co.in/");
        Thread.sleep(4000);
        
       
//    5. Verify the Application Title
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        
       
//    6. Navigate to different web site (https://in.search.yahoo.com/?fr2=inr)
        driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
        Thread.sleep(4000);
    
       
//    7. Navigate back to previous site
        driver.navigate().back();
        Thread.sleep(4000);
       
//    8. Move forward to next site
        driver.navigate().forward();
        Thread.sleep(4000);
       
//    9. Reload the site
        driver.navigate().refresh();
        Thread.sleep(4000);
       
//    10. Get the current window URL
        System.out.println("Current URL is :"+ driver.getCurrentUrl());
        Thread.sleep(4000);
       
       
//    11. Get the window handle Id (Unique id created by selenium)
        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);
        Thread.sleep(4000);
    
       
//    12. Launch new window and Get the Application(https://www.selenium.dev/)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.selenium.dev/");
        Thread.sleep(4000);
        
//      13. Goback to original window
        
        driver.switchTo().window(originalWindow);
        Thread.sleep(4000);
       
        
        
//    13. Launch new tab and get another application(https://demoqa.com/)
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/");
        Thread.sleep(4000);
        
//    14. Get the window Size
       Dimension size = driver.manage().window().getSize();
       System.out.println("Height is : "+size.getHeight());
       System.out.println("Width is : "+size.getWidth());
       Thread.sleep(4000);
       
//    15. Minimize the browser window
       driver.manage().window().minimize();
       Thread.sleep(4000);
       
//    16. Close all browser windows
         //close all windows launched by selenium
       driver.quit();
        //driver.close(); //close current browser window
       
	}

}

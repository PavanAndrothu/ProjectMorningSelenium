package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxElement {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
       // https://ironspider.ca/forms/checkradio.htm
                
//    5. Locate the 'Click Me' Button
        WebElement checkboxElement1 = driver.findElement(By.xpath("//input[@value='red']"));
        WebElement checkboxElement2 = driver.findElement(By.xpath("//input[@value='yellow']"));
       
//    6. Select the checkbox
        if(!checkboxElement1.isSelected())
            checkboxElement1.click();
       
        if(!checkboxElement2.isSelected())
            checkboxElement2.click();

//    7. Close the browser window
         driver.close();
        System.out.println("completed");

	}

}

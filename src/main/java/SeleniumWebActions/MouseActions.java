package SeleniumWebActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumframework.WebDriverClass;

public class MouseActions {

	public static void main(String[] args) {
		 WebDriver driver = new WebDriverClass().launchApplicationAndGetDriver("Chrome","https://demoqa.com/buttons");
	        
        
        WebElement button1 = driver.findElement(By.xpath("//button[@id = 'doubleClickBtn']"));
        WebElement button2 = driver.findElement(By.xpath("//button[@id = 'rightClickBtn']"));
        
        
        
        Actions action = new Actions(driver);
        
        action.doubleClick(button1).perform();
	        
        action.contextClick(button2).perform();
        
        driver.navigate().to("https://demoqa.com/droppable");
        
//      6. Locate drag and drop elements
        WebElement sourceElement1 = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetElement2 = driver.findElement(By.xpath("//div[@id='draggable']/following-sibling::div[@id='droppable']"));
        
        action.dragAndDrop(sourceElement1, targetElement2).perform();
        
//      8. Locate accept link element and mouse hover on the element
        WebElement acceptLink = driver.findElement(By.xpath("//a[text()='Accept']"));
        action.moveToElement(acceptLink).perform();
       
//    9. close browser window
        //driver.quit();
   System.out.println("completed");
        
        

	}

}

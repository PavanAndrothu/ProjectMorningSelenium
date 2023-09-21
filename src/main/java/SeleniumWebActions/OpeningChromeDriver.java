package SeleniumWebActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeningChromeDriver {

	public static void main(String[] args) {
		WebDriver driver;
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
		driver.manage().window().maximize();

	}

}

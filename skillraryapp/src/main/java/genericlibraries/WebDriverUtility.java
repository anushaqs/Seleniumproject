package genericlibraries;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility {
	private WebDriver driver;
	public WebDriver openApplication(String browser, String url, long time) {
		switch (browser) {
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		case "edge" EdgeDriver driver = new EdgeDriver();break;
		default: System.out.println("Invalid browser data");
		{
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			
			return driver;
		}
		public WebElement explicitWait(WebElement element, long time) {
			
			webDriverWait wait= new webDriver
		}
		
		}
	}

}

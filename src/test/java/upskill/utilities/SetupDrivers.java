package upskill.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	// A. Declare WebDriver instance for browser interaction
	public static WebDriver driver;							//initializing driver
	
	// B. Set up ChromeDriver with custom options and navigate to eBay
	public static void setupDriver(){						// set-up the driver first
		
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromeDriver\\chromedriver.exe"); // We do not do it anymore
		
		// 1. Set up the ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();		//set the Chrome driver from cloud and BoniGarcia Plugin
		
		// 2. Create an instance of ChromeOptions to customize browser settings
		ChromeOptions options = new ChromeOptions();		//initializing chrome options
		
		// 3. Add arguments to ChromeOptions to configure the browser behavior
		options.addArguments("--start-maximized");			//add argument to maximize browser
		options.addArguments("--disable-notifications");	//add argument to disable notifications
		options.addArguments("--headless");					//headless execution
		
		// 4. Create a new ChromeDriver instance with the configured options
		driver = new ChromeDriver(options);					//initializing chrome driver
		
		// 5. Navigate to the eBay website
		driver.get("https://www.ebay.com/");				//loading the page
	}
	
	// C. Once set the driver; So call the current WebDriver instance for browser interaction
	public static WebDriver getDriver(){					// get the data (getter)
		return driver;										//return driver to call
	}
	
	
	// D. Once action is done (in AfterActions) tear down the driver, and clean up WebDriver resources
	public static void tearDownDriver(){
		driver.close();										//closing current session of the browser
		driver.quit();										//closing all sessions of the browser
	}
}

/*
 OOPs concepts: 	Encapsulation --> getters and setters setupDriver, getDriver
 				
*/
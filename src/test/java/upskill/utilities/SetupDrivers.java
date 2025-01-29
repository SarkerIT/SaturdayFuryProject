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
	
	public static WebDriver driver;							//initializing driver
	public static void setupDriver(){						// set-up the driver first
		
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromeDriver\\chromedriver.exe"); // We do not do it anymore
		
		WebDriverManager.chromedriver().setup();		//set the Chrome driver from cloud and BoniGarcia Plugin
		ChromeOptions options = new ChromeOptions();		//initializing chrome options
		options.addArguments("--start-maximized");			//add argument to maximize browser
		options.addArguments("--disable-notifications");	//add argument to disable notifications
		options.addArguments("--headless");					//headless execution
		driver = new ChromeDriver(options);					//initializing chrome driver
		driver.get("https://www.ebay.com/");				//loading the page
	}
	// Once set the driver, it is ready to call; get the driver
	public static WebDriver getDriver(){					// get the data (getter)
		return driver;										//return driver to call
	}
	// Once action is done (in AfterActions) tear down the driver
	public static void tearDownDriver(){
		driver.close();										//closing current session of the browser
		driver.quit();										//closing all sessions of the browser
	}
}

/*
 OOPs concepts: 	Encapsulation --> getters and setters setupDriver, getDriver
 				
*/
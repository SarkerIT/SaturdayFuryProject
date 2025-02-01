package baseSelenium;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics_YT {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // need Selenium version 4 of later
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement w1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).perform();
		
		
		WebElement SignIn = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		
		SignIn.click();		

	}

}

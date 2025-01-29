// pageElements Class --> this is locator Locator 
package upskill.ebay.pageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upskill.utilities.SetupDrivers;

public class EbayHomePageLocators {
	
	//The following model (syntax) is known as PageFactory
	
	// Good thing about PageFactory is it works like independent WebElement like an individual object
	// If you convert it to an object you can  do operations on it
	// The idea is that  each component is works independently
	// Question: How do you write your locator?
	// Answer: I use PageFactory to write the locators.
	
	// == PageFactory-I Starts ==
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	// == PageFactory-I Ends ==
	
		
	//Search Button
	@FindBy(xpath="//button[@value='Search']")
	public WebElement btnSearch;

	
	
	//My Ebay Link
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement linkMyEbay;
	
	
	//Summary
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
	
	/*	
	// Locators without PageFactory (EXAMPLE) --> notice findElement
	// here you gonna get one xPath
	public WebElement btnTest = SetupDrivers.driver.findElement(By.xpath("//input[@value='Search']"));
	
	// Locators without PageFactory - Multiple Elements(EXAMPLE) --> notice findElements
	public List<WebElement> tblTest = SetupDrivers.driver.findElements(By.xpath("//tag[@attitbute ='value']"));
	// Here you gonna get multiple xPath and save them in a list
	 
	// Locators WITH PageFactory multiple elements from table
	 @FindAll({FindBy(xpath="//input[@value='Search']")})
	 public List <WebElement> tblTest2;	  
	
	*/
	
}
package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	// Validate Shoes Items
	@FindBy(xpath = "//span[@class='BOLD' and contains(text(), 'Shoes')]")
	// also Valid xPath--> //span[contains(@class, 'BOLD') and contains(text(),
	// 'Shoes')]
	public WebElement txtShoes;

	// Validate Pants Items
	@FindBy(xpath = "//span[@class='BOLD' and contains(text(), 'Pants')]")
	// also Valid xPath--> //span[contains(@class, 'BOLD') and contains(text(),
	// 'Pants')]
	public WebElement txtPants;

	// Validate Shirts Items
	@FindBy(xpath = "//span[@class='BOLD' and contains(text(), 'Shirts')]")
	public WebElement txtShirts;

	// Validate Pens Items
	@FindBy(xpath = "//span[@class='BOLD' and contains(text(), 'Pens')]")
	public WebElement txtPens;

	// Validate Pens Items
	@FindBy(xpath = "//span[@class='BOLD' and contains(text(), 'Laptops')]")
	public WebElement txtLaptops;

	// << From dataTable of cucumber feature file | >>
	
	// Checkbox Brand Adidas
	@FindBy(xpath = "//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	// Checkbox Brand Nike
	@FindBy(xpath = "//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	// Checkbox Brand Unbranded
	@FindBy(xpath = "//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;

}

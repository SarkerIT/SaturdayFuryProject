package upskill.ebay.PageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
//import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1:  boolean assert
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2 --> Suggested result and actual result
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3: boolean assert
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	
	
	public void verifyPantsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}
	
	public void verifyShirtsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}

	public void verifyPensItems() {
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPens.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Pens", EbaySearchResultLocatorsObj.txtPens.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtPens.isDisplayed();
		
	}

	public void verifyLaptposItems() {
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtLaptops.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Laptops", EbaySearchResultLocatorsObj.txtLaptops.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtLaptops.isDisplayed();
		
	}


	
	
	/* 

	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		}  else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		} else if(brand.equals("Nike")){
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		} else if(brand.equals("Unbranded")){
			Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		}  else {
			System.out.println("Brand not found");
		}
	}
	
	public void selectCottonTee(){
		EbaySearchResultLocatorsObj.linkShirtItems.click();
	}
	
	*/
	
}
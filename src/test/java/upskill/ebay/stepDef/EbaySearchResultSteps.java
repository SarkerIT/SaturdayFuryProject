package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.PageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {

	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("^Item list should have only shoes related products$")
	public void Item_list_should_have_only_shoes_related_products() throws Throwable {
	    
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	
	
	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		
		EbaySearchResultActionsObj.verifyPantsItems();
	    
	}
	
	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShirtsItems();
	}
	
	
	@Then("^Item list should have only Pens related products$")
	public void item_list_should_have_only_Pens_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPensItems();
	}
	
	@Then("^Item list should only have Laptops related products$")
	public void item_list_should_only_have_Laptops_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyLaptposItems();		
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		

	}
	
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String items) throws Throwable {

	}
	
}

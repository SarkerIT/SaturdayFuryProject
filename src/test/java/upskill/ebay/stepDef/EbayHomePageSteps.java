// When run the feature file, we get the stepDefinitions
// Then we put those stepDefinitions in the 
// stepDefinition files (e.g. PagestSteps.java and ResultSteps files
package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import upskill.ebay.PageAction.EbayHomePageActions;
import upskill.ebay.PageAction.EbaySearchResultActions;
import upskill.ebay.pageElements.EbaySearchResultLocators;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    // opening ebay.com on setup driver class
		// Do not need to call any method; just ensure we are on homepage
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	   
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPants();

	}
	
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirts();

	}
	
	@When("^Search for Pens$")
	public void search_for_Pens() throws Throwable {
		EbayHomePageActionsObj.searchPens();
		
	}
	
	
	@When("^Search for Laptops$")
	public void search_for_Laptops() throws Throwable {
			EbayHomePageActionsObj.searchLaptops();
		
	}

}

package upskill.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;



// This class contains actions to be performed after each test scenario.
public class AfterActions {
	
	// @After comes from cucumber; runs after each test scenario. 
	// This method is annotated with @After, meaning it will run after each test scenario.
	@After
	public void afterActions(Scenario scen) throws Exception {
		
		// Call the tearDownDriver() method to clean up any resources and close the browser.
		// Calling the tearDownDriver() method from  SetupDriver.java class file; since they are public no need to create object.
		SetupDrivers.tearDownDriver();

		// Print a message to the console indicating the test is complete and the browser is closed.
		System.out.println(" <------Test Complete, Browser Closed --->");
	}
}
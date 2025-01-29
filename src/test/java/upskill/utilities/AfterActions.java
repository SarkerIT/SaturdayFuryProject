package upskill.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {				

// @After comes from cucumber; runs after each tests
	
	@After				
	public void afterActions(Scenario scen) throws Exception{
		SetupDrivers.tearDownDriver(); // Calling the tearDownDriver() method from after SetupDriver.java
		System.out.println(" <------Test Complete, Browser Closed --->");
	}
}
package upskill.utilities;
// utilities are used another classes; they are kinda house keepers
import cucumber.api.Scenario;
import cucumber.api.java.Before;


//This class contains actions to be performed before each test scenario.
public class BeforeActions {


	//@Before will run before executing any Scenario in the .feature file ; comes from cucumber.	
	@Before				
	public void beforeActions(Scenario scen){		//Get cucumber Scenario parameter from feature file 
		// Print a message to the console indicating that the driver is being initialized.
		System.out.println("|--->>>> Initializing Driver....");	
		
		// Calling setter method (setup driver) method to execute before scenario
		// Calling the setupDriver() method from  SetupDriver.java class file; since they are public no need to create object									
		SetupDrivers.setupDriver();	
		
		// Print the name of the current test scenario to the console for informational purposes.
		System.out.println("Test Scenario Name : " + scen.getName()); // getName(coming form Cucumber to get Scenario name)
	}

}
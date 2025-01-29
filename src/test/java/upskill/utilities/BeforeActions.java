package upskill.utilities;
// utilities are used another classes; they are kinda house keepers
import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

//@Before will run before executing any Scenario in the .feature file ; comes from cucumber
	
	@Before				
	public void beforeActions(Scenario scen){		//Get cucumber Scenario parameter from feature file 
		System.out.println("|--->>>> Initializing Driver....");			
		SetupDrivers.setupDriver();	// Calling the setupDriver() method from  SetupDriver.java class file; since they are public no need to create object									//Calling setter method (setup driver) method to execute before scenario
		System.out.println("Test Scenario Name : " + scen.getName()); // getName(coming form Cucumber to get Scenario name)
	}

}
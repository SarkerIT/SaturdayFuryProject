// What is a runner class? Runner is the Main method kinda. 
// It Triggers and Executes tests defined in the feature files and step definitions
package upskill.runners;

import java.io.File;

import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// The @CucumberOptions annotation is used in Cucumber, to configure various settings for the test runner. 
@CucumberOptions(features = { "src/test/resource/FeatureFiles" },       // Where is the feature file (Gherkin Syntax)
				glue = { "upskill.ebay.stepDef", "upskill.utilities" }, // Points to the package(s) containing the step definition classes that match the steps in the feature files.
				tags = {"@regression"}, 								// Which testcase to exucute?  run the one regresssion tag
				plugin = { "pretty", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports.html" },  // Plugins used for reporting or other output formats.
						// "pretty" – outputs a more readable format. html--> html report; json --> json report
				monochrome = true,
						// When set to true, it ensures that the console output is more readable, removing unnecessary escape sequences.
				dryRun = true)  
						// If set to true, it checks whether all steps in the feature files have corresponding step definitions without actually running the tests.

public class RunnerClass extends AbstractTestNGCucumberTests {   // Inheritance OOPs concept

	@AfterClass     							// AfterClass annotation comes from testNG but @before and @after come from Cucumber
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml")); // After execution the test, load the  config.xml file and according to the config.xml file write down the report
	}

}
package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.junit.Cucumber;		

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		 features = "Resources/Features/MyAccount_AddAddress.feature",
		 glue= {"StepDefinitions"},
		 plugin = { "pretty", "html:target/cucumber-reports" },
		 monochrome = true,
		 dryRun = false
		 )
		 
public class Runner {

}
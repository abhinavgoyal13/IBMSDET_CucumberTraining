package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src/test/resources/Login/login.feature"},
	glue={"StepDefinition"},
	tags="@login",
	dryRun=false,//To check weather you have missed an steps in the scenarion
	monochrome=true,//to make the console output in a better format
	strict = true, //it will check wether any step is not defined in step definition
	plugin= {"html:test_output/cucumber.html","junit:test_output/cucumber.xml","json:test_output/cucmber.json"}

	)
public class runner {

}

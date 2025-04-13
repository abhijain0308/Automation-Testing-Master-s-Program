package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features", 
		glue = "stepdefs",
		tags = {"@sanity"}
		//tags = {"not @ignore"}  // it will ignore all the @ignore scenarios and rest all will be executed
		//tags = {"@login"}  // it will run all the scenarios in login feature file
		//tags = {"@sanity or @regression"} // it will execute all the scenarios with @sanity or @regression
		//tags = {"@sanity and @regression"} // it will execute all the scenarios with @sanity and @regression both
		)

public class TestRunner {

}

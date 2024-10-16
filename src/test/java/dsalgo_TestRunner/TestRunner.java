package dsalgo_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features/RegisterPage.feature"},
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"})

public class TestRunner {
	

}

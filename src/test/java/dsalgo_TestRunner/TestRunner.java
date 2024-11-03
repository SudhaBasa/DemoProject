package dsalgo_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"},
//tags = "@TS_Register_05",
publish=true,
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})

public class TestRunner {
	

}

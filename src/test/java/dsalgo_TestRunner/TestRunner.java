package dsalgo_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/resources/Features/Queue.feature"},
//features={"src/test/resources/Features/RegisterPage.feature", "src/test/resources/Features/QueuePage.feature"},  //to run two different feature files
//features= {"@target/rerun.txt"},

tags = "@TS_Queue_04",
publish=true,
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html",
		
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}
//dryRun=true, // checks mapping between scenario steps and step definition methods
		
		)

public class TestRunner {
	

}

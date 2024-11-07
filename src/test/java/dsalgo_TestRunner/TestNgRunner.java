package dsalgo_TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features={"src/test/resources/Features/QueuePage.feature"},
//features={"src/test/resources/Features/RegisterPage.feature", "src/test/resources/Features/QueuePage.feature"},  //to run two different feature files
//features= {"@target/rerun.txt"},

//tags = "@TS_Register_04",
publish=true,
glue= {"dsalgo_StepDefinition","dsalgo_Hooks"},
plugin={"pretty","html:target/CucumberReports/CucumberReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
//dryRun=true, // checks mapping between scenario steps and step definition methods
		
		)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}

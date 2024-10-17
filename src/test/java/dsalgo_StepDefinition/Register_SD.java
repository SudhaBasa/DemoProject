package dsalgo_StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dsalgo_DriverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD {

	
	
	
	
	
}
















	/*
	WebDriver driver;

	@Given("User navigates to Register Account Page")
	public void user_navigates_to_register_account_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//a[text()=' Register ']")).click();
	}

	@When("User leaves the fields empty and clicks Register button")
	public void user_leaves_the_fields_empty_and_clicks_register_button() {

		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {

		driver.findElement(By.xpath("//input[@value='Register']")).click();
		String text = driver.findElement(By.name("username")).getAttribute("validationMessage");
		// System.out.println(text);
		System.out.println("Tooltip Message" + text);
		Assert.assertEquals("Please fill out this field.", text);

	}*/

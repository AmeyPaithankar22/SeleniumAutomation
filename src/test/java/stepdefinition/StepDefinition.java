package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Before(order=1)
	public void cucumber1() {
		System.out.println("Hook before 1");
	}

	@Before(order=2)
	public void cucumber2() {
		System.out.println("Hook before 2");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("BeforeStep Hook");
	}

	@Given("user is in Blog page")
	public void given() throws Throwable {
		System.out.println("Given Section");
	}

	@When("user enters data in the search field")
	public void when() throws Throwable {
		System.out.println("When Section");
	}

	@Then("data should appear in the search field")
	public void then() throws Throwable {
		System.out.println("Then Section");
	}

	//  @And("^you are in And annotation$")
	//  public void and() throws Throwable {
	//  }
	//
	//  @But("^you are in But annotation$")
	//  public void but() throws Throwable {
	//  }

}

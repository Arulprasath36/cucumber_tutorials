package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thanos_StepDef_Hooks {
	
	@Given("^Thanos has the Inifinity Stones$")
	public void thanos_has_the_Inifinity_Stones() throws Throwable {
	   System.out.println("Thanos has the Inifinity Stones");
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
		System.out.println("Thanos snaps his fingers");
	}

	@Then("^half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
		System.out.println("half of the living things died");
	}
}

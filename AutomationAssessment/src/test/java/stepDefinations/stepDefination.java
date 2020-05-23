package stepDefinations;

import commonUtility.utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class stepDefination {
	
	
	
	@Given("^Rates API for latest foreign Exchange rate$")
	public void rates_API_for_latest_foreign_Exchange_rate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello");
	    //utils.ratesAPIGETRequest();
	}

	
	@When("^User enter with (.+) and amount (.+)$")
	    public void user_enter_with_and_amount(String currency, int amount) throws Throwable {
	        utils.calculateExchangeRate(currency, amount);
	    }

	@Then("^currency convered as per latest rate into Euro$")
	public void currency_convered_as_per_latest_rate_into_Euro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}

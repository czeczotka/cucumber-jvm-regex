package com.czeczotka.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.String.format;

public class CucumberSteps {

    @Before
    public void setUp() {
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        System.out.println ("We have an exact match on the step name");
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        System.out.println (format("Getting integers {0} and {1}", arg1, arg2));
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
    }
}

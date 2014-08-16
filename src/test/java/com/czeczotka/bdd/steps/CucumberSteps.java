package com.czeczotka.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CucumberSteps {

    @Before
    public void setUp() {
    }

    @Given("^I have a cucumber step$")
    public void i_have_a_cucumber_step() throws Throwable {
        System.out.println ("We have an exact match on the step name");
    }
}
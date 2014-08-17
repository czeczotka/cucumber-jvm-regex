package com.czeczotka.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static java.text.MessageFormat.format;

public class CucumberSteps {

    @Before
    public void setUp() {
    }

    @Given("^I have a cucumber step$")
    public void i_have_a_cucumber_step() throws Throwable {
        System.out.println ("Step definition exact match");
    }

    @Given("^I have a (?:tasty|nasty|rusty) cucumber step$")
    public void i_have_a_X_cucumber_step() throws Throwable {
        System.out.println ("Step definition with a non-capturing group");
    }

    @Given("^I have (\\d+) (.*) in my basket$")
    public void i_have_in_my_basket(int number, String veg) throws Throwable {
        System.out.println(format("I have {0} {1} in my basket", number, veg));
    }

    @Given("^There (?:is|are) (\\d+) (?:cats?|ox|oxen) fed by (\\d+) (?:persons?|people)$")
    public void animals_fed_by_people(int animals, int persons) throws Throwable {
        System.out.println(format("{0} animal(s) fed by {1} person(s)", animals, persons));
    }
}
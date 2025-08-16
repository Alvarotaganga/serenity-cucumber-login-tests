package com.automationexercise2.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"./src/test/resources/features/Login.feature"},
glue = {"com.automationexercise2.stepdefinition"},
snippets = SnippetType.CAMELCASE)
public class LoginRunner {


}

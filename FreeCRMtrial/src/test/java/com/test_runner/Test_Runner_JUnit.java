package com.test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty","html:target"},
		features = "./src/test/resources/Feature", //path of feature files
		plugin = {"pretty:STDOUT","html:test-output","junit:report_xml/Cucumber.xml","json:report_json/cucumber.json"},
		glue = {"step_definations"}, //the path of the step defination files
		dryRun = false//to check the mapping of feature file and step def files
		,tags = {"@HnC","@Calendarcreate"}
		//,tags= {"@Loginfeature","@UnsuccessfulLogin"}
		,monochrome= true // display the format in readable format
		,strict = false // it will stop if any undefined methods are present
		)
public class Test_Runner_JUnit {

}

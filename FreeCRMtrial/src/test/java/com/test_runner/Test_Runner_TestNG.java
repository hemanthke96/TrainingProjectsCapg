package com.test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests; 

//@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty","html:target"},
		features = "./src/test/resources/Feature", //path of feature files
		plugin = {"pretty:STDOUT","html:test-output","junit:report_xml/Cucumber.xml","json:report_json/cucumber.json"},
		glue = {"step_definations"}, //the path of the step defination files
		dryRun = true//to check the mapping of feature file and step def files
		//,tags = {"@HnC","@Calendardelete"}
		,tags= {"@Loginfeature","@SuccessLogin"}
		,monochrome= true // display the format in readable format
		,strict = false // it will stop if any undefined methods are present
		)
public class Test_Runner_TestNG extends AbstractTestNGCucumberTests{

}
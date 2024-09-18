package com.test_steps;

import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.pages.Homepage;
import com.util.SetupDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

public class DemoWebShop_Functionality_Test {
	Homepage home = new Homepage();
	@BeforeTest
	public void LaunchBrowser() {
		SetupDriver.initialization();

	}

	@Test()
	public void LoginFunctionality() {
		home.clicklogin();
		home.enterDetailsforLogin("Pranay2@gmail.com","QeWE123@");
		home.clickonLoginAfterEntry("Pranay");
	}

	@Test()
	public void SearchPrduct() {
		home.SearchandGetData("Laptop");
	}

	@AfterSuite()
	public void teardown() {
		SetupDriver.closebrowser();
	}

	@Given("Open web Browser and user is on homepage")
	public void open_web_Browse() {
		SetupDriver.initialization();
	}

	@Given("Click on login link in homepage and Enter the Details")
	public void click_on_login_link_in_homepage_and_Enter_the_Details() {
		home.clicklogin();
		home.enterDetailsforLogin("Pranay2@gmail.com","QeWE123@");
	}

	@Then("Click on Login to login successfully")
	public void click_on_Login_to_login_successfully() {
		
	}

	@Given("Open web Browser and user is on homepage")
	public void user_is_on_Homepage() {
		SetupDriver.initialization();
	}

	@Given("Click on Seach Box and enter the product to be searched.")
	public void click_on_Seach_Box_and_enter_the_product_to_be_searched() {
		home.SearchandGetData("Laptop");
	}

	@Then("Click on enter and get the details of the product")
	public void click_on_enter_and_get_the_details_of_the_product() {
	}



}

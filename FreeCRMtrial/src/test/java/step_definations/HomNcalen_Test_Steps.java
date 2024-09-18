package step_definations;

import com.free.pages.CalendarPage;
import com.free.pages.HomePage;
import com.free.pages.LoginPage;
import com.free.util.SetupDriver;
import com.free.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomNcalen_Test_Steps extends SetupDriver{
	HomePage homepage;
	LoginPage lgpg =new LoginPage();
	CalendarPage cld;
//==============Homepage functionality=====================
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	   System.out.println(lgpg.titleofpage());
	   System.out.println(lgpg.url_page());
	}
//---------------------------------------------------------
	@When("user click on calendar")
	public void user_click_on_calendar() throws Exception {
		homepage =new HomePage();
		homepage.Cal_click();
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}

	@Then("user navigates to calendar section")
	public void user_navigates_to_calendar_section() throws Exception {
		homepage = new HomePage();	
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
//---------------------------------------------------------		
	}
	
	@When("user click on Deals")
	public void user_click_on_Deals() throws Exception {
		homepage = new HomePage();
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}

	@Then("user navigates to deals section")
	public void user_navigates_to_deals_section() throws Exception {
		homepage = new HomePage();	   
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}
//---------------------------------------------------------
	@When("user click on Tasks")
	public void user_click_on_Tasks() throws Exception {
		homepage = new HomePage();	   
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}

	@Then("user navigates to Tasks section")
	public void user_navigates_to_Tasks_section() throws Exception {
		homepage = new HomePage();	  
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}
//---------------------------------------------------------
	@When("user click on Contact")
	public void user_click_on_Contact() throws Exception {
		homepage = new HomePage();	 
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}

	@Then("user navigates to Contact section")
	public void user_navigates_to_Contact_section() throws Exception {
		homepage = new HomePage();  
		homepage.verify_url();
		Thread.sleep(1000);
	}
//---------------------------------------------------------
	@When("user click on Company")
	public void user_click_on_Company() throws Exception {
		homepage = new HomePage();	
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}

	@Then("user navigates to Company section")
	public void user_navigates_to_Company_section() throws Exception {
		homepage = new HomePage();	
		String actual = homepage.verify_url();
		TestUtil.assertmethod(actual);
		Thread.sleep(1000);
	}
//======================Calendar Functionality============	
	@Given("user is on calendar page")
	public void user_is_on_calendar_page() {
		homepage =new HomePage();
		homepage.Cal_click();
	}
//---------Create an Event----------------------------
	@When("user click on create new event")
	public void user_click_on_create_new_event() {
	    cld = new CalendarPage();
	    cld.createclk();
	}

	@When("enter details about event")
	public void enter_details_about_event() throws Exception {	    
		cld = new CalendarPage();
		Thread.sleep(3000);
		cld.exceldataentry();
	}

	@Then("click on save")
	public void click_on_save() {	    
		cld = new CalendarPage();
		cld.saveclk();
	}
//-------------Edit an Event---------------------------
	@When("user click on edit new event")
	public void user_click_on_edit_new_event() {	    
		homepage =new HomePage();
		homepage.Cal_click();
		cld = new CalendarPage();
		cld.editclk();
	}

	@When("edit details about event")
	public void edit_details_about_event() {	    
		cld = new CalendarPage();
	}
//------------Delete an Event-------------------------------
	@When("user click on event page")
	public void user_click_on_event_page() {	    
		cld = new CalendarPage();
		cld.eventclk();
	}

	@When("user click on delete")
	public void user_click_on_delete() {	    
		cld = new CalendarPage();
		cld.deleteclk();
	}
}

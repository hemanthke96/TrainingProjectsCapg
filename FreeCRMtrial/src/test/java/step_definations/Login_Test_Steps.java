package step_definations;

import org.junit.Assert;

import com.free.pages.HomePage;
import com.free.pages.LoginPage;
import com.free.util.SetupDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Test_Steps extends SetupDriver {
	
	LoginPage lginpage = new LoginPage();
	HomePage hmpage;
	
	@Given("user launches the browser")
	public void launch_the_browser() {  
		SetupDriver.initialization();
	}

	@When("user click on login link")
	public void click_on_login_link() throws Exception {
		lginpage = new LoginPage();
		lginpage.click_on_Loginlink();
		//System.out.println(lginpage.validateCRMLogo());
		Thread.sleep(1000);
	}

	@Then("user navigates to Login Page")
	public void user_navigates_to_Login_Page() throws Exception {
	//	lginpage = new LoginPage();
		String lgtitle= lginpage.titleofpage();
		Thread.sleep(1000);
		System.out.println(lgtitle);
		//lginpage.click_on_classic();
		//Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.", lgtitle);
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() throws Exception {
	//	lginpage = new LoginPage();
		lginpage.email_login();
	    lginpage.password_login();
	    Thread.sleep(1000);
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_Login_button() throws Exception {
		hmpage = lginpage.login_button();
	   Thread.sleep(10000);
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() throws Exception {
	String hmtitle =hmpage.verifyHomepagetitle();
	Assert.assertEquals("Cogmento CRM", hmtitle); 
	Thread.sleep(1000);
	}

	@When("user click on Login link")
	public void user_click_on_Login_link() throws Exception {
	//	lginpage = new LoginPage();
		lginpage.click_on_Loginlink();
		Thread.sleep(1000);
		System.out.println(lginpage.titleofpage());
	}

	@When("user clicks on Login button without entering email and password")
	public void user_clicks_on_Login_button_without_entering_email_and_password() {
	//	lginpage = new LoginPage();
		lginpage.login_button();
	}

	@Then("user gets a {string} as Invalid Request")
	public void user_gets_a_as_Invalid_Request(String invstring) {
	//	lginpage = new LoginPage();
		lginpage.invClickLogin();
		String expected = lginpage.inval_text();
		Assert.assertEquals(expected,invstring);
	}
}

package stepDefinitions;


import java.util.List;
import java.util.Map;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixRequestMeetingPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	
	private HelixLoginPage helix_Login = new HelixLoginPage(DriverFactory.getDriver());
	private HelixRequestMeetingPage helix_req_meeting = new HelixRequestMeetingPage(DriverFactory.getDriver());
	private static String actualtitle;
	
	@Given("User is on Helix login page")
	public void user_is_on_Helix_login_page() throws InterruptedException
	{
		DriverFactory.getDriver().get("http://3.6.26.96:8083/Default.aspx");
		Thread.sleep(4000);
	}
	
	
	
	@When("User gets the title of the login page")
	public void user_gets_the_title_of_the_login_page()
	{
		actualtitle = helix_Login.getHelixloginPageTitle();
		System.out.println("The title of the page is "+actualtitle);
	}
	
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		Assert.assertTrue(actualtitle.contains(expectedTitle));
	}
	
	@Then("Forgot your password link should be displayed as {string}")
	public void forgot_pwd_link(String expectedLinkName)
	{
		String actualName = helix_Login.isForgotPasswordLinkExists();
		Assert.assertEquals(actualName, expectedLinkName);
		System.out.println("Link is displyaed");
	}

	@When("title of the login page is {string}")
	public void title_of_the_page(String expectedtitle)
	{
		Assert.assertEquals(expectedtitle, helix_Login.getHelixloginPageTitle());
	}
	
	@Then("I enter {string} and {string} and login")
	public void i_enter_UN_PWD(String username, String password) throws InterruptedException
	{
		helix_Login.enterUN(username);
		helix_Login.enterPassword(password);
	}
	
	@Then("I validate the login function with {string}")
	public void i_validate_the_login_function(String welcomeMessage)
	{
		helix_req_meeting.validateIsWelcomeDisplayed(welcomeMessage);
	}


}

package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixAdminTools;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixMeetingListPage;
import com.helix.team.pages.HelixProjectAdminPage;
import com.helix.team.pages.HelixRequestMeetingPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminToolsStepDef {
	
	HelixLoginPage helixLogin = new HelixLoginPage(DriverFactory.getDriver());
	HelixMeetingListPage helixmeetingListPage = new HelixMeetingListPage(DriverFactory.getDriver());
	HelixAdminTools helixAdminTools = new HelixAdminTools(DriverFactory.getDriver());
	HelixProjectAdminPage helixProjAdmin = new HelixProjectAdminPage(DriverFactory.getDriver());
	
	@Given("User is on Meeting request Tools Page")
	public void user_on_admin_page(DataTable datatable) throws InterruptedException
	{
		List<Map<String, String>> credList = datatable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("http://3.6.26.96:8085/Default.aspx");
		helixLogin.doLogin(username, password);
		Thread.sleep(5000);
		helixAdminTools = helixmeetingListPage.clickOnAdminToolsSection();
	}
	
	@Given("Validate Admin Tools label on the page")
	public void validate_Admin_Tools_label_on_the_page()
	{
		helixAdminTools.doValidateLabel();
	}
	
	@Then("click on Admin Tools option on the page")
	public void click_on_admin_tools_options()
	{
		helixAdminTools= helixmeetingListPage.clickOnAdminToolsSection();
	}
	
	@When("you click on project admin button")
	public void click_on_project_Admin()
	{
		helixAdminTools.clickOnProjectAdminBtn();
	}
	
	@Then("validate that you are now on Project admin page")
	public void validate_i_am_on_proj_admin_page()
	{
		helixProjAdmin.validateProjAdminLable();
	}

}

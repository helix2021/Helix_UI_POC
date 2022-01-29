package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixAdminTools;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixMeetingListPage;
import com.helix.team.pages.HelixProjectAdminPage;
import com.helix.team.utils.ElementUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProjectAdminStepDef {
	
	HelixLoginPage helixLogin = new HelixLoginPage(DriverFactory.getDriver());
	HelixMeetingListPage helixmeetingListPage = new HelixMeetingListPage(DriverFactory.getDriver());
	HelixAdminTools helixAdminTools = new HelixAdminTools(DriverFactory.getDriver());
	HelixProjectAdminPage helixProjAdmin = new HelixProjectAdminPage(DriverFactory.getDriver());
	ElementUtils utils = new ElementUtils();
	WebDriver driver;
	
	
	@Given("User is on project admin Tools Page")
	public void i_am_on_proj_admin_page(DataTable datatable) throws InterruptedException
	{
		List<Map<String, String>> credList = datatable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("http://65.1.181.50:8083/AdminTools.aspx");
		helixLogin.doLogin(username, password);
		Thread.sleep(5000);
		helixAdminTools = helixmeetingListPage.clickOnAdminToolsSection();
		helixAdminTools.clickOnProjectAdminBtn();
	}
	
	@When("you select {string} from Choose Project Series dropdown {string}")
	public void selectProj_Series(String series, String nameOfTheSeriesDropDown) throws InterruptedException
	{
		helixProjAdmin.selectValueFromProjSeries(driver,nameOfTheSeriesDropDown, series);
		Thread.sleep(3000);
	}
	
	@And("you select {string} from Choose Event Type dropdown {string}")
	public void selectEvent_Type(String EventType, String nameOfTheEventtypeDropDown) throws InterruptedException
	{
		helixProjAdmin.selectValueFromEventType(driver,nameOfTheEventtypeDropDown, EventType);
		Thread.sleep(3000);
	}
	
	@And("click on view or edit button")
	public void clickOnViewEditButton() throws InterruptedException
	{
		helixProjAdmin.cliickOnViewEditbtn();
		Thread.sleep(3000);
	}
	
	@And("Enter all the values for the fields on PAGE ADMIN Page")
	public void enterValForPAfields() throws IOException
	{
		try {
			helixProjAdmin.fillProgramFeeBreakDown();
			helixProjAdmin.clickOnBudgetButton();
			helixProjAdmin.fillBudgetDetails();
			helixProjAdmin.clickOnFeeClauseButton();
			helixProjAdmin.fillFeeClause();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

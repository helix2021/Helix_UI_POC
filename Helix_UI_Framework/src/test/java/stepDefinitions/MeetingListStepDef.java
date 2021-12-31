package stepDefinitions;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixMeetingListPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MeetingListStepDef {

    HelixLoginPage helixLogin = new HelixLoginPage(DriverFactory.getDriver());
    HelixMeetingListPage helixMeetingList=new HelixMeetingListPage(DriverFactory.getDriver());


    @Given("User is on the Meeting List Page")
    public void user_is_on_the_meeting_list_page(DataTable datatable) throws InterruptedException
    {
        List<Map<String, String>> credList = datatable.asMaps();
        String username = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        DriverFactory.getDriver().get("http://3.6.26.96:8085/Default.aspx");
        helixLogin.doLogin(username, password);
        Thread.sleep(5000);
    }


    @Then("Validate {string} header on the Meeting List page")
    public void validateHeaderOnTheMeetingListPage(String expectedHeader) {
        String helixMeetingListPageHeaderText = helixMeetingList.getMeetingListHeaderText();
        Assert.assertEquals(helixMeetingListPageHeaderText,expectedHeader);
        System.out.println("Header in Meeting List page is verified"+helixMeetingListPageHeaderText);
    }

    @Then("User enters the Meeting ID {string} in the input field")
    public void userEntersTheMeetingIDInTheInputField(String meetingID) {
        helixMeetingList.enterMeetingDetailsToSearch(meetingID);
    }


    @Then("User clicks on Search button")
    public void userClicksOnSearchButton() {
        helixMeetingList.clickOnSearchButton();

    }
}




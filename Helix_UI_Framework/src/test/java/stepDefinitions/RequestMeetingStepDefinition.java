package stepDefinitions;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixRequestMeetingPage;
import io.cucumber.java.en.Then;

public class RequestMeetingStepDefinition {


    private HelixRequestMeetingPage helixRequestMeetingPage = new HelixRequestMeetingPage(DriverFactory.getDriver());

    @Then("user clicks on Request meeting tab")
    public void userClicksOnRequestMeetingTab() {
        helixRequestMeetingPage.clickOnMeetingRequestHeaderTab();
    }

    @Then("Validate meeting list label on the page")
    public void validateMeetingListLabelOnThePage() {

        helixRequestMeetingPage.getNewMeetingRequestHeaderValue();
//        helixRequestMeetingPage.getNewMeetingRequestHeaderValue("New Meeting Request");

        System.out.println("raj@ " + helixRequestMeetingPage.getNewMeetingRequestHeaderValue());
    }


}

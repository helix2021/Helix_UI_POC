package stepDefinitions;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixRequestMeetingPage;
import io.cucumber.java.en.And;
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


    @Then("User selects speaker program")
    public void userSelectsSpeakerProgram() throws InterruptedException {
        Thread.sleep(1000);
        helixRequestMeetingPage.selectProgramValueDropdown("Test Client Speaker Programs 2021");
    }

    @And("user selects event city")
    public void userSelectsEventCity() throws InterruptedException {
        helixRequestMeetingPage.enterEventCityVal("test");
        Thread.sleep(3000);
    }

    @And("user selects {int}st choice start date")
    public void userSelectsStChoiceStartDate(int arg0) throws InterruptedException {
        helixRequestMeetingPage.enterFirstChoiceStartDate("12/15/2021");
        Thread.sleep(3000);
    }
}

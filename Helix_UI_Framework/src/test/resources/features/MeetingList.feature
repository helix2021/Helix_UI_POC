#Author: Vidya
Feature: Helix Meeting List feature

  Background:
    Given User is on the Meeting List Page
      | username              | password      |
      | mcorry@mailinator.com | Test123Test!! |

    #Need to delete below scenario.
#  @MeetingList
#  Scenario: Meeting list  Page label
#    Then user clicks on Request meeting tab
#    Then Validate meeting list label on the page

@TC_VerificationOFHeader_Regression
Scenario: To verify user landed on Meeting List page on default with a header "Meetings List"
  Then Validate "Meetings List" header on the Meeting List page

#  Need to write a test case for searchBy using 8083

 Scenario: To verify user is able to enter the meeting ID and able to click on search button
   Then User enters the Meeting ID "BIOSP211-7358" in the input field
   Then User clicks on Search button




#Author: Rajesh Matadh
Feature: Helix Login Page feature

  Background:
    Given User is on Meeting request Tools Page
      | username              | password      |
      | mcorry@mailinator.com | Test123Test!! |

  @MeetingList
  Scenario: Meeting list  Page label
    Then user clicks on Request meeting tab
    Then Validate meeting list label on the page


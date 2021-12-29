#Author: Rajasekar
Feature: Request meeting page feature

  Background:
    Given User is on Meeting request Tools Page
      | username              | password      |
      | mcorry@mailinator.com | Test123Test!! |

Scenario: Meeting List Page validations
  Then user clicks on Request meeting tab
  Then Validate meeting list label on the page

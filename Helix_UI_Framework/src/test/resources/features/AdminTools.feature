Feature: Admin Tools Page Validations


Background: 
Given User is on Meeting request Tools Page
|username			  |password     |
|mcorry@mailinator.com|Test123Test!!|

#@AdminTools
#Scenario: Admin Tools Page label
#Then Validate Admin Tools label on the page

@AdminTools
Scenario: Project Admin 
When you click on project admin button
Then validate that you are now on Project admin page
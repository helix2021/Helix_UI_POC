#Author: Rajesh Matadh
Feature: Helix Login Page feature

Scenario: Login age title
Given User is on Helix login page
When User gets the title of the login page 
Then Page title should be "Biohaven Speaker Bureau"


Scenario: Forgot your password link
Given User is on Helix login page
Then Forgot your password link should be displayed as "Forgot Your Password?"



Scenario Outline: Login with correct credentials
Given User is on Helix login page
When title of the login page is "<title>" 
Then I enter "<username>" and "<password>" and login 
Then I validate the login function with "<welcomeMessage>"

Examples:
|title					   |username              |password     | welcomeMessage |
|Biohaven Speaker Bureau | mcorry@scimedny.com |Test123Test!! |Welcome, Merrill |
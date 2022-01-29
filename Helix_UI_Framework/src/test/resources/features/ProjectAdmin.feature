Feature: Project Admin Page

Background: 
Given User is on project admin Tools Page
|username			  |password     |
|mcorry@scimedny.com|Test123Test!!|

#@Project_Admin_Regression @helix_Regression
#Scenario: Project Administration
#Then validate that you are now on Project admin page

@Project_Admin_Sanity @helix_sanity
Scenario Outline: Project Admin flow
When you select "<series>" from Choose Project Series dropdown "<nameOfTheSeriesDropDown>"
And you select "<Event Type>" from Choose Event Type dropdown "<nameOfTheEventtypeDropDown>"
And click on view or edit button
And Enter all the values for the fields on PAGE ADMIN Page
Examples:
| series | Event Type | nameOfTheSeriesDropDown | nameOfTheEventtypeDropDown |
| Biohaven Speaker Programs 2021|Out-Of-Office|ProgramType|EventType|



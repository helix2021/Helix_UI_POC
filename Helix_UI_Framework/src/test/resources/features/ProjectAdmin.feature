Feature: Project Admin Page

Background: 
Given User is on project admin Tools Page
|username			  |password     |
|mcorry@scimedny.com|Test123Test!!|

#@Project_Admin_Regression @helix_Regression
#Scenario: Project Administration page validation
#Then validate that you are now on Project admin page

@Project_Admin_Sanity @helix_sanity
Scenario Outline: Project Admin flow
When you select "<series>" from Choose Project Series dropdown "<nameOfTheSeriesDropDown>"
And you select "<Event Type>" from Choose Event Type dropdown "<nameOfTheEventtypeDropDown>"
And click on view or edit button
And Enter all the values for the fields on PAGE ADMIN Page
And click on submit buttom and validate the success message as "<Submit Message>"
Examples:
| series | Event Type | nameOfTheSeriesDropDown | nameOfTheEventtypeDropDown | Submit Message |
| Biohaven Speaker Programs 2021|Out-Of-Office|ProgramType|EventType|Submit Success!|

@Project_Admin_Sanity @helix_Regression
Scenario Outline: Project Admin flow
When you select "<series>" from Choose Project Series dropdown "<nameOfTheSeriesDropDown>"
And you select "<Event Type>" from Choose Event Type dropdown "<nameOfTheEventtypeDropDown>"
And click on view or edit button
And do not enter any value into SOW fee text field and validate the tool tip message as "<tooltipmessage>"
Examples:
| series | Event Type | nameOfTheSeriesDropDown | nameOfTheEventtypeDropDown | Submit Message |tooltipmessage|
| Biohaven Speaker Programs 2021|Out-Of-Office|ProgramType|EventType|Submit Success!|Please fill out this field.|

@Project_Admin_Sanity @helix_Regression
Scenario Outline: Project Admin flow
When you select "<series>" from Choose Project Series dropdown "<nameOfTheSeriesDropDown>"
And you select "<Event Type>" from Choose Event Type dropdown "<nameOfTheEventtypeDropDown>"
And click on view or edit button
And go to Budget section and fill details for first field 5 and 100

Examples:
| series | Event Type | nameOfTheSeriesDropDown | nameOfTheEventtypeDropDown | Submit Message |
| Biohaven Speaker Programs 2020|Out-Of-Office|ProgramType|EventType|Submit Success!|

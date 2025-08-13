Feature: CreateLead functionality of Leaftaps application

Scenario Outline: CreateLead with multiple data
Given Launch the browser
And Load the url
And Enter the username as 'Democsr'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in
When Click on the CRMSFA link
And Clcik on the Leads Link
And Click on the CreateLead link
Given Enter the companyname as <company>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
When Click on the CreateLead button
Then Lead should be created

Examples:
|company|firstName|lastName|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Saranya|S|
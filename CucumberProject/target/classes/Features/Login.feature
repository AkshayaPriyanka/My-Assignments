Feature: Login functionality of leaftaps application

Scenario: Login function with valid credentials
Given Launch the browser
And Load the url
And Enter the username as 'Democsr'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in

Scenario: Login function with invalid credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on Login button
But It should throw error message


Feature: This feature is for validate login page creation

@login+
Scenario: Verify user login sucessfully with valid credentials
Given Launch "<URL>" for demo
When Click on loginlink 
Then Enter valid username and valid password
When Click on login button
Then Verify user login sucessfully profile page

@login-
Scenario: Verify user cannot login sucessfully with valid username and invalid password
Given Launch "<URL>" for demo
When Click on loginlink  
Then Enter valid username and invalid password
When Click on login button
Then Verify user cannot login sucessfully with valid username and invalid password
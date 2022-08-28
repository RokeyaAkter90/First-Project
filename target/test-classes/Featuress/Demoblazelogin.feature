@LoginCreation
Feature: This is to validate Login Page Creation Functionality

@LoginD
Scenario: Verify log in text is displayed in the Log In page
Given Launch "<URL>" for demo
When Click on login link
Then Verify log in text is displayed in the Log In page


@LoginP
Scenario: Verify user can login using valid credentials
Given Launch "<URL>" for demo
When Click on login link
When Enter username and password
When Click on login button in login page
Then Verify user can login using valid credentials


@LoginN1
Scenario: Verify user cannot login using valid username and invalid password
Given Launch "<URL>" for demo
When Click on login link
When Enter username and invalid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials


@LoginN2
Scenario: Verify user cannot login using emptycredentials
Given Launch "<URL>" for demo
When Click on login link
When Click on login button in login page
Then Verify user cannot login using invalid credentials


@LoginN3
Scenario: Verify user cannot login using invalid username and valid password
Given Launch "<URL>" for demo
When Click on login link
When Enter invalid username and valid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials


@LoginN4
Scenario: Verify user cannot login using invalid username and invalid password
Given Launch "<URL>" for demo
When Click on login link
When Enter invalid username and invalid password
When Click on login button in login page
Then Verify user cannot login using invalid credentials
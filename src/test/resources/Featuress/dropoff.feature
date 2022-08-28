Feature: This is to validate FedEx location Functionality

@FedexD
Scenario: Verify FedEx drop-off is displayed
Given Launch "<URL>" for FedEx
When Click on location
When Click on drop-off
Then Verify FedEx drop-off is displayed in the Log In page

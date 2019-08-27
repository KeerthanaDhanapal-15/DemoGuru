Feature: Validate the Demo Guru Telecom Site


Scenario:
Given User wants to enter the Url
When User wants to click Add Customer
Then User wants to click Done
Then User wants to enter firstname "Keerthana" in firstname Textbox
Then User wants to enter lastname  "Dhanapal" in lastname Textbox
Then User wants to enter emailId "Keerthana@gmail.com" in email Textbox
Then User wants to enter address "Chennai" in address Textbox
Then User wants to enter mobileno "9876543212" in mobileno Textbox
Then User wants to click Submit button

Scenario Outline:
Given User wants to enter the Url
When User wants to click Add Customer
Then User Wants to click Done 
Then User wants to enter firstname "<FirstName>" in firstname Textbox
Then User wants to enter lastname  "<LastName>" in lastname Textbox
Then User wants to enter emailId "<EmailId>" in email Textbox
Then User wants to enter address "<Address>" in address Textbox
Then User wants to enter mobileno "<MobileNo>" in mobileno Textbox
Then User wants to click Submit button

Examples:

|FirstName|LastName|EmailId|Address|MobileNo|
|Keerthana|Dhanapal|Keerthana@gmail.com|Chennai|9876543212|
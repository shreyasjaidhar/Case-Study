Feature: Hotel Booking Application Login



Scenario: Invalid login to check error message for username

Given Initialize the browser with chrome
And Navigate to hotel booking login page "file:///C:/Users/shreyas/Selenium%20Case%20Study/login.html"
And Verify login page heading as Hotel Booking Application 
When User login into application without providing username and password as "admin"
Then Please enter UserName error message should populate


Scenario: Invalid login to check error message for password
Given User is on hotel booking login page
When User login into application without providing password and username as "admin"
Then Please enter Password error message should populate


Scenario: Valid login
Given User is on hotel booking login page
When User login into application with username "admin" and password "admin"
Then Hotel booking page should populate and verify page heading


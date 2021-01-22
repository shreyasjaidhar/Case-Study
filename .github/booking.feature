
Feature: Hotel Booking Application Form



Scenario: Check error message by clicking Confirm Booking without providing First Name and enter First Name
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing First Name
Then Please fill the First Name alert message should populate
And Enter First Name as "Mohan"

Scenario: Check error message by clicking Confirm Booking without providing Last Name and enter Last Name
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Last Name
Then Please fill the Last Name alert message should populate
And Enter Last Name as "jaidhar"

Scenario: Check error message by clicking Confirm Booking with providing wrong email format and enter Email
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking with providing wrong email format as "mohan.gond"
Then Please fill the Email alert message should populate
And Enter Email as "shreyasjaidhar@gmail.com"

Scenario: Check error message by clicking Confirm Booking without providing Mobile no
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Mobile no
Then Please fill the Mobile No alert message should populate

Scenario: Check error message by clicking Confirm Booking with providing Mobile no doesn’t start with either 7,8 or 9 and doesn’t have 10 digits and enter Mobile No
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking with providing Mobile no doesn’t start with either 7,8 or 9 and doesn’t have 10 digits
Then Please enter valid Contact no alert message should populate
And Enter Mobile No. as "9448528161"

Scenario: Enter and validate Address details
Given User is on Hotel Booking Form page
When User enter address details as "Brigade Bhuwalka Icon Bangalore Karnataka"
Then validate Address details

Scenario: Check error message by clicking Confirm Booking without selecting City and Select City
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without selecting City
Then Please select city alert message should populate
And Select City using static dropdown

Scenario: Check error message by clicking Confirm Booking without selecting State and Select State
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without selecting Sate
Then Please select State alert message should populate
And Select State using static dropdown

Scenario: Select Number of people staying at the Hotel
Given User is on Hotel Booking Form page
When User select Number of guest staying using static dropdown
Then Number of guest staying successfully selected

Scenario: Check error message by clicking Confirm Booking without providing Card Holder Name and enter Card Holder Name
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Card Holder Name
Then Please fill the Card holder name alert message should populate
And Enter Card Holder Name as "Abcde"

Scenario: Check error message by clicking Confirm Booking without providing Debit Card Number and enter Debit Card Number
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Debit Card Number
Then Please fill the Debit card Number alert message should populate
And Enter Debit Card Number as "1234567"

Scenario: Check error message by clicking Confirm Booking without providing CVV and enter CVV
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing CVV
Then Please fill the CVV alert message should populate
And Enter CVV as "123"

Scenario: Check error message by clicking Confirm Booking without providing Expiration month and enter Expiration month
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Expiration month
Then Please fill expiration month alert message should populate
And Enter Expiration month as "25/01/2021"

Scenario: Check error message by clicking Confirm Booking without providing Expiration Year and enter Expiration Year
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking without providing Expiration Year
Then Please fill expiration year alert message should populate
And Enter Expiration Year as "2022"

Scenario: Clicking Confirm Booking and navigates to success page
Given User is on Hotel Booking Form page
When User clicking on Confirm Booking
Then User navigates to success page and capture success message
And Close the window

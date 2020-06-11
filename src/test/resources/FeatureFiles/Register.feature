Feature: Registartion functionality scenarios.

@Register @One
Scenario: Verify whether the user is able to register successfully into the application by providing all the details.
 	Given I launch the application
 	And I navigate to the Register page
 	When I provide the below valid details
 		| First Name |Rajendra				  |
 		| Last Name	 |Kumar					  |
 		| email		 |rajendra_brk@yahoo.co.in|
 		| Telephone  |9638527410			  |
 		| Password	 |rajendra_brk			  |
 	And I click on the Privacy Policy
    And I click on Continue button
 	Then I should see the account has been added successfully
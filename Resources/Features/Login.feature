Feature: User should be able to login successfully 

Scenario Outline: User should be able to login successfully 

	Given I am on the Application 
	When I click home link 
	When I enter Email<email> Password<password> 
	Then I should be Logged in<verifyLoginText> 
	When I Logout 
	
	Examples: 
		|email					|password	|verifyLoginText|
		|testuser@mailinator.com|Welcome!@#	|Dashboard		|
Feature: Contigo user should be able to login successfully 

Scenario Outline: Contigo user should be able to login successfully 

	Given I am on the Application 
	When I click MyAccount Icon 
	When I enter Email<email> Password<password> 
	Then I should be Logged in<verifyLoginText> 
	When I Logout
	
	Examples: 
		|email					 |password	    |verifyLoginText  |
		|test.contigoqa@gmail.com|Welcome!@#	|Account Dashboard|
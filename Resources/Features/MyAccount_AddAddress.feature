Feature: Contigo user should be able to add adreess 

Scenario Outline: Contigo user should be able to add adreess 

	Given I am on the Application 
	When I click MyAccount Icon 
	When I enter Email<email> Password<password> 
	When I click View Address Book link
	When I click Add new address
	When I enter Firstname<firstname> Lastname<lastname> Company<company> Telephone<telephone> Fax<fax> Address<address1> Address2<address2> City<city> State<state> Zip<zip> Country<country> 
	Then I see The address has been saved<verifyAddedAddress> message
	
	Examples: 
		|email					 |password	    |firstname	|lastname|company            |telephone |fax       |address1   |address2|city    |state   |zip  |country      |verifyAddedAddress         |
		|test.contigoqa@gmail.com|Welcome!@#	|Test		|User	 |www.testcompany.com|9073246216|9073246216|111 Wall St|Bldg 11 |New York|New York|10001|United States|The address has been saved.|
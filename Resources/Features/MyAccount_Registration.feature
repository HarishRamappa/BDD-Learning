Feature: Contigo user should be able to register successfully

  Scenario Outline: Contigo user should be able to register successfully

   Given I am on the Application
   When I click MyAccount Icon
   When I click Create an Account link
   When I enter FirstName<firstname> LastName<lastname> Email<email> Password<password> Confirm Password<cnfpassword>
   #Then I should see error message<verifyRegistration>
    
    Examples:
	|firstname|lastname|email                  |password  |cnfpassword|verifyRegistration     	|
	| Test    |User    |testuser@mailinator.com|Welcome!@#|Welcome!@# |This is a required field.|
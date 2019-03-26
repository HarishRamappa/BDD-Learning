Feature: User should be able to register successfully

  Scenario Outline: User should be able to register successfully

   Given I am on the Application
   When I click home link
   When I click Register link
   When I enter Name<name> Company<company> Email<email> Password<password> Confirm Password<cnfpassword> 
   Then I should see Login page<verifyRegistration>
    
    Examples:
	|name|company|email|password|cnfpassword|verifyRegistration|
	| Test User|www.testcompany.com|testuser@mailinator.com|Welcome!@#|Welcome!@#|Login|
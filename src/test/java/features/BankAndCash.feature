@Smoke 
Feature: Validate Techfios Login and New Account functionality scenario Outline 


Background:
Given User is on the Techfios login page 

@Scenario5 
Scenario: User should be able to login with valid credentials 
	
	When User enters username as "demo@techfios.com"      
	When User enters password as "abc123"  
	And  User clicks on Signin button 
	Then  User should land on Dashboard page 
	When  User clicks on Cash&Bank button 
	And  User clicks on New Account button 
	Then  User should land on New Account Contact page 
	When User enter Valid Account Title as "BUSSINESS CHECKING"       
	When User enter Account Description as "This is a BUSSINESS CHECKING" 
	When User enter Initial Balance as "100000"
	When User enter Account Number as "BCHK456000" 
	When User enter Contact Person Name as "Mamun" 
	When User enter Contact person Phone Number as "123456987" 
	When User enetr Internet Banking URL as "www.xyzbank.com"  
	And User clicks On Submit button 
	Then User Should land on Account Page 
	
		
	
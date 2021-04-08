@Regretion
Feature: Validate Techfios Login functionality 

Background: 
	Given User is on the Techfios login page        
	
	
@Scenario1 
Scenario: User should be able to login with valid credentials 
	When User enters username as "demo@techfios.com"      
	When User enters password as "abc123" 
	And User clicks on Signin button                                           
	Then User should land on Dashboard page 
	
	
@Scenario2 
Scenario: User should be able to login with valid credentials 
	When User enters username as "demo2@techfios.com" 
	When User enters password as "abc123" 
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	
	
@Scenario3 
Scenario: User should be able to login with valid credentials 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc1234" 
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	
	
	
	
@Scenario4
Scenario: User should be able to login with valid credentials 
	When User enters username as "demo5@techfios.com" 
	When User enters password as "abc2" 
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	 
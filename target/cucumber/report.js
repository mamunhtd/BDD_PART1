$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BankAndCash.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios Login and New Account functionality scenario Outline",
  "description": "",
  "id": "validate-techfios-login-and-new-account-functionality-scenario-outline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 3013357500,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 2995393500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-and-new-account-functionality-scenario-outline;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Scenario5"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Cash\u0026Bank button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User clicks on New Account button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should land on New Account Contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User enter Valid Account Title as \"BUSSINESS CHECKING\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter Account Description as \"This is a BUSSINESS CHECKING\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enter Initial Balance as \"100000\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enter Account Number as \"BCHK456000\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enter Contact Person Name as \"Mamun\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enter Contact person Phone Number as \"123456987\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User enetr Internet Banking URL as \"www.xyzbank.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User clicks On Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Should land on Account Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.user_enters_username_as(String)"
});
formatter.result({
  "duration": 180023300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinitions.user_enters_password_as(String)"
});
formatter.result({
  "duration": 102605400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 8111668600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 107012300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_Cash_Bank_button()"
});
formatter.result({
  "duration": 5185370200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_New_Account_button()"
});
formatter.result({
  "duration": 1993337800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_land_on_New_Account_Contact_page()"
});
formatter.result({
  "duration": 8366200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BUSSINESS CHECKING",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Valid_Account_Title_as(String)"
});
formatter.result({
  "duration": 174558500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is a BUSSINESS CHECKING",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Account_Description_as(String)"
});
formatter.result({
  "duration": 149662500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 31
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Initial_Balance_as(String)"
});
formatter.result({
  "duration": 244486900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BCHK456000",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Account_Number_as(String)"
});
formatter.result({
  "duration": 222735400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mamun",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Contact_Person_Name_as(String)"
});
formatter.result({
  "duration": 194998800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456987",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinitions.user_enter_Contact_person_Phone_Number_as(String)"
});
formatter.result({
  "duration": 160883900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.xyzbank.com",
      "offset": 36
    }
  ],
  "location": "LoginStepDefinitions.user_enetr_Internet_Banking_URL_as(String)"
});
formatter.result({
  "duration": 98831900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_On_Submit_button()"
});
formatter.result({
  "duration": 3267896200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Should_land_on_Account_Page()"
});
formatter.result({
  "duration": 15491400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Accounts]- iBilling\u003e but was:\u003c[Contacts ]- iBilling\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat steps.LoginStepDefinitions.user_Should_land_on_Account_Page(LoginStepDefinitions.java:177)\r\n\tat ✽.Then User Should land on Account Page(features/BankAndCash.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 884778300,
  "status": "passed"
});
});
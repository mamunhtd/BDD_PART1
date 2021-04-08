package steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankAndCash_Page;
import page.Dashboard_Page;
import page.Login_Page;
import util.BrowserFactory;

public class LoginStepDefinitions {
	
	WebDriver driver;
	Login_Page login_Page;
	Dashboard_Page dashboard_Page;
	BankAndCash_Page bankAndCash_Page;
	
	@Before
	public void beforeRun() {
		
		driver = BrowserFactory.init();
		login_Page = PageFactory.initElements(driver, Login_Page.class);
		dashboard_Page = PageFactory.initElements(driver, Dashboard_Page.class);
		bankAndCash_Page = PageFactory.initElements(driver, BankAndCash_Page.class);
	}
	
//Login Page
@Given("^User is on the Techfios login page$")
public void user_is_on_the_Techfios_login_page() throws Exception  {
	
	
	driver.get("https://www.techfios.com/billing/?ng=admin/");
	
	Thread.sleep(1000);
  
}


//@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password)  {
    
	login_Page.enterCredentials(username, password);
}



@When("^User enters username as \"([^\"]*)\"$")
public void user_enters_username_as(String username)  {
   
	login_Page.insertUserName(username);
}


@When("^User enters password as \"([^\"]*)\"$")
public void user_enters_password_as(String password)  {
   
	login_Page.insertPassword(password);
}




@And("^User clicks on Signin button$")
public void user_clicks_on_Signin_button() throws IOException, InterruptedException  {
	Thread.sleep(5000);
	login_Page.clickSigninButton();
	login_Page.takeScreenshotAtEndOfTest(driver);
}

@Then("^User should land on Dashboard page$")
public void user_should_land_on_Dashboard_page()  {
	
	String expectedTitle = "Dashboard- iBilling"; 
	String actualTitle = login_Page.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	
}


//Dashboard page
@When("^User clicks on Cash&Bank button$")
public void user_clicks_on_Cash_Bank_button() throws Exception {
	Thread.sleep(5000);
	dashboard_Page.clickCashnBankButton();

}

@And("^User clicks on New Account button$")
public void user_clicks_on_New_Account_button() throws IOException {
	dashboard_Page.clickNewAccountButton();
	login_Page.takeScreenshotAtEndOfTest(driver);

}

@Then("^User should land on New Account Contact page$")
public void user_should_land_on_New_Account_Contact_page() {
	
	String expectedTitle = "Accounts- iBilling"; 
	String actualTitle = dashboard_Page.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	

}


//New Account Page


@When("^User enter Valid Account Title as \"([^\"]*)\"$")
public void user_enter_Valid_Account_Title_as(String accountTitle)  {
    
	bankAndCash_Page.insertAccountTitle(accountTitle);
}

@When("^User enter Account Description as \"([^\"]*)\"$")
public void user_enter_Account_Description_as(String description)  {
    
	bankAndCash_Page.insertDescription(description);
}

@When("^User enter Initial Balance as \"([^\"]*)\"$")
public void user_enter_Initial_Balance_as(String initBalance)  {
   
	bankAndCash_Page.insertInitialBalance(initBalance);
}

@When("^User enter Account Number as \"([^\"]*)\"$")
public void user_enter_Account_Number_as(String accountNumber)  {
    
	bankAndCash_Page.insertAccountNumber(accountNumber);
}

@When("^User enter Contact Person Name as \"([^\"]*)\"$")
public void user_enter_Contact_Person_Name_as(String contactPersonName)  {
 
	bankAndCash_Page.insertContactPerson(contactPersonName);
}

@When("^User enter Contact person Phone Number as \"([^\"]*)\"$")
public void user_enter_Contact_person_Phone_Number_as(String phoneNumber)  {
   
	bankAndCash_Page.insertContactPhoneNumber(phoneNumber);
}

@When("^User enetr Internet Banking URL as \"([^\"]*)\"$")
public void user_enetr_Internet_Banking_URL_as(String bankingURL)  {
  
	bankAndCash_Page.insertBankingURL(bankingURL);
}



@When("^User clicks On Submit button$")
public void user_clicks_On_Submit_button() throws IOException  {
	
	bankAndCash_Page.clickSubmitButton();
	login_Page.takeScreenshotAtEndOfTest(driver);
}


@Then("^User Should land on Account Page$")
public void user_Should_land_on_Account_Page() throws Throwable {
	
	String expectedTitle = "Accounts- iBilling"; 
	String actualTitle = bankAndCash_Page.getPageTitle();
	
	
	Assert.assertEquals(expectedTitle, actualTitle);
	
   
}




@After
public void tearDown() {
	driver.close();
	driver.quit();
}


	

}

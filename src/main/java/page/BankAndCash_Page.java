package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCash_Page {
	
	WebDriver driver;

	public BankAndCash_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	// New Account Page Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement ACCOUNT_TITLE_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']") WebElement DESCRIPTION_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']") WebElement INITIAL_BALANCE_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']") WebElement ACCOUNT_NUMBER_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']") WebElement CONTACT_PERSON_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']") WebElement CONTACT_PHONE_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']") WebElement IB_URL_FIELD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-search']") WebElement SUBMIT_BUTTON_ELEMENT;
	
	

	// Intractive Methods for New Account Page
	
	public void insertAccountTitle(String accountTitle) {
		
		ACCOUNT_TITLE_FIELD_ELEMENT.sendKeys(accountTitle);
		
	}
	
	public void insertDescription(String description) {
		
		DESCRIPTION_FIELD_ELEMENT.sendKeys(description);
	}
	
	
	public void insertInitialBalance(String initBalance) {
		
		INITIAL_BALANCE_FIELD_ELEMENT.sendKeys(initBalance);
	}
	
	
	public void insertAccountNumber(String accountNumber) {
		
		ACCOUNT_NUMBER_FIELD_ELEMENT.sendKeys(accountNumber);
	}
	
	
	public void insertContactPerson(String contactPersonName) {
		
		CONTACT_PERSON_FIELD_ELEMENT.sendKeys(contactPersonName);
		
	}
	
	
	public void insertContactPhoneNumber(String phoneNumber) {
		
		CONTACT_PHONE_FIELD_ELEMENT.sendKeys(phoneNumber);
		
	}
	
	
	public void insertBankingURL(String bankingURL) {
		
		IB_URL_FIELD_ELEMENT.sendKeys(bankingURL);
	}
	
	
	public void clickSubmitButton() {
		
		SUBMIT_BUTTON_ELEMENT.click();
		
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();

	}
	

}

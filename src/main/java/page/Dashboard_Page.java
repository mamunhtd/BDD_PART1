package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard_Page {
	
	WebDriver driver;

	public Dashboard_Page(WebDriver driver) {
		this.driver = driver;
	}



	// Dashboard page Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement CASH_BANK_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEW_ACCOUNT_BUTTON_ELEMENT;
	
	
	
	// Intractive Methods for Dashboard page

	public void clickCashnBankButton() {
		CASH_BANK_BUTTON_ELEMENT.click();
	}

	public void clickNewAccountButton() {
		NEW_ACCOUNT_BUTTON_ELEMENT.click();
	}
	
	
	public String getPageTitle() {
		return driver.getTitle();

	}

}

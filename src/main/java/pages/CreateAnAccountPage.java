package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAnAccountPage extends BasePage {

	WebDriver driver;
	
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']") WebElement mrRadioButton;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']") WebElement firstnameField;
	@FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']") WebElement lastnameField;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") WebElement passwordField;
	@FindBy(how = How.XPATH, using = "//select[@id='days']") WebElement daySelection;
	@FindBy(how = How.XPATH, using = "//select[@id='months']") WebElement monthSelection;
	@FindBy(how = How.XPATH, using = "//select[@id='years']") WebElement yearSelection;
	@FindBy(how = How.XPATH, using = "//input[@id='newsletter']") WebElement newsletterCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='optin']") WebElement specialOfferCheckBox;
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']") WebElement addressFirstnameField;
	@FindBy(how = How.XPATH, using = "//input[@id='lastname']") WebElement addressLastnameField;
	@FindBy(how = How.XPATH, using = "//input[@id='company']") WebElement addressCompanyField;
	@FindBy(how = How.XPATH, using = "//input[@id='address1']") WebElement address1Field;
	@FindBy(how = How.XPATH, using = "//input[@id='address2']") WebElement address2Field;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement cityField;
	@FindBy(how = How.XPATH, using = "//select[@id='id_state']") WebElement stateField;
	@FindBy(how = How.XPATH, using = "//input[@id='postcode']") WebElement zipCodeField;
	@FindBy(how = How.XPATH, using = "//select[@id='id_country']") WebElement countryField;
	@FindBy(how = How.XPATH, using = "//input[@id='phone_mobile']") WebElement cellPhoneField;
	@FindBy(how = How.XPATH, using = "//input[@id='alias']") WebElement aliasAddressField;
	@FindBy(how = How.XPATH, using = "//button[@id='submitAccount']") WebElement registerButton;
	@FindBy(how = How.XPATH, using = "//div[@id=\"center_column\"]/div/p") WebElement errorAlertForMandatoryFields;
	
	public void clickMrRadioButton() {
		mrRadioButton.click();
	}
	
	public void fillFirstnameField(String firstname) {
		firstnameField.sendKeys(firstname);
	}
	
	public void fillLastnameField(String lastname) {
		lastnameField.sendKeys(lastname);
	}
	
	public void fillPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void selectDaySelection(String day) {
		
		selectFromDropdownByValue(daySelection, removeDecimalPoint(day));
	}
	
	public void selectMonthSelection(String month) {
		selectFromDropdownByValue(monthSelection, month);
	}
	
	public void selectYearSelection(String year) {
		selectFromDropdownByValue(yearSelection, removeDecimalPoint(year));
	}
	
	public void clickNewsletterCheckBox() {
		newsletterCheckBox.click();
	}
	
	public void clickSpecialOfferCheckBox() {
		specialOfferCheckBox.click();
	}
	
	public void fillAddressFirstnameField(String aFirstname) {
		addressFirstnameField.sendKeys(aFirstname);
	}
	
	public void fillAddressLastnameField(String aLastname) {
		addressLastnameField.sendKeys(aLastname);
	}
	
	public void fillAddressCompanyField(String company) {
		addressCompanyField.sendKeys(company);
	}

	public void fillAddress1Field(String address) {
		address1Field.sendKeys(address);
	}

	public void fillCityField(String city) {
		cityField.sendKeys(city);
	}

	public void selectStateField(String state) {
		selectFromDropdownByVisibleText(stateField, state);
	}

	public void fillZipCodeField(String zipCode) {
		zipCodeField.sendKeys(removeDecimalPoint(zipCode));
	}

	public void selectCountryField(String country) {
		selectFromDropdownByVisibleText(countryField, country);
	}

	public void fillCellPhoneField() {
		cellPhoneField.sendKeys(phoneNumberGenerator());
	}
	
	public void fillAliasAddressField(String alias) {
		aliasAddressField.clear();
		aliasAddressField.sendKeys(alias);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}

	public void verifyErrorAlertForMandatoryFields() {
		
		if(errorAlertForMandatoryFields.isDisplayed()) {
			System.out.println("Success! Error Alert For Mandatory Fields is displayed");
		}else {
			System.out.println("Failure, Error Alert For Mandatory Fields is not displayed");
		}
	}
}

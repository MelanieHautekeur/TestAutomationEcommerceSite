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
	@FindBy(how = How.XPATH, using = "//div[@id=\"center_column\"]/div/p") WebElement ErrorAlertForMandatoryFields;
	
	public void clickMrRadioButton() {
		mrRadioButton.click();
	}
	
	public void fillFirstnameField(String FirstName) {
		firstnameField.sendKeys(FirstName);
	}
	
	public void fillLastnameField(String LastName) {
		lastnameField.sendKeys(LastName);
	}
	
	public void fillPasswordField(String Password) {
		passwordField.sendKeys(Password);
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
	
	public void fillAddressFirstnameField(String aFirstName) {
		addressFirstnameField.sendKeys(aFirstName);
	}
	
	public void fillAddressLastnameField(String aLastName) {
		addressLastnameField.sendKeys(aLastName);
	}
	
	public void fillAddressCompanyField(String Company) {
		addressCompanyField.sendKeys(Company);
	}

	public void fillAddress1Field(String Address) {
		address1Field.sendKeys(Address);
	}

	public void fillCityField(String City) {
		cityField.sendKeys(City);
	}

	public void selectStateField(String State) {
		selectFromDropdownByVisibleText(stateField, State);
	}

	public void fillZipCodeField(String ZipCode) {
		zipCodeField.sendKeys(removeDecimalPoint(ZipCode));
	}

	public void selectCountryField(String Country) {
		selectFromDropdownByVisibleText(countryField, Country);
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
		
		if(ErrorAlertForMandatoryFields.isDisplayed() == true) {
			System.out.println("Success! Error Alert For Mandatory Fields is displayed");
		}else {
			System.out.println("Failure, Error Alert For Mandatory Fields is not displayed");
		}
	}
}

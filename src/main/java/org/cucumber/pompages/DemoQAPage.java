package org.cucumber.pompages;

import org.cucumber.driver.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQAPage {

	private static By fullname = By.xpath("//input[@id='userName']");
	private static By emailaddres = By.xpath("//input[@id='userEmail']");
	private static By currentadd = By.xpath("//textarea[@id='currentAddress']");
	private static By permanentadd = By.xpath("//textarea[@id='permanentAddress']");
	private static By submitbuttn = By.xpath("//*[@id='submit']");
	private static By submittedname = By.xpath("//p[@id='name']");
	private static By fullnamelabel = By.xpath("//label[@id='userName-label']");

	public  void enterFullName(String personname) {
		WebElement name = DriverSetup.getDriver().findElement(fullname);
		name.sendKeys(personname);
	}
	
	public  void enterEmail(String emailid) {
		WebElement email = DriverSetup.getDriver().findElement(emailaddres);
		email.sendKeys(emailid);
	}
	
	public  void enterCurrentAddress(String currentaddress) {
		WebElement current = DriverSetup.getDriver().findElement(currentadd);
		current.sendKeys(currentaddress);
	}
	
	public  void enterPermanentAddress(String permanentaddress) {
		WebElement permanent = DriverSetup.getDriver().findElement(permanentadd);
		permanent.sendKeys(permanentaddress);
	}
	
	public  void clickSubmit() {
		DriverSetup.getDriver().findElement(fullnamelabel).click();;
		WebElement submit = DriverSetup.getDriver().findElement(submitbuttn);
		submit.click();
	}
	
	public  boolean isFormSubmitted() {
		WebElement submittedField = DriverSetup.getDriver().findElement(submittedname);
		boolean value =submittedField.isDisplayed();
		return value;
	}


}

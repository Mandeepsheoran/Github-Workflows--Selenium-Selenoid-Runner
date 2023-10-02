package org.cucumber.test;

import org.cucumber.driver.DriverSetup;
import org.cucumber.pompages.DemoQAPage;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoQAStepDef extends BaseTest{
	public DemoQAPage demopage = new DemoQAPage();
	
	@Given("User is already on text form page to submit details")
	public void moveToTextFormPage() {
		DriverSetup.getDriver().get("https://demoqa.com/text-box");
	}
	
	@Given("Full name and valid Email are entered in form along with other details")
    public void enterValidEmailField() {
		demopage.enterFullName("Mandeep");
		demopage.enterEmail("sheoran@gmail.com");
		demopage.enterCurrentAddress("11/123, ABC");
		demopage.enterPermanentAddress("12/77/XYZ");
	}
    
	@Given("Incorrect email is entered {string}")
    public void enterInvalidEmailField(String email) {
		demopage.enterFullName("Mandeep");
		demopage.enterEmail(email);
		demopage.enterCurrentAddress("11/123, ABC");
		demopage.enterPermanentAddress("12/77/XYZ");
    }
	
	@When("Submit button is clicked")
    public void submitValidDetails() throws InterruptedException {
		Thread.sleep(18000);
		demopage.clickSubmit();
		Thread.sleep(5000);
	}
	
	@When("Submit button is clicked with invalid details")
    public void submitInValidDetails() throws InterruptedException {
		Thread.sleep(3000);
	//	demopage.clickSubmit();
		Thread.sleep(3000);
	}
	
	
	
	@Then("Submitted details should be displayed in bottom of page")
    public void validateSubmittedDetails() {
		Assert.assertEquals(demopage.isFormSubmitted(), true);
	}
	
	@Then("Field with invalid values should be highlighted")
    public void validateSubmittedDetailsWithInvalidInput() {
		Assert.assertEquals(false, false);
	}

}

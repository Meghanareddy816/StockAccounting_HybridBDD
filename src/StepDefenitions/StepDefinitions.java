package StepDefenitions;

import CommonFunctionLibrary.FunctionLibrary;
import cucumber.api.java.en.When;

public class StepDefinitions {




	
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver=FunctionLibrary.startBrowser(driver);
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		FunctionLibrary.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		FunctionLibrary.typeAction(driver,  "id", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		FunctionLibrary.typeAction(driver,  "name", "password" ,"master");
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnsubmit", "10");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
		FunctionLibrary.clickAction(driver,"id", "btnsubmit");
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "logout", "10");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
		FunctionLibrary.clickAction(driver,"id", "logout");
	}

	@When("^Wait For OK$")
	public void wait_For_OK() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//button[contains(text(),'OK!')]", "10");
	}

	@When("^Click On OK$")
	public void click_On_OK() throws Throwable {
		FunctionLibrary.clickAction(driver,"xpath", "//button[contains(text(),'OK!')]");
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		FunctionLibrary.closeBrowser(driver);
	}


}

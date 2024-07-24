package advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class toLearndepewndsonmethods {
	@Test
	public void createaccount() {
		Reporter.log("Account created succesfully.", true);
	}

	@Test(dependsOnMethods = "createaccount")
	public void editacount() {
		Reporter.log("Account edited succesfully.", true);
	}

	/*
	 * @Test(dependsOnMethods = "editacount") public void deletaccount() {
	 * Reporter.log("Acount deleted succesfully.", true); }
	 */
	@Test(dependsOnMethods = { "editacount", "createaccount" })
	public void deletaccount() {
		Reporter.log("Acount deleted succesfully.", true);
	}
}
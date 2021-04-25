package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;

public class CreateLeadTestCase extends LoginPage {
	@Test
	public void runTestCases() {
		
		new LoginPage().EnterUserName().EnterPassword().clickLogin().clickCrmSfaLink().clickLead().clickCreateLead();
	}
	
	

}
	
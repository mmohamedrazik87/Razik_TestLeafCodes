package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage EnterUserName()  {
		driver.findElementById("username").sendKeys("demosalesmanager");
		return this;

	}
	

	public LoginPage EnterPassword()  {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
}
	
	public HomePage clickLogin()  {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
}
}
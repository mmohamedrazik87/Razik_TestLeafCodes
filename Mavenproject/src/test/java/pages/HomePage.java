package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage clickCrmSfaLink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
	

}

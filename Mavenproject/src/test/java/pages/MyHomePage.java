package pages;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeads clickLead () {
		driver.findElementByLinkText("Leads").click();
		
		return new MyLeads();

	}

}

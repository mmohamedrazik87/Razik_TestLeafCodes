package pages;

import base.ProjectSpecificMethods;
import testNG.CreateLead;

public class MyLeads extends ProjectSpecificMethods {
	
	public CreateLead clickCreateLead() {
	
	driver.findElementByLinkText("Create Lead").click();
	return new CreateLead();


}
}

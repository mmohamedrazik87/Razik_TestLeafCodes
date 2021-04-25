package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "fetchData", invocationCount = 3)

	public void runCreateLead(String companyName, String firstName, String lastName) {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElementByName("submitButton").click();

	}

	@DataProvider(name = "fetchData")
	private String[][] dataprovider() {
		// TODO Auto-generated method stub

		String[][] testData = new String[3][3];

		testData[0][0] = "CTS";
		testData[0][1] = "Razik";
		testData[0][2] = "M";

		testData[1][0] = "Zi";
		testData[1][1] = "Ya";
		testData[1][2] = "Nafi";

		testData[1][0] = "TCS";
		testData[1][1] = "Feesa";
		testData[1][2] = "FiNa";
		return testData;
	}
}

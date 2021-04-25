package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http:leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("VIP");
		driver.findElementById("createLeadForm_firstName").sendKeys("Razik");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDownSource = new Select(source);
		dropDownSource.selectByVisibleText("Partner");
		driver.findElementByName("submitButton").click();
		String createLeadTitle = driver.getTitle();
		System.out.println(createLeadTitle);

		
		}	

}

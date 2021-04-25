package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Lead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gopi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		System.out.println("View Lead page title is " + driver.getTitle());
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=10054']")).click();
		String beforeChanging = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String attribute = driver.findElement(By.id("viewLead_companyName_sp")).getAttribute("Value");
		System.out.println(beforeChanging +" Changed to " + attribute);		
		driver.close();
		
		

	}

}

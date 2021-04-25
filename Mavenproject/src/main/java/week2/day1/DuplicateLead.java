package week2.day1;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String name2Dup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
//		System.out.println(title);
		String title1="Duplicate Lead";
		if(title.contains(title1))
		{
			System.out.println("The Title is as Duplicate Lead");
		}
		else {
			System.out.println("The Title is NOT  Duplicate Lead");
		}
		driver.findElement(By.className("smallSubmit")).click();
		String nameDup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Name Captured is " +name2Dup +  " & The Name Captured after duplicated is " +nameDup);
		
		driver.close();

	}

}

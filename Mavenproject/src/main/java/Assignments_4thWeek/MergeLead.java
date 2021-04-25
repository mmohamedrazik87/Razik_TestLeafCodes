package Assignments_4thWeek;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

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
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> handles= new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1])[1]")).click();
		Thread.sleep(5000);	
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(3000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		Thread.sleep(3000);
		List<String> handles2= new ArrayList<String>(windowHandles2);
		Thread.sleep(5000);
		driver.switchTo().window(handles2.get(1));	
		WebElement findElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1])[2]"));	
		findElement.click();	
		driver.switchTo().window(handles2.get(0));		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		driver.quit();
		
		
		
		

		

	}

}

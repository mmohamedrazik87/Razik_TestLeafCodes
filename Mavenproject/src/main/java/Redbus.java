import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.cucumber.core.backend.Options;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Koyambedu, Chennai"); // Enter From
		Thread.sleep(2000);
		WebElement toCity = driver.findElement(By.id("dest"));
		toCity.sendKeys("Madurai (All Locations)");
		Thread.sleep(3000);
		toCity.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[3]/td[@class='current day']/following::td")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search_btn")).click();
				
		
			

	}

}

package week2.day1;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Login_1C {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.name("loginfmt")))).sendKeys("mmohamedrazik87@gmail.com");
		//driver.findElement(By.name("loginfmt")).sendKeys("mmohamedrazik87@gmail.com");
//		driver.findElement(By.id("idSIButton9")).click();
		//driver.close();
//		// oneC.findElementByXPath("//input[@type='email']").click();
//		oneC.findElementByXPath("//input[@type='submit']").click();
//		oneC.findElementByXPath("//*div[@class='form-group']").click();

	}

}

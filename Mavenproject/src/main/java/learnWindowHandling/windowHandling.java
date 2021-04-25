package learnWindowHandling;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.linkText(" FLIGHTS  ")).click();
		Set<String> allwindowHandles = driver.getWindowHandles();
		for (String list : allwindowHandles) {
		System.out.println(list);	
			
		}
		
		
	}

}

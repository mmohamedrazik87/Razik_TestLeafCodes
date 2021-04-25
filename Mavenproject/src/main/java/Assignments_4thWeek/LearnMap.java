package Assignments_4thWeek;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		List<WebElement> ele1 = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody[1]/tr[1]/td[1]"));
		List<WebElement> ele2 = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody[1]/tr[1]/td[2]"));
		
}}
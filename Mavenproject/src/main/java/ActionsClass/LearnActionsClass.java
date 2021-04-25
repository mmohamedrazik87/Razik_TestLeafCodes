package ActionsClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions action = new Actions(driver);
		WebElement fashion = driver.findElement(By.xpath("(//div[@id='container']//div[@class='_1psGvi SLyWEo'])[1]"));
		action.moveToElement(fashion).perform();	
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(3000);
		WebElement mensFootWear = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		//wait.until(ExpectedConditions.elementToBeSelected(mensFootWear));		
		action.moveToElement(mensFootWear).perform();
		driver.quit();
		

		

	}

}

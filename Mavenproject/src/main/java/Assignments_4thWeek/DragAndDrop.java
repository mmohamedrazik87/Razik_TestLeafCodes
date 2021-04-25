package Assignments_4thWeek;

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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement toFrame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(toFrame);
		Actions builder = new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[1]"));
		int item4x = driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[4]")).getLocation().getX();
		int item4y = driver.findElement(By.xpath("//ul[@class='ui-sortable']/li[4]")).getLocation().getY();
		builder.dragAndDropBy(item1, item4x, item4y).perform();

	}

}

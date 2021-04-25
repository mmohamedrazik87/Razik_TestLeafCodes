package learnWindowHandling;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Window.html");
		WebElement home =driver.findElement(By.id("home"));
		home.click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(allWindows);
		System.out.println(handles);
		driver.switchTo().window(handles.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@alt='Buttons']")).click();
		
		
	}

}

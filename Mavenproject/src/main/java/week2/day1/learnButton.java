package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/home.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@href='pages/Button.html']").click();
		String colorName = driver.findElementByXPath("//button[@style='background-color:lightgreen']").getCssValue("background-color");
		String asHex = Color.fromString(colorName).asHex();
		java.awt.Color decode = java.awt.Color.decode(asHex);
	System.out.println(decode);
	}

}

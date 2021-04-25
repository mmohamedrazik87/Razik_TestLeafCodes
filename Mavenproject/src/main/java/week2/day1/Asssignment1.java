package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//URL Launch
		driver.get("http://leafground.com/pages/Edit.html ");
		//Screen Maximize
		driver.manage().window().maximize();
		// enter email id
		driver.findElementById("email").sendKeys("razikmohamed@xyz.com");
		// clear the existing available and pass new value
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").clear();
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("Newly Added");
		//get the default value 
		String defaultTextValue = driver.findElementByName("username").getAttribute("value");
		System.out.print("Default Text available is " +defaultTextValue);
		//clear the text
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
		boolean clearedValue = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").getAttribute("value") != null;
		System.out.println("Is the value available is cleared?" + clearedValue);
		}	


	}



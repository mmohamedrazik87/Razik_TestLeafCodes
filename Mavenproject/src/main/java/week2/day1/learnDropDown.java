package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Dropdown.html");
		WebElement ddElement = driver.findElementById("dropdown1");
		Select dropDown1 = new Select(ddElement);
		dropDown1.selectByIndex(2);
		WebElement ddElement2 = driver.findElementByName("dropdown2");
		Select ddEle = new Select(ddElement2);
		ddEle.selectByVisibleText("Selenium");
		WebElement Elem3 = driver.findElementById("dropdown3");
		Select ddEle3 = new Select(Elem3);
		ddEle3.selectByValue("4");
		Select ele = new Select((driver.findElementByClassName("dropdown")));
		ele.deselectByVisibleText("UFT/QTP");
		List<WebElement> options = ele.getOptions();		
		System.out.println("Total count of Dropdowns available is " +options.size());
		driver.close();	

}

}

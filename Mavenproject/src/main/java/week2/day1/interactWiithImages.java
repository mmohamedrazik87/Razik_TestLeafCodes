package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interactWiithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//img[@src='../images/home.png']").click(); 
		String imageTitle = driver.getTitle();
		System.out.println(imageTitle);
		driver.findElementByXPath("//img[@src='images/edit.png']").click();
		driver.findElementById("email").sendKeys("VIP@gmail.com");
		WebElement Element1 = driver.findElementByXPath("//input[@value='Append ']");
		String intValue = Element1.getAttribute("value");
		Element1.clear();
		Element1.sendKeys(intValue + "Addtional Text");
		String defValueEle = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("Value");
		System.out.println("Default Value is -"+defValueEle);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		boolean isEnabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		if (isEnabled)
		System.out.println("The field is enabled");
		else
		System.out.println("The field is disabled");
			
}
}


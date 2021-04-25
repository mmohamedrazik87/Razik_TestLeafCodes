import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame_Alert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		Date CalenderDate= new Date();
		String Dt = CalenderDate.toString();
		String replace = Dt.replace(":", "");
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/"+replace+".png");
		FileUtils.copyFile(source, target);

	}

}

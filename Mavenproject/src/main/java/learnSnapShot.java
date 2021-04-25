import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.cucumber.messages.internal.com.google.protobuf.Timestamp;
import io.github.bonigarcia.wdm.WebDriverManager;

public class learnSnapShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to(" http://leafground.com/pages/Window.html");
		Date date = new Date();
		String string = date.toString();
		String replaceAll = string.replaceAll(":", "");
		System.out.println(replaceAll);		
		driver.manage().window().maximize();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/windows"+replaceAll+".png");
		FileUtils.copyFile(source, target);		

	}

}

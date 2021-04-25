import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS", Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU", Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td"));
		int size = findElements.size();
		System.out.println(size);	
		for (int i = 1; i < size; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"divTrainsList\"]/table[1]/tbody/tr["+i+"]/td[2]/a")).getText();
			System.out.println(text);
			
			//*[@id="divTrainsList"]/table[1]/tbody/tr[1]/td[2]/a
		
		}
		

	}

}

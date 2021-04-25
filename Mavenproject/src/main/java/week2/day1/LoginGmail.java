package week2.day1;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver ffdriver= new FirefoxDriver();
		ffdriver.get("www.gmail.com");
		ffdriver.manage().window().maximize();
		String urlTitle = ffdriver.getTitle();
		System.out.println(urlTitle);

	}

}

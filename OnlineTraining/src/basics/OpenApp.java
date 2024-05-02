package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/en/login");
		Thread.sleep(20000);
//		driver.get("https://www.cleartrip.com/");
//		Thread.sleep(20000);
//		driver.get("https://pharmeasy.in/");
//		Thread.sleep(20000);
//		driver.get("https://www.trivago.in/");
//		Thread.sleep(20000);
//		driver.get("https://www.easemytrip.com/");
		
	}

}

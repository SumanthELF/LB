package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllTheWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

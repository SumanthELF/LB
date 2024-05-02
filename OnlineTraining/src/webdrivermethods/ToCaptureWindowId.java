package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
		Thread.sleep(1000);
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String windowId : allWindowId) {
			System.out.println(windowId);
		}
		driver.quit();
	}

}

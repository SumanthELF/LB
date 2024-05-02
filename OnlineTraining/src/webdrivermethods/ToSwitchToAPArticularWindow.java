package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAPArticularWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
		Navigation d = driver.navigate();
		String expectedPageTitle = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String pageTitle = driver.getTitle();
			if(expectedPageTitle.equals(pageTitle)){
				driver.manage().window().maximize();
				break;
			}			
		}
	}

}

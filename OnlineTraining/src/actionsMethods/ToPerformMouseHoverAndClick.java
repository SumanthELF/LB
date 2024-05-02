package actionsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHoverAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.firelawn.com/");
		
		WebElement menNavBarElement = driver.findElement(By.linkText("MEN"));
		
		Actions actions = new Actions(driver);
		actions.contextClick();
		Thread.sleep(1000);
		actions.moveToElement(menNavBarElement).perform();
		actions.click(driver.findElement(By.linkText("SHORTS"))).perform();
		
		
		
	}
}
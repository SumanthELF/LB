package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToExploreFluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();    //OOAD  --->  //Cross browser testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
												.withTimeout(Duration.ofSeconds(1000))
												.pollingEvery(Duration.ofMillis(100));
		
		fluentwait.until(ExpectedConditions.elementToBeClickable(By.id("")));
	}

}

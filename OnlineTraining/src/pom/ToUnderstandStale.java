package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStale {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Naukri Logo']"));
		WebElement loginButton = driver.findElement(By.id("login_Layer"));
		WebElement registerButton = driver.findElement(By.id("register_Layer"));
		registerButton.click();
		Thread.sleep(2000);
		logo.click();
		loginButton.click();
	}
}

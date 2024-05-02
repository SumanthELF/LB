package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTextFromWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Sumanth");
		driver.findElement(By.name("pwd")).sendKeys("Testing@123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String errorMessage = driver.findElement(By.xpath("//span[@class='errormsg' and not(@id)]")).getText();
		System.out.println(errorMessage);
	}
}

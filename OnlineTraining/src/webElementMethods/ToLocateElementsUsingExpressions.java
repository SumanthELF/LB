package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingExpressions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink = driver.findElement(By.xpath("//a[@href='/register']"));
		registerLink.click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Python Selenium");
		driver.findElement(By.xpath("//input[contains(@data-val-required,'Email')]")).sendKeys("akshya@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Akshay@321");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}
}

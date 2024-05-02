package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContentInTextArea {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Sumanth");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();*/
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("A","B","C","D","DEREF",Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys(Keys.CONTROL+"v");
	}

}

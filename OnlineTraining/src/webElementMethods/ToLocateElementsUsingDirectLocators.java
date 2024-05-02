package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingDirectLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("Sumanth");
		Thread.sleep(1000);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("ABCD123");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.cssSelector("a[id='loginButton']"));
		loginButton.click();
		Thread.sleep(1000);
//		WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
//		forgotPasswordLink.click();
//		Thread.sleep(1000);
//		WebElement returnToLoginPageLink = driver.findElement(By.partialLinkText("Return"));
//		returnToLoginPageLink.click();
	}

}

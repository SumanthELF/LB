package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckElementIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement disabledTextBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(disabledTextBox.isEnabled());
	}
}

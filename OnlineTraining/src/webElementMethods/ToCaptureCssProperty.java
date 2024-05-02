package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.firelawn.com/user-signin");
		WebElement createAccountButton = driver.findElement(By.id("fl_create_account"));
		String cssPropertyValue = createAccountButton.getCssValue("color");
		String tagname = createAccountButton.getTagName();
		System.out.println(tagname);
		System.out.println(cssPropertyValue);
		driver.quit();
		
	}

}

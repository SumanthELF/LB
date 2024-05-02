package jsCodeInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		String name = "Vikas";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('Email').value=arguments[0];",name);
	}

}

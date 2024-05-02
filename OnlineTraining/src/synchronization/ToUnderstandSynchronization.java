package synchronization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandSynchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);

//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
//		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("ABCDEF");
//		driver.findElement(By.xpath("//button[text()='Apply']")).click();
//		String errorMsg = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
//		System.out.println(errorMsg);
		
		driver.get("https://www.firelawn.com/products_page/9");
		driver.findElement(By.xpath("//input[@placeholder='580023']")).sendKeys("560019");
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//butto[text()='Check']")));
		driver.findElement(By.xpath("//button[text()='Check']")).click();
	}

}

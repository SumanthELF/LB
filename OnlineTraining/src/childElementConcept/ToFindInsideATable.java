package childElementConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToFindInsideATable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		WebElement productTable = driver.findElement(By.id("productCartTables"));
		String product1 = productTable.findElement(By.xpath("//p[@class='product-name']")).getText();
		System.out.println(product1);
	}
}

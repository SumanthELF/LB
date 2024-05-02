package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProtoCommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		String userDesiredProduct = "iphone X";		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.linkText("Shop")).click();
		/*driver.findElement(By.xpath("//a[text()='"+userDesiredProduct+"']/../../..//button[contains(text(),'Add')]")).click();
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		driver.findElement(By.id("country")).sendKeys("ind");
		driver.findElement(By.linkText("India")).click();
//		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("India")));
		driver.findElement(By.xpath("//label[contains(text(),'I agree with the')]")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();*/
		
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='card h-100']"));
		for(WebElement product : allProducts) {
			String productName = product.findElement(By.xpath("div/h4/a")).getText();
		}
	}

}

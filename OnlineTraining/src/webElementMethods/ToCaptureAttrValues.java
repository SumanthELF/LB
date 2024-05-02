package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttrValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.meesho.com/");
//		driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"))
//											.sendKeys("Mobiles",Keys.ENTER);
//		Thread.sleep(2000);
//		String alternativeTextOfImg = driver.findElement(By.xpath("//img[contains(@src,'products/129991201')]")).getAttribute("alt");
//		System.out.println(alternativeTextOfImg);
		
		/*driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		String toolTipText = driver.findElement(By.id("keepMeLoggedInCaptionContainer"))
											.getAttribute("title");
		System.out.println(toolTipText);
		driver.quit();*/
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("TestYantra");
		String dataEntered = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(dataEntered);
		driver.quit();
		
		
	}

}

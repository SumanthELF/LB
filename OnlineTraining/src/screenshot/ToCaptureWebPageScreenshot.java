package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToCaptureWebPageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
//		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/lifetime-access']")));
		File eleScreenshot = driver.findElement(By.xpath("//div[@class='login-btn']")).getScreenshotAs(OutputType.FILE);
		File elementScreenshot = new File("./errorshots/registerButton.png");
		FileUtils.copyFile(eleScreenshot, elementScreenshot);
		
	/*	TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/errore.jpeg");
		FileUtils.copyFile(tempFile, destFile);
//		tempFile.renameTo(destFile);
*/	}

}

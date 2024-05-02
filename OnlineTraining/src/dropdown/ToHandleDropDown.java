package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/register");
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='May']")).click();
		driver.findElement(By.id("year")).click();
//		WebElement monthDropDown = driver.findElement(By.id("month"));
//		WebElement dayDropDown = driver.findElement(By.id("day"));
//		WebElement yearDropDown = driver.findElement(By.id("year"));
//		Select month = new Select(monthDropDown);
//		Select day = new Select(dayDropDown);
//		Select year = new Select(yearDropDown);
//		
//		boolean flag = month.isMultiple();
//		System.out.println(flag);
//		month.selectByIndex(4);
//		Thread.sleep(2000);
//		month.selectByValue("9");
//		Thread.sleep(2000);
//		month.selectByVisibleText("Nov");
//		
//		List<WebElement> allMonths = day.getOptions();
//		for(WebElement ele : allMonths) {
//			day.selectByValue(ele.getAttribute("value"));
//		}
//		
//		List<WebElement> allYear = year.getOptions();
//		for(WebElement ele : allYear) {
//			System.out.println(ele.getText());
//		}
//		Thread.sleep(2000);
//		driver.quit();
	}

}

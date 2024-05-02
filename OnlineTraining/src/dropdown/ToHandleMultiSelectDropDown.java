package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/dropDown.html");
		
		WebElement multiSelectDropDown = driver.findElement(By.id("m1"));
		Select multiSelect = new Select(multiSelectDropDown);
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByIndex(2);
		Thread.sleep(1000);
		multiSelect.selectByValue("2");
		Thread.sleep(1000);
		multiSelect.selectByVisibleText("Orange");
		Thread.sleep(1000);
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement ele : selectedOptions) {
			System.out.println(ele.getText());
		}
		
		System.out.println("First Selected : " +multiSelect.getFirstSelectedOption().getText());
		
		multiSelect.deselectByVisibleText("Mango");
		Thread.sleep(1000);
		multiSelect.deselectByValue("4");
		
	}
}

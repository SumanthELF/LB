package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeBrowserWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Dimension sizeBeforeMaximize = driver.manage().window().getSize();
		
		System.out.println(sizeBeforeMaximize.getHeight());
		System.out.println(sizeBeforeMaximize.getWidth());
		
		driver.manage().window().maximize();
		
		Dimension sizeAfterMaximize = driver.manage().window().getSize();
		
		System.out.println(sizeAfterMaximize.getHeight());
		System.out.println(sizeAfterMaximize.getWidth());
		
		driver.get("https://www.skillrary.com/");
	}

}

package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetAndGetSizeOfBrowserWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Dimension sizeBeforeMaximize = driver.manage().window().getSize();
		Point postionBeforeMaximize = driver.manage().window().getPosition();
		
		System.out.println(sizeBeforeMaximize.getHeight());
		System.out.println(sizeBeforeMaximize.getWidth());
		System.out.println(postionBeforeMaximize.getX());
		System.out.println(postionBeforeMaximize.getY());
		
		driver.manage().window().maximize();
		
		Dimension sizeAfterMaximize = driver.manage().window().getSize();
		Point positionAfterMaximize = driver.manage().window().getPosition();
		
		System.out.println(positionAfterMaximize.getX());
		System.out.println(positionAfterMaximize.getY());
		System.out.println(sizeAfterMaximize.getHeight());
		System.out.println(sizeAfterMaximize.getWidth());
		
		driver.get("https://www.skillrary.com/");
		
		driver.manage().window().setSize(new Dimension(500, 700));
		
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
	}

}

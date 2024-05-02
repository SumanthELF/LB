package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(2000);
		driver.quit();
	}

}

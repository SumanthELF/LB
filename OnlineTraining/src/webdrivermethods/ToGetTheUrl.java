package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		String urlOfThePage = driver.getCurrentUrl();
		System.out.println(urlOfThePage);
		Thread.sleep(2000);
		driver.quit();
	}

}

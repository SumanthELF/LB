package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckTheAllignmentOfWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.firelawn.com/user-signin");
		WebElement emailTextField = driver.findElement(By.id("fl_email"));
		WebElement passwordTextField = driver.findElement(By.id("fl_password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='fl_login' and not(contains(@class,'nav'))]"));
		WebElement createAccountButton = driver.findElement(By.id("fl_create_account"));
		
		System.out.println(emailTextField.getLocation().getX());
		System.out.println(passwordTextField.getLocation().getX());
		System.out.println(loginButton.getLocation().getX());
		System.out.println(createAccountButton.getLocation().getX());

		if ((emailTextField.getLocation().getX() == passwordTextField.getLocation().getX()) && (loginButton.getLocation()
				.getX() == createAccountButton.getLocation().getX())) {
			System.out.println("It is inline towards left");
		} else
			System.out.println("The elements are not inline");
		
		driver.quit();
	}

}

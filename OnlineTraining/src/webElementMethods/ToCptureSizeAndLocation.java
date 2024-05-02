package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCptureSizeAndLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login");
		WebElement emailTextField = driver.findElement(By.id("email"));
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='pass']/.."));
		
		Rectangle rectEmailTF = emailTextField.getRect();
		Rectangle rectPassTF = passwordTextField.getRect();
		
//		rectEmailTF.setX(200);
		
		System.out.println(rectEmailTF.getX());
		System.out.println(rectPassTF.getX());
		
		if(rectEmailTF.getX()==rectPassTF.getX()) 
			System.out.println("It is properly alligned to the left");
		else
			System.out.println("There is a miss match in the left allignment");
	}

}

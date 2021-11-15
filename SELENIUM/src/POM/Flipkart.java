package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Flip f=new Flip(driver);
		f.username("shlokkk@gmail.com");
		f.password("paaassss");
		f.loginbutton();

	}

}

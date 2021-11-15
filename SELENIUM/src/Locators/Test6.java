package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shlok");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("shhj");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}

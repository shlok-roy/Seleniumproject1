package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("email"));
		
		if(ele.isDisplayed())
		{
			System.out.println("Pass: Element is Displayed");
			ele.sendKeys("Shlokroy");
		}
		else
		{
			System.out.println("Fail: Element is Not Displayed");
		}
		
		

	}

}

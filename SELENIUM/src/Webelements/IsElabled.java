package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElabled {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("login"));
		
		if(ele.isEnabled()) 
		{
			System.out.println("Pass: element is enabled");
			ele.click();
		}
		else
		{
			System.out.println("Fail: element is disabled");
		}

	}

}

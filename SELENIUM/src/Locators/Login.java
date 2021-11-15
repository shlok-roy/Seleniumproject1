package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("eshdkk");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("pssd");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}

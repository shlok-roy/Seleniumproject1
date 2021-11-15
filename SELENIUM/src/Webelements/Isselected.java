package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//label[text()='Female']"));
		//div[@class='mtm mbs _2_68']
		//WebElement ele = driver.findElement(By.xpath("//div[@class='mtm mbs _2_68']"));
		
		
		if(ele.isSelected()) 
		{
			System.out.println("Pass: element is enabled");
			ele.click();
		}
		else
		{
			System.out.println("Fail: element is disabled");
		}
		
		driver.close();

	}

}

package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("99");
		//s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		Thread.sleep(2000);
		
		s.deselectByIndex(0);
		s.deselectByValue("99");
		//s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}

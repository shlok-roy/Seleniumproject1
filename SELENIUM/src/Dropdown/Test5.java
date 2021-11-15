package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement ele = driver.findElement(By.id("day"));
		
		Select s= new Select(ele);
		s.selectByIndex(26);
		//s.selectByValue("1");
		//s.selectByVisibleText("22");
		
		System.out.println(s.isMultiple());
		
		ArrayList a=new ArrayList();
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for(WebElement alloption:option)
		{
			String text= alloption.getText();
			System.out.println(text);
			a.add(text);
		}
		System.out.println("*******aftersorting*******");
		Collections.sort(a);
		
		for(Object all:a)
		{
			System.out.println(all);
		}
		
		driver.close();
		

	}

}

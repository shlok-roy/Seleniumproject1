package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		// to close a perticular child window
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		System.out.println(child.size());
		
		String expTitle = "Sopra Banking";
		
		for(String allwindow:child)
		{
			driver.switchTo().window(allwindow);
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			
			if(actTitle.contentEquals(expTitle))
			{
				driver.close();
			}
		}
	}

}

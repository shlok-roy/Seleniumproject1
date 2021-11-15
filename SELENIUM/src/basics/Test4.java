package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		//to go back
		driver.navigate().back();
		
		// to go forward
		driver.navigate().forward();
		
		//to refresh
		driver.navigate().refresh();
		
		driver.close();
	}
}

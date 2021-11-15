package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 
{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("search-alias=digital-music");
		s.selectByVisibleText("Prime Video");
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for (WebElement b:option)
		{
			System.out.println(b.getText());
		}
		driver.close();

	}

}

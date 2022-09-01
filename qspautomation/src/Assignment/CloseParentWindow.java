package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		String firstwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Thread.sleep(3000);
		driver.close();
		
		//if(driver.getTitle().equals("Basic Web Page Title"));
		//{
		//	driver.close();
		//}
}
}

	

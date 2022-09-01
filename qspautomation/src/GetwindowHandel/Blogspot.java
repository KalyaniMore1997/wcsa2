package GetwindowHandel;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogspot {
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
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext())
		{
			String window = itr.next();
			driver.switchTo().window(window);
			//if(driver.getTitle().equals("Basic Web Page Title"));
			//{
			//	driver.close();
			//}
		
		}
		Thread.sleep(3000);
		driver.switchTo().window(firstwindow);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Kalyani");
		Thread.sleep(6000);
		
	}
		
}

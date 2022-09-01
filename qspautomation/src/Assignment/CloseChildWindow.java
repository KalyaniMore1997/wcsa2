package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow {
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
		///Iterator<String> itr = windows.iterator();
		//while(itr.hasNext())
	//	{
		//	String window = itr.next();
		//	String title = driver.switchTo().window(window).getTitle();
			for(String handel:windows)
			{
				String title = driver.switchTo().window(windows).getTitle();

			if(! title.equals("\r\n" + "omayo (QAFox.com)"));
			{
				Thread.sleep(3000);
				driver.switchTo().window(windows).close();
			}
}
}

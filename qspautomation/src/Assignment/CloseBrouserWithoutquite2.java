package Assignment;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrouserWithoutquite2 {
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
		//Iterator<String> itr = windows.iterator();
		//while(itr.hasNext())
		//{
		//	String window = itr.next();
		//	driver.switchTo().window(firstwindow);
		//		driver.close();
		for(String handel:windows)
		{
			driver.switchTo().window(handel);
			driver.close();
		}

}
}

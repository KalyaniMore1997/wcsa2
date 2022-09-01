package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartfil {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[.='✕']")).click();;
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();;
		//driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//driver.findElement(By.xpath("//div[@class='_2C41yO']")).click();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	}
}

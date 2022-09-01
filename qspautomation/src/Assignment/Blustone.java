package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blustone {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
	Thread.sleep(6000);
	driver.findElement(By.name("name")).sendKeys("Kalyani");
	
	
	
	
	
}
}

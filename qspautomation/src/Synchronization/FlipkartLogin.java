package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com");
			 
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='wish']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Login']")).click();
			
			
		}

	}


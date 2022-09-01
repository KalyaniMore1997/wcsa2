package JavaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//scrolldown
		jse.executeScript("window.scrollBy(0,1000)");
		//scrollup
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,-1000)");
		
}
}
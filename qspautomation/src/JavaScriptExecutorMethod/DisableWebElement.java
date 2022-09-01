package JavaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HRUSHIKESH/Desktop/html/disabledelement.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//disableWebElement
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('i1').value='admin'");
}
}
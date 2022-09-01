package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		WebElement loginbtn = driver.findElement(By.cssSelector("button[class*='_4jy0 ']"));
		File src = loginbtn.getScreenshotAs(OutputType.FILE);
		File dust = new File("./screenshots/loginbutton.jpg");
		Files.copy(src, dust);
}
}
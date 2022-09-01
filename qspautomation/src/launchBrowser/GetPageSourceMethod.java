package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HRUSHIKESH/Desktop/html/checkboxes.html");
	String sourceCodehtml=driver.getCurrentUrl();
	System.out.println(sourceCodehtml);
}
}

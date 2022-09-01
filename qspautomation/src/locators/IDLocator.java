package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/HRUSHIKESH/Desktop/html/usernametextbox.html");
driver.findElement(By.id("i1")).sendKeys("manager");
}
}

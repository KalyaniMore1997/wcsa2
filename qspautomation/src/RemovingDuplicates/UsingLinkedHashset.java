package RemovingDuplicates;

import java.util.LinkedHashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingLinkedHashset {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HRUSHIKESH/Desktop/html/singleselectdropdown.html");
		Thread.sleep(8000);
		WebElement ssdropdown=driver.findElement(By.id("menu"));
Select sel=new Select(ssdropdown);
 List<WebElement> ops = sel.getOptions();
LinkedHashSet<String> s = new LinkedHashSet<String>();
for (int i = 0; i < ops.size(); i++) {
	String textToInsert = ops.get(i).getText();
	s.add(textToInsert);
}
for(String text:s)
{
	System.out.println(text);
	
}
	
}
}


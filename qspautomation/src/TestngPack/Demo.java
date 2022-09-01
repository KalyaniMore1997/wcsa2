package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 // System.out.println("Hello");
 // Reporter.log("Hii");
	  Reporter.log("Hii",true);
  }
}

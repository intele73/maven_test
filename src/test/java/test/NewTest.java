package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("localhost:3000/tasks");
  }
}

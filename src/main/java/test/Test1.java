package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.Assertion;

public class Test1 {

	public static void main(String[] args) {
		String firstName="Kripal";
		String lastName="Singh";
		String baseurl="http://127.0.0.1:8081/index.htm";
		WebDriver d=new FirefoxDriver(); 
		d.get(baseurl);
		d.findElement(By.name("first_name")).sendKeys(firstName);
		d.findElement(By.name("last_name")).sendKeys(lastName);
		d.findElement(By.xpath("//form[@method='GET']/input[3]")).click();
		
		String x= d.findElement(By.xpath("xhtml:html/xhtml:body/xhtml:pre")).getText();
		if(x.contains(firstName)){
			System.out.println("name contains firstname");
		}
	}

}

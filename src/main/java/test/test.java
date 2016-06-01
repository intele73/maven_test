package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost:3000/tasks");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/tasks/new']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("task_name")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//text[@id='task_name']")).sendKeys("sssss");
		driver.findElement(By.id("task_name")).sendKeys("aaa");
	//  driver.get("http://localhost:3000/tasks/new");
	// 	driver.findElement(By.id("task_name")).sendKeys("sssss");
		driver.findElement(By.id("task_body")).sendKeys("alam has workingalam has workingalam has workingalam has workingalam has workingalam has workingalam has workingalam has workingalam has working");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}

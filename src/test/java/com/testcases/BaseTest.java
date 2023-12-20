package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Hello");
		driver.findElement(By.xpath("//textarea[@name='q']")).submit();
		
	}


}

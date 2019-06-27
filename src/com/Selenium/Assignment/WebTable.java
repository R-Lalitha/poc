package com.Selenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int rowcount = table.findElements(By.cssSelector("table[id='product'] tr")).size();
		System.out.println("Number of row " + rowcount);

		int columnCount = table.findElements(By.cssSelector("table[id='product'] tr:nth-child(1) th")).size();
		System.out.println("Number of Column " + columnCount);

		String rowvalue = table.findElement(By.cssSelector("table[id='product'] tr:nth-child(3)")).getText();
		System.out.println("Third row - " + rowvalue);
	}

}

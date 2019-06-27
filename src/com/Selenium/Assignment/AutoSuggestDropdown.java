package com.Selenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		int i = 0;
		String script = "return document.getElementById(\"autocomplete\").value;";

		String text = (String) js.executeScript(script);
		while (!text.equalsIgnoreCase("United States Minor Outlying Islands")) {
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);

		}
		System.out.println(text);
	}

}

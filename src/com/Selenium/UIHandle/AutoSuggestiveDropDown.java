package com.Selenium.UIHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/"); // URL in the browser

		Thread.sleep(5000);

		WebElement source = driver.findElement(By.xpath("//*[@placeholder='From']"));

		source.clear();
		source.sendKeys("MUM");
		/*
		 * source.sendKeys(Keys.ENTER);
		 * 
		 * WebElement destination =
		 * driver.findElement(By.xpath("//input[@placeholder='To']"));
		 * destination.clear(); destination.sendKeys("DEL"); Thread.sleep(2000);
		 * destination.sendKeys(Keys.ARROW_DOWN);
		 * destination.sendKeys(Keys.ENTER);
		 */

	}

}

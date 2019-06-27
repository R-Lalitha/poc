package com.Selenium.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		// Select the checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		// Grab the label of the selected checkbock
		String text = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(text);
		// Select the option in dropdown. option comes from 2nd point
		driver.findElement(By.id("dropdown-class-example")).sendKeys(text);
		// Enter the step 2 grabbed label in text in editbox
		driver.findElement(By.id("name")).sendKeys(text);
		// Click the Alert button
		driver.findElement(By.id("alertbtn")).click();
		// Verify the text present in popup should match with entered text
		String AlertText = driver.switchTo().alert().getText().substring(6, 13);
		if (text.equals(AlertText)) {
			System.out.println("Verified");
		} else {
			System.out.println("Not matching");
		}
	}

}

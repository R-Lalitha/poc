package com.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {

	public static void main(String[] args) {
		// verifyLoginPage();
	}

	@Test
	public void verifyLoginPage() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement loginName = driver.findElement(By.cssSelector("#txtUsername"));
		loginName.sendKeys("Admin");
		WebElement loginPassword = driver.findElement(By.cssSelector("#txtPassword"));
		loginPassword.sendKeys("admin123");
		Assert.assertEquals(loginName.getText(), "Admin");

		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbutton.click();

	}

}

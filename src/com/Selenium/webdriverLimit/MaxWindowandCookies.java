package com.Selenium.webdriverLimit;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindowandCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Specific cookie delete
		driver.manage().deleteCookieNamed("SessionKey"); // click on any link,
															// login page-
															// verify the login
															// url

		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}

}

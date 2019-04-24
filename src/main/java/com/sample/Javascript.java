package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\N Kathiresan\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement tog = driver.findElement(By.id("email"));
		WebElement bog = driver.findElement(By.id("pass"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','heloo')", tog);
		js.executeScript("arguments[0].setAttribute('value','Greenstech')", bog);
		String name = (String) js.executeScript("return arguments[0]. getAttribute('value')", tog);
		String password = (String) js.executeScript("return arguments[0]. getAttribute('value')", bog);
		System.out.println(name);
		System.out.println(password);
		WebElement god = driver.findElement(By.xpath("//input[@value='Log In']"));
		js.executeScript("arguments[0].click", god);

	}

}

package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\N Kathiresan\\eclipse-workspace\\SampleMaven\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("//a[text()='Subscribe in a reader']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", btn);
		Thread.sleep(3000);
		WebElement btnUp = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		js.executeScript("arguments[0].scrollIntoView(false)", btnUp);
		btnUp.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		 
	}
}
package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\N Kathiresan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		WebElement seleniumCommands = driver.findElement(By.xpath("//div[text()='Selenium Commands']"));
		Select s = new Select(seleniumCommands);
		List<WebElement> emp = s.getOptions();
		for (int i = 0; i < emp.size(); i++) {
			WebElement w = emp.get(i);
			String name = w.getText();
			System.out.println(name);
		}
		driver.quit();

	}

}

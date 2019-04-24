package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\N Kathiresan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//div[@data-type-selected='image-creative']"));
		Select s = new Select(txt);
		s.selectByValue("film");
		
	}

}

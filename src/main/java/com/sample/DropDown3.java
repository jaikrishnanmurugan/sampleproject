package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\N Kathiresan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		/*
		 * WebElement dDmonths = driver.findElement(By.id("month")); Select s = new
		 * Select(dDmonths); List<WebElement> sem = s.getOptions(); for (int i = 0; i <
		 * sem.size(); i++) { WebElement w = sem.get(i); String name = w.getText();
		 * System.out.println(name);
		 * 
		 * }
		 * 
		 * WebElement dDyear = driver.findElement(By.id("year")); 
		 * Select d = new Select(dDyear); 
		 * List<WebElement> vem = d.getOptions(); 
		 * for (int i = 0; i < vem.size(); i++) { 
		 * WebElement r = vem.get(i); 
		 * String year = r.getText();
		 * System.out.println(year);
		 * 
		 * }
		 */

		/*
		 * WebElement fmonth = driver.findElement(By.id("month")); Select cop = new
		 * Select(fmonth); cop.selectByIndex(6); //cop.selectByValue("6");
		 * //cop.selectByVisibleText("Jun");
		 */
		
		WebElement dDmonths = driver.findElement(By.id("month")); 
		Select s = new Select(dDmonths);
		List<WebElement> sem = s.getOptions();
		for (int i = 0; i <sem.size(); i++)
		{ 
	//	System.out.println(sem.get(i).getAttribute("value"));
	//    s.selectByIndex(i);
			s.selectByVisibleText(sem.get(i).getText());
	}
	}

}

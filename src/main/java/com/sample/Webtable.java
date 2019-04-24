package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\N Kathiresan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();		
driver.get("https://www.toolsqa.com/automation-practice-table");	
	//find the tr	
List<WebElement> tRows = driver.findElements(By.tagName("tr"));		
	//iterate the tr	
	for(int i=0;i<tRows.size();i++)	{
	WebElement eachRow = tRows.get(i);	
	//find the td	
List<WebElement> tData = eachRow.findElements(By.tagName("td"));	
	//iterate the tData	
	for(int j=0;j<tData.size();j++)	{
WebElement eachData = tData.get(j);	
	//text	
String name=eachData.getText();		
System.out.println(name);		
		
	}

}
}}
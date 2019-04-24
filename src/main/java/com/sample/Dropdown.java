package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\N Kathiresan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
driver.get("https://www.gettyimages.in/");
WebElement video = driver.findElement(By.xpath("//label[text()='video']"));
Thread.sleep(3000);
Select s=new Select(video);	
List<WebElement> emp = s.getOptions();	
for(int i=0;i<emp.size();i++) {
WebElement w = emp.get(i);
String name =w.getText();
System.out.println(name);
}
driver.quit();


	}

}

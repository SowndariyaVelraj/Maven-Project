package org.task.datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\Maven\\Driver\\chromedriver_win32\\chromedriver.exe");
 
		 driver=new ChromeDriver();
	}
	 
	public static void openBrowser(String url) {

		driver.get(url);
	}
	public static void maximize() {

		driver.manage().window().maximize();
	}
	
	public  static void type(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {

		element.click();
	}
	
	public static void close() {

		driver.close();
	}
	
	public static void quit() {

		driver.quit();
	}
	
	public  static void dropDown(WebElement element,int value) {

		Select s=new Select(element);
		s.selectByIndex(value);
		
	
		
		
	}

}


package org.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTest {
	public static void main(String[]args) {
		
		//Set the property of the Browser
		System.setProperty("webdriver.chrome.deriver", "C:\\Users\\Admin\\eclipse-workspace\\AutomatedTestInJava\\Driver\\chromedriver.exe");
		
		//Initialize the webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//Launch the URL
		driver.get("https://www.amazon.in/");
		
		
	}
}
 
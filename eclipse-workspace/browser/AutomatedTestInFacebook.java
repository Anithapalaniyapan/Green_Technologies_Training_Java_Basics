package org.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTestInFacebook {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomatedTestInJava\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement btn=driver.findElement(By.linkText("Create new account"));
		btn.click();
		
		Thread.sleep(1000);
		
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("abcde");
		
		
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("fghij");
		
		WebElement gender=driver.findElement(By.id("sex"));
		gender.click();
		
		WebElement mail=driver.findElement(By.name("reg_email__"));
		mail.sendKeys("abc@gmail.com");
		
		WebElement psw=driver.findElement(By.name("reg_passwd__"));
		psw.sendKeys("abc123");
		
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
		
	}

}

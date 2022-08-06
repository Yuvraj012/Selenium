package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInUsingPropertiesFile {
	
@Test
public void validLogin1() throws IOException {
	
File file = new  File("D:\\Java Program\\maven.project\\src\\test\\resources\\Property File.xls");
	
	FileInputStream fis = new FileInputStream(file);
	FileOutputStream fos = new FileOutputStream(file);
	
	Properties properties = new Properties();
	properties.load(fis);
	properties.get("userName");
	
	
	System.setProperty("webdriver.chrome.diver", "./src/test/resources/chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get(properties.getProperty("url"));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys((String) properties.getProperty("userName"));
	driver.findElement(By.xpath("//input[@name='pasword']")).sendKeys((String) properties.getProperty("password"));
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	properties.setProperty("userName", "test2");
	properties.put("key1" , "pass2");
	
	fis.close();
	
	
	
	
	
	
	
}
}

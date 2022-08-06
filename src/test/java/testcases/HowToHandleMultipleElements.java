package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleElements {
	
	public HowToHandleMultipleElements () {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium Setup\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> LinksonGooglePage= driver.findElements(By.tagName("a"));

		System.out.println("Number of links on google page: " + LinksonGooglePage.size());
		for (WebElement element : LinksonGooglePage) {
			System.out.println(element.getAttribute("href"));
	}
	}
}

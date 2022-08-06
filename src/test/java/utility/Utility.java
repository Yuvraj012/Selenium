package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

	public static void selectDateFromDatePicker(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}

	public static void selectValueFromDropdown(WebElement select, String string) {
		// TODO Auto-generated method stub
		
	}

	public static void scrollIntoView(WebElement dateOfBirthInputField, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public static void clickUsingJavaScript(Object genderRadioButton, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public static void takeScreenshot(String string, String name) {
		// TODO Auto-generated method stub
		
	}

}

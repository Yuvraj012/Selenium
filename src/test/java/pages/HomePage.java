package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement gendrRadioButton;
	WebElement dateOfBirthInputField;
	WebElement hobbiesCheckBox;
	WebElement filUpload;
	private WebElement fileUpload;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}


	public void setUserNameTextBox(WebElement userNameTextBox) {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));;
	}


	public WebElement getGendrRadioButton() {
		return gendrRadioButton;
	}


	public void setGendrRadioButton(WebElement gendrRadioButton) {
		this.gendrRadioButton = driver.findElement(By.xpath("//input[@id='firstName']"));	}
	
	


public WebElement getDateOfBirthInputField() {
	return dateOfBirthInputField;
}

public void setDateOfBirthInputField() {
	this.dateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
}

public WebElement getHobbiesCheckBox() {
	return hobbiesCheckBox;
}

public void setHobbiesCheckBox() {
	this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
}


public void setUserNameTextBox() {
	// TODO Auto-generated method stub
	
}


public Object getGenderRadioButton() {
	// TODO Auto-generated method stub
	return null;
}


public void setGenderRadioButton() {
	// TODO Auto-generated method stub
	
}


public WebElement getFilUpload() {
	this.fileUpload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	return filUpload;
}


public WebElement getFileUpload() {
	// TODO Auto-generated method stub
	return null;
}




}

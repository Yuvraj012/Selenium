package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

	

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test
	public void anotations1() {
		System.out.println("This is testng test1");
	}

	@Test
	public void anotations2() {
		System.out.println("This is testng test2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test plan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

}
;
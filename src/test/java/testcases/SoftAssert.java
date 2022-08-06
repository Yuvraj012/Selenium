package testcases;

import org.testng.annotations.Test;

public class SoftAssert {
	org.testng.asserts.SoftAssert assert1;
	
	@Test
	public void testAssetions() {
		
		int i =10;
		assert1 = new org.testng.asserts.SoftAssert();
		assert1.assertEquals(i, 20);
		assert1.assertNotEquals(10, 20);
		
		System.out.println("This is test case 1");
	}
	
	
public void testAssetions1() {
		
		int j =20;
		assert1 = new org.testng.asserts.SoftAssert();
		assert1.assertTrue(j == 10);
		assert1.assertFalse(false);
		
		System.out.println("This is test case 2");
	}
	
	

}

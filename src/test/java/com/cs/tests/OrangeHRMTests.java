package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	
	private OrangeHRMTests() {
		
	}
	
	@Test
	public void loginLogoutTest() {
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		String actualTitle = ohlp.enterUsername("Admin")
			.enterPassword("admin123")
			.clickOnLoginBtn()
			.clickProfilePicArrow()
			.clickLogoutOption()
			.getPageTitle();
		
		String expTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expTitle,"Actual title does not match with expected title");
	}
}

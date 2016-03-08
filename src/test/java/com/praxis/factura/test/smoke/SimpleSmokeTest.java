package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.SIGNONEMISION;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.dataprovider.SmokeTestDP;
import com.praxis.factura.test.pages.main.LogInPage;
import com.praxis.factura.test.pages.main.MainPage;

public class SimpleSmokeTest extends WebDriverSetup {

	@Test(enabled = true, priority = 1, groups = {SMOKE, SIGNONEMISION}, dataProviderClass = SmokeTestDP.class, dataProvider = SIGNONEMISION)
	public void signOn(String credential, String password) {
		LogInPage logInPage = new LogInPage(driver).refreshPage();
		System.out.println("after instanciating login page: " + logInPage);
		Assert.assertNotNull(logInPage);
		System.out.println("before method signon");
		MainPage mainPage = logInPage.signon(credential, password);
		Assert.assertNotNull(mainPage);
        System.out.println("----------------SIGN ON COMPLETE---------------------");  
	}
}

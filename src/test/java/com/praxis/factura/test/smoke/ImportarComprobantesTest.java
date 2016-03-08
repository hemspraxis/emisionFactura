package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.SIGNONRECEPCION;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;
import static com.praxis.factura.test.common.constants.GroupsConstants.COMPROBANTE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.dataprovider.SmokeTestDP;
import com.praxis.factura.test.pages.main.LogInPage;
import com.praxis.factura.test.pages.main.MainPageRecepcion;
import com.praxis.factura.test.pages.main.recepcion.ImportarComprobantePage;

public class ImportarComprobantesTest extends WebDriverSetup {

	@Test(enabled = true, priority = 1, groups = {SMOKE, SIGNONRECEPCION}, dataProviderClass = SmokeTestDP.class, dataProvider = SIGNONRECEPCION)
	public void signOn(String credential, String password) {
		LogInPage logInPage = new LogInPage(driver).refreshPage();
		System.out.println("after instanciating login page: " + logInPage);
		Assert.assertNotNull(logInPage);
		System.out.println("before method signon");
		MainPageRecepcion mainPage = logInPage.signonrecep(credential, password);
		Assert.assertNotNull(mainPage);
        System.out.println("----------------SIGN ON COMPLETE---------------------");  
	}
	
	@Test(enabled = true, priority = 2, groups = {SMOKE, COMPROBANTE})
	public void importarComprobanteFactura() {
		testCase("importarComprobantes");
		MainPageRecepcion mainPageRecepcion = new MainPageRecepcion(driver).refreshPage();
		ImportarComprobantePage importarComprobantePage = mainPageRecepcion.linkToImportarComprobante();
		Assert.assertNotEquals(importarComprobantePage.importarComprobantes(), null);
        System.out.println("----------------CASO IMPORTAR COMPROBANTES COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 3, groups = {SMOKE, COMPROBANTE})
	public void importarZipComprobanteFactura() {
		testCase("importarZipComprobantes");
		MainPageRecepcion mainPageRecepcion = new MainPageRecepcion(driver).refreshPage();
		ImportarComprobantePage importarComprobantePage = mainPageRecepcion.linkToImportarComprobante();
		Assert.assertNotEquals(importarComprobantePage.importarZipComprobantes(), null);
        System.out.println("----------------CASO IMPORTAR ZIP COMPROBANTES COMPLETE---------------------");
	}
	
}

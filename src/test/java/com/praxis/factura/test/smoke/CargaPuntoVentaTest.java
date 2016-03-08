package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.SIGNONYOFACTURO;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;
import static com.praxis.factura.test.common.constants.GroupsConstants.COMPROBANTE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.dataprovider.SmokeTestDP;
import com.praxis.factura.test.pages.main.LogInPage;
import com.praxis.factura.test.pages.main.MainPageYoFacturo;
import com.praxis.factura.test.pages.main.yofacturo.CargaPuntoVentaPage;

public class CargaPuntoVentaTest extends WebDriverSetup {

	@Test(enabled = true, priority = 1, groups = {SMOKE, SIGNONYOFACTURO}, dataProviderClass = SmokeTestDP.class, dataProvider = SIGNONYOFACTURO)
	public void signOn(String credential, String password) {
		LogInPage logInPage = new LogInPage(driver).refreshPage();
		System.out.println("after instanciating login page: " + logInPage);
		Assert.assertNotNull(logInPage);
		System.out.println("before method signon");
		MainPageYoFacturo mainPage = logInPage.signonyofact(credential, password);
		Assert.assertNotNull(mainPage);
        System.out.println("----------------SIGN ON COMPLETE---------------------");  
	}
	
	@Test(enabled = true, priority = 2, groups = {SMOKE, COMPROBANTE})
	public void cargaPuntoVenta() {
		testCase("cargaPuntoVenta");
		MainPageYoFacturo mainPageYoFacturo = new MainPageYoFacturo(driver).refreshPage();
		CargaPuntoVentaPage cargaPuntoVentaPage = mainPageYoFacturo.linkToCargaPuntoVenta();
		Assert.assertNotEquals(cargaPuntoVentaPage.cargarArchivoVentas(), "Registros con errores");
        System.out.println("----------------CASO CARGA PUNTO DE VENTA COMPLETE---------------------");
	}
}

package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.SIGNONEMISION;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;
import static com.praxis.factura.test.common.constants.GroupsConstants.COMPROBANTE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.dataprovider.SmokeTestDP;
import com.praxis.factura.test.pages.main.LogInPage;
import com.praxis.factura.test.pages.main.MainPage;
import com.praxis.factura.test.pages.main.emision.GenerarComprobantePage;

public class GenerarComprobanteTest extends WebDriverSetup {

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
	
	@Test(enabled = true, priority = 2, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteFactura() {
		testCase("generarComprobanteFactura");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteFactura(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE FACTURA COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 3, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteHonorarios() {
		testCase("generarComprobanteHonorarios");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteHonorarios(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE HONORARIOS COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 4, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteNotaCargo() {
		testCase("generarComprobanteNotaCargo");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteNotaCargo(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE NOTA DE CARGO COMPLETE---------------------");
	}

	@Test(enabled = true, priority = 5, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteNotaCredito() {
		testCase("generarComprobanteNotaCredito");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteNotaCredito(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE NOTA DE CREDITO COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 6, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteCartaPorte() {
		testCase("generarComprobanteCartaPorte");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteCartaPorte(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE CARTA PORTE COMPLETE---------------------");
	}
	
	@Test(enabled = false, priority = 7, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteNomina() {
		testCase("generarComprobanteNomina");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteNomina(), "El sistema tomará los empleados seleccionados y generará sus comprobantes en breve.");
        System.out.println("----------------CASO GENERAR COMPROBANTE NOMINA COMPLETE---------------------");
	}
	
	@Test(enabled = false, priority = 8, groups = {SMOKE, COMPROBANTE})
	public void generarComprobanteReciboArrendamiento() {
		testCase("generarComprobanteReciboArrendamiento");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarComprobantePage generarComprobantePage = mainPage.linkToGenerarComprobante();
        Assert.assertEquals(generarComprobantePage.generarComprobanteReciboArrendamiento(), "Se generó el comprobante exitosamente.");
        System.out.println("----------------CASO GENERAR COMPROBANTE RECIBO-ARRENDAMIENTO COMPLETE---------------------");
	}
	
}


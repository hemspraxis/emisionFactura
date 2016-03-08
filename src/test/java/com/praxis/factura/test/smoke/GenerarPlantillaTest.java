package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.SIGNONEMISION;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;
import static com.praxis.factura.test.common.constants.GroupsConstants.PLANTILLA;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.dataprovider.SmokeTestDP;
import com.praxis.factura.test.pages.main.LogInPage;
import com.praxis.factura.test.pages.main.MainPage;
import com.praxis.factura.test.pages.main.emision.GenerarPlantillaPage;

public class GenerarPlantillaTest extends WebDriverSetup {

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
	
	@Test(enabled = true, priority = 2, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaFactura() {
		testCase("generarPlantillaFactura");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaFactura(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA FACTURA COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 3, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaHonorarios() {
		testCase("generarPlantillaHonorarios");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaHonorarios(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA HONORARIOS COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 4, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaNotaCargo() {
		testCase("generarPlantillaNotaCargo");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaNotaCargo(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA NOTA DE CARGO COMPLETE---------------------");
	}

	@Test(enabled = true, priority = 5, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaNotaCredito() {
		testCase("generarPlantillaNotaCredito");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaNotaCredito(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA NOTA DE CREDITO COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 6, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaCartaPorte() {
		testCase("generarPlantillaCartaPorte");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaCartaPorte(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA CARTA PORTE COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 7, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaNomina() {
		testCase("generarPlantillaNomina");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaNomina(), "El sistema tomará los empleados seleccionados y generará sus comprobantes en breve.");
        System.out.println("----------------CASO GENERAR PLANTILLA NOMINA COMPLETE---------------------");
	}
	
	@Test(enabled = true, priority = 8, groups = {SMOKE, PLANTILLA})
	public void generarPlantillaReciboArrendamiento() {
		testCase("generarPlantillaReciboArrendamiento");
		MainPage mainPage = new MainPage(driver).refreshPage();
        GenerarPlantillaPage generarPlantillaPage = mainPage.linkToGenerarPlantilla();
        Assert.assertEquals(generarPlantillaPage.generarPlantillaReciboArrendamiento(), "Se generó el borrador exitosamente.");
        System.out.println("----------------CASO GENERAR PLANTILLA RECIBO-ARRENDAMIENTO COMPLETE---------------------");
	}
	
}

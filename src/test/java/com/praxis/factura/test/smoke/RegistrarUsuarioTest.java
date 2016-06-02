package com.praxis.factura.test.smoke;

import static com.praxis.factura.test.common.constants.GroupsConstants.USUARIO;
import static com.praxis.factura.test.common.constants.GroupsConstants.SMOKE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.factura.test.WebDriverSetup;
import com.praxis.factura.test.pages.main.MainPage;
import com.praxis.factura.test.pages.main.RegisterPage;
import com.praxis.factura.test.pages.main.usuarios.RegistrarUsuarioPage;

public class RegistrarUsuarioTest extends WebDriverSetup {
	
	@Test(enabled = true, priority = 1, groups = {SMOKE, USUARIO})
	public void register() {
		RegisterPage registerPage = new RegisterPage(driver).refreshPage();
		System.out.println("after instanciating login page: " + registerPage);
		Assert.assertNotNull(registerPage);
		System.out.println("before method register");
		Assert.assertNotNull(registerPage.register());
        System.out.println("----------------REGISTER COMPLETE---------------------");  
	}
	
	@Test(enabled = true, priority = 2, groups = {SMOKE, USUARIO})
	public void generarUsuario() {
		testCase("generarUsuario");
		RegistrarUsuarioPage registrarUsuarioPage = new RegistrarUsuarioPage(driver).refreshPage();
        //Assert.assertEquals(registrarUsuarioPage.registrarUsuario(), "Se generó el usuario exitosamente.");
        System.out.println("----------------CASO GENERAR USUARIO COMPLETE---------------------");
	}

}

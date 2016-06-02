package com.praxis.factura.test.pages.main.usuarios;

import static com.praxis.factura.test.common.constants.PageURLsConstants.REGISTRAR_USUARIO_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class RegistrarUsuarioPage extends Page<RegistrarUsuarioPage> {
	
	public RegistrarUsuarioPage(WebDriver driver) {
		super(driver, REGISTRAR_USUARIO_PAGE);
	}
	
	@FindBy(how = How.ID, using = "formRegister:nombre")
	private WebElement txtNombre;
	
	@FindBy(how = How.ID, using = "formRegister:usuario")
	private WebElement txtUsuario;
	
	@FindBy(how = How.ID, using = "formRegister:password")
	private WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "formRegister:repetirPassword")
	private WebElement txtPassword2;
	
	@FindBy(how = How.ID, using = "formRegister:selectPregunta")
	private WebElement comboPregunta;
	
	@FindBy(how = How.ID, using = "formRegister:respuestaPreguntaSecreta")
	private WebElement txtRespuesta;
	
	public String registrarUsuario() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(txtNombre);
			safeSendKeys(txtNombre, "Suriel Hernandez Matias");
			safeSendKeys(txtUsuario, "hems@praxis.com.mx");
			safeSendKeys(txtPassword, "123456");
			safeSendKeys(txtPassword2, "123456");
			safeSelectOptionOnPrimefacesList(comboPregunta,
					driver.findElement(By.xpath("//*[@id=\"formRegister:selectPregunta\"]/option[2]")));
			safeSendKeys(txtRespuesta, "pizza");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

}

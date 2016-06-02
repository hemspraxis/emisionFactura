package com.praxis.factura.test.pages.main;

import static com.praxis.factura.test.common.constants.PageURLsConstants.REGISTER_PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class RegisterPage extends Page<RegisterPage> {

	@FindBy(how = How.ID, using = "formLogin:j_id154")
	private WebElement btnRegister;

	public RegisterPage(WebDriver driver) {
		super(driver, REGISTER_PAGE);
	}
	
	public RegisterPage register() {
		safeClick(btnRegister);
		return new RegisterPage(driver).loadPage();
	}
	
}

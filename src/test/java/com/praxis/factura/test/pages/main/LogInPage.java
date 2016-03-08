package com.praxis.factura.test.pages.main;

import static com.praxis.factura.test.common.constants.PageURLsConstants.LOGIN_PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class LogInPage extends Page<LogInPage>{

	@FindBy(how = How.NAME, using = "j_username")
	private WebElement userName;

	@FindBy(how = How.NAME, using = "j_password")
	private WebElement password;

	@FindBy(how = How.ID, using = "button")
	private WebElement btnLogin;

	public LogInPage(WebDriver driver) {
		super(driver, LOGIN_PAGE);
	}

	public MainPage signon(String userName, String password) {
		System.out.println("filling user name");
		fillUserName(userName);
		System.out.println("filling password");
		fillContrasegna(password);
		System.out.println("click on login");
		safeClick(btnLogin);
    	return new MainPage(driver).loadPage();
	}
	
	public MainPageRecepcion signonrecep(String userName, String password) {
		System.out.println("filling user name");
		fillUserName(userName);
		System.out.println("filling password");
		fillContrasegna(password);
		System.out.println("click on login");
		safeClick(btnLogin);
    	return new MainPageRecepcion(driver).loadPage();
	}
	
	public MainPageYoFacturo signonyofact(String userName, String password) {
		System.out.println("filling user name");
		fillUserName(userName);
		System.out.println("filling password");
		fillContrasegna(password);
		System.out.println("click on login");
		safeClick(btnLogin);
    	return new MainPageYoFacturo(driver).loadPage();
	}
	
	public void fillUserName(String name){
    	safeSendKeys(userName, name);
    }
	
	public void fillContrasegna(String passward){
    	safeSendKeys(password, passward);
    }
}
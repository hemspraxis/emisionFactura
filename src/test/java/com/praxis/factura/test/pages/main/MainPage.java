package com.praxis.factura.test.pages.main;

import static com.praxis.factura.test.common.constants.PageURLsConstants.MAIN_PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;
import com.praxis.factura.test.pages.main.MainPage;
import com.praxis.factura.test.pages.main.emision.GenerarComprobantePage;
import com.praxis.factura.test.pages.main.emision.GenerarPlantillaPage;

public class MainPage extends Page<MainPage>{
	
	public MainPage(WebDriver driver) {
		super(driver, MAIN_PAGE);
	}

	@FindBy(how = How.LINK_TEXT, using = "Emisión")
	private WebElement parentNodeEmision;
	
	@FindBy(how = How.LINK_TEXT, using = "Generar Comprobante")
	private WebElement generarComprobante;
	
	public GenerarComprobantePage linkToGenerarComprobante(){
		Actions action = new Actions(driver);
		waitForWebElementDisplayed(parentNodeEmision);
		action.moveToElement(parentNodeEmision).perform();
		waitForWebElementDisplayed(generarComprobante);
		action.moveToElement(generarComprobante).click().perform();
		return new GenerarComprobantePage(driver).loadPage();
	}
	
	public GenerarPlantillaPage linkToGenerarPlantilla(){
		Actions action = new Actions(driver);
		waitForWebElementDisplayed(parentNodeEmision);
		action.moveToElement(parentNodeEmision).perform();
		waitForWebElementDisplayed(generarComprobante);
		action.moveToElement(generarComprobante).click().perform();
		return new GenerarPlantillaPage(driver).loadPage();
	}

}
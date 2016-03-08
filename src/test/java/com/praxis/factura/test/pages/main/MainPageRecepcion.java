package com.praxis.factura.test.pages.main;

import static com.praxis.factura.test.common.constants.PageURLsConstants.MAIN_PAGE_RECEPCION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;
import com.praxis.factura.test.pages.main.recepcion.ImportarComprobantePage;

public class MainPageRecepcion extends Page<MainPageRecepcion>{
	
	public MainPageRecepcion(WebDriver driver) {
		super(driver, MAIN_PAGE_RECEPCION);
	}

	@FindBy(how = How.LINK_TEXT, using = "Recepción")
	private WebElement parentNodeRecepcion;
	
	@FindBy(how = How.LINK_TEXT, using = "Importar Comprobantes")
	private WebElement importarComprobante;
	
	public ImportarComprobantePage linkToImportarComprobante(){
		Actions action = new Actions(driver);
		waitForWebElementDisplayed(parentNodeRecepcion);
		action.moveToElement(parentNodeRecepcion).perform();
		waitForWebElementDisplayed(importarComprobante);
		action.moveToElement(importarComprobante).click().perform();
		return new ImportarComprobantePage(driver).loadPage();
	}

}

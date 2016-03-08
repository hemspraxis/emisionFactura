package com.praxis.factura.test.pages.main;

import static com.praxis.factura.test.common.constants.PageURLsConstants.MAIN_PAGE_YOFACTURO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;
import com.praxis.factura.test.pages.main.yofacturo.CargaPuntoVentaPage;

public class MainPageYoFacturo extends Page<MainPageYoFacturo>{
	
	public MainPageYoFacturo(WebDriver driver) {
		super(driver, MAIN_PAGE_YOFACTURO);
	}

	@FindBy(how = How.LINK_TEXT, using = "Yo Facturo")
	private WebElement parentNodeYoFacturo;
	
	@FindBy(how = How.LINK_TEXT, using = "Carga punto de venta")
	private WebElement cargaPuntoVenta;
	
	public CargaPuntoVentaPage linkToCargaPuntoVenta(){
		Actions action = new Actions(driver);
		waitForWebElementDisplayed(parentNodeYoFacturo);
		action.moveToElement(parentNodeYoFacturo).perform();
		waitForWebElementDisplayed(cargaPuntoVenta);
		action.moveToElement(cargaPuntoVenta).click().perform();
		return new CargaPuntoVentaPage(driver).loadPage();
	}

}

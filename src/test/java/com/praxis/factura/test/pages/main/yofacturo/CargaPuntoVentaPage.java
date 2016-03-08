package com.praxis.factura.test.pages.main.yofacturo;

import static com.praxis.factura.test.common.constants.PageURLsConstants.CARGA_PUNTO_DE_VENTA_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class CargaPuntoVentaPage extends Page<CargaPuntoVentaPage> {

	public CargaPuntoVentaPage(WebDriver driver) {
		super(driver, CARGA_PUNTO_DE_VENTA_PAGE);
	}
	
	@FindBy(how = How.ID, using = "formInterfazPuntoVenta:selectEmisor")
	private WebElement comboContribuyente;
	
	@FindBy(how = How.ID, using = "frmHta:pct1")
	private WebElement divPlantillaCsv;
	
	@FindBy(how = How.ID, using = "formInterfazPuntoVenta:pathCsv:uploadFrame")
	private WebElement iframeUpload;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"fileUploadForm\"]/input[3]")
	private WebElement btnUpload;
	
	@FindBy(how = How.ID, using = "formInterfazPuntoVenta:resumenCargaTable")
	private WebElement tblResultadoCarga;
	
	@FindBy(how = How.ID, using = "formInterfazPuntoVenta:j_id85")
	private WebElement btnPreview;
	
	@FindBy(how = How.ID, using = "formInterfazPuntoVenta:j_id86")
	private WebElement btnGuardar;
	
	public String cargarArchivoVentas() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboContribuyente);
			safeClick(comboContribuyente);
			safeSelectOptionOnPrimefacesList(comboContribuyente,
					driver.findElement(By.xpath("//*[@id=\"formInterfazPuntoVenta:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			waitForWebElementDisplayed(divPlantillaCsv);
			waitForWebElementDisplayed(iframeUpload);
			driver.switchTo().frame(iframeUpload);
			btnUpload.sendKeys("/home/praxis/Documentos/archivotodobdi.csv");
			//btnUpload.sendKeys("/home/hems/Documentos/archivotodobdi.csv");
			driver.switchTo().defaultContent();
			waitForWebElementDisplayed(tblResultadoCarga);
			System.out.println("Registros con error(es) de validación: " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:0:j_id94")).getText());
			System.out.println("Registros sin error(es) de validación: " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:1:j_id94")).getText());
			System.out.println("Registros totales en el archivo: " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:2:j_id94")).getText());
			System.out.println("Registros de Compras Válidos: " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:3:j_id94")).getText());
			System.out.println("Registros de Compras a cargar en BD: " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:4:j_id94")).getText());
			
			if(Integer.parseInt(driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:0:j_id94")).getText()) > 0) {
				System.out.println("++++++ EXISTEN " + driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:0:j_id94")).getText() + " REGISTROS CON ERRORES DE VALIDACION +++++");
				return "Registros con errores";
			}
			safeClick(btnPreview);
			Thread.sleep(3000);
			int rowCount = driver
			.findElements(By.xpath("//*[@id=\"frmHta:dtHta\"]/tbody/tr")).size();
			System.out.println(rowCount + " = " + Integer.parseInt(driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:2:j_id94")).getText()));
			if(rowCount < (Integer.parseInt(driver.findElement(By.id("formInterfazPuntoVenta:resumenCargaTable:2:j_id94")).getText()))) {
				System.out.println("++++++ NO SE CARGARON TODOS LOS REGISTROS DEL ARCHIVO ++++++");
				return "Registros con errores";
			}
			safeClick(btnGuardar);
			Thread.sleep(3000);
			responseMessage = "Registros Guardados";
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}
}

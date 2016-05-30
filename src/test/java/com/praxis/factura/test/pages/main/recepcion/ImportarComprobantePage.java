package com.praxis.factura.test.pages.main.recepcion;

import static com.praxis.factura.test.common.constants.PageURLsConstants.IMPORTAR_COMPROBANTE_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class ImportarComprobantePage extends Page<ImportarComprobantePage> {

	public ImportarComprobantePage(WebDriver driver) {
		super(driver, IMPORTAR_COMPROBANTE_PAGE);
	}

	@FindBy(how = How.ID, using = "formInterfazImportacionComprobantes:pathFile:uploadFrame")
	private WebElement iframeUpload;

	@FindBy(how = How.XPATH, using = "//*[@id=\"fileUploadForm\"]/input[3]")
	private WebElement btnUpload;

	@FindBy(how = How.ID, using = "formInterfazImportacionComprobantes:resumenCargaTable")
	private WebElement tblResultadoImportacion;

	@FindBy(how = How.ID, using = "formInterfazImportacionComprobantes:resumenCargaTable:0:j_id89")
	private WebElement resultadoImportacion;

	public String importarComprobantes() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(iframeUpload);
			driver.switchTo().frame(iframeUpload);
			//btnUpload.sendKeys("/home/praxis/Documentos/CCG640626CE7FA0000000101_2016-04-27 16-59-32.xml");
			btnUpload.sendKeys("/home/hems/Documentos/CCG640626CE7FA0000000101_2016-04-27 16-59-32.xml");
			driver.switchTo().defaultContent();
			waitForWebElementDisplayed(tblResultadoImportacion);
			System.out.println(resultadoImportacion.getText());
			System.out.println();
			responseMessage = resultadoImportacion.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String importarZipComprobantes() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(iframeUpload);
			driver.switchTo().frame(iframeUpload);
			//btnUpload.sendKeys("/home/praxis/Documentos/edmundo 3.zip");
			btnUpload.sendKeys("/home/hems/Documentos/edmundo 3.zip");
			driver.switchTo().defaultContent();
			waitForWebElementDisplayed(tblResultadoImportacion);
			int rowCount = driver
					.findElements(
							By.xpath("//*[@id=\"formInterfazImportacionComprobantes:resumenCargaTable\"]/tbody/tr"))
					.size();
			for (int i = 0; i < rowCount; i++) {
				System.out
						.println((i + 1) + ".-"
								+ (driver.findElement(By
										.id("formInterfazImportacionComprobantes:resumenCargaTable:" + i + ":j_id89")))
												.getText());
			}
			System.out.println();
			responseMessage = resultadoImportacion.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}
}

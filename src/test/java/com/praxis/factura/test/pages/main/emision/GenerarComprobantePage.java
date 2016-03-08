package com.praxis.factura.test.pages.main.emision;

import static com.praxis.factura.test.common.util.RandomData.generateRandomNumberFromAToZ;
import static com.praxis.factura.test.common.constants.PageURLsConstants.GENERAR_COMPROBANTE_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.factura.test.pages.Page;

public class GenerarComprobantePage extends Page<GenerarComprobantePage> {

	public GenerarComprobantePage(WebDriver driver) {
		super(driver, GENERAR_COMPROBANTE_PAGE);
	}

	@FindBy(how = How.ID, using = "factura:tipoComprobante")
	private WebElement comboTipo;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectEmisor")
	private WebElement comboEmisor;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectEmisorNomina")
	private WebElement comboEmisorNomina;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectSucursal")
	private WebElement comboSucursal;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectSucursalNomina")
	private WebElement comboSucursalNomina;

	@FindBy(how = How.ID, using = "factura:factPan:0:numDiasPagados")
	private WebElement txtDiasPagados;

	@FindBy(how = How.ID, using = "factura:factPan:0:PeriodoPagoIni_cb")
	private WebElement btnPeriodoIni;

	@FindBy(how = How.ID, using = "factura:factPan:0:PeriodoPagoIni_text_49")
	private WebElement btnDiaIni;

	@FindBy(how = How.ID, using = "factura:factPan:0:PeriodoPagoFin_cb")
	private WebElement btnPeriodoFin;

	@FindBy(how = How.ID, using = "factura:factPan:0:PeriodoPagoFin_c_1572")
	private WebElement btnDiaFin;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectSerie")
	private WebElement comboSerie;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectGrupos")
	private WebElement comboGrupos;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectReceptor")
	private WebElement comboReceptor;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectMetodoPago")
	private WebElement comboMetodoPago;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectMetodoPagoNomina")
	private WebElement comboMetodoPagoNomina;

	@FindBy(how = How.ID, using = "factura:factPan:0:idConductor")
	private WebElement txtConductor;

	@FindBy(how = How.ID, using = "factura:factPan:0:idVehiculo")
	private WebElement txtVehiculo;

	@FindBy(how = How.ID, using = "factura:factPan:0:idPlacas")
	private WebElement txtPlacas;

	@FindBy(how = How.ID, using = "factura:factPan:0:idKilometros")
	private WebElement txtKilometros;

	@FindBy(how = How.ID, using = "factura:factPan:0:idNumeroSiniestros")
	private WebElement txtRemisiones;

	@FindBy(how = How.ID, using = "factura:factPan:0:idIVA")
	private WebElement txtIva;

	@FindBy(how = How.ID, using = "factura:factPan:0:idIVAArrend")
	private WebElement txtIvaArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0:idISR")
	private WebElement txtISR;

	@FindBy(how = How.ID, using = "factura:factPan:0:idCantiProd")
	private WebElement txtCantidad;

	@FindBy(how = How.ID, using = "factura:factPan:0:idCantiProdArrend")
	private WebElement txtCantidadArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0:idUnidad")
	private WebElement txtUnidadMedida;

	@FindBy(how = How.ID, using = "factura:factPan:0:idUnidadArrend")
	private WebElement txtUnidadMedidaArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0:idValorUnitario")
	private WebElement txtValorUnitario;

	@FindBy(how = How.ID, using = "factura:factPan:0:idValorUnitarioArrend")
	private WebElement txtValorUnitarioArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0:idDescrip")
	private WebElement txtConcepto;

	@FindBy(how = How.ID, using = "factura:factPan:0:idDescripArrend")
	private WebElement txtConceptoArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0:ctaPredialArrend")
	private WebElement txtCuentaPredial;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnAgregarConcep")
	private WebElement btnAgregarConcepto;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnAgregarConcepArrend")
	private WebElement btnAgregarConceptoArrend;

	@FindBy(how = How.ID, using = "factura:factPan:0.7")
	private WebElement btnAddenda;

	@FindBy(how = How.ID, using = "factura:factPan:0:numProveedor")
	private WebElement txtNumProv;

	@FindBy(how = How.ID, using = "factura:factPan:0:pedido")
	private WebElement txtPedido;

	@FindBy(how = How.ID, using = "factura:factPan:0:posicion")
	private WebElement txtPosicion;

	@FindBy(how = How.ID, using = "factura:factPan:0:entrada")
	private WebElement txtEntrada;

	@FindBy(how = How.ID, using = "factura:factPan:0:bttnAddPartidaAddenda")
	private WebElement btnAgregarAddenda;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnBuscarEmp")
	private WebElement btnBuscarEmpleado;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectTipoBusquedaNom")
	private WebElement comboCriterioBusqueda;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectDepartamento")
	private WebElement comboDepartamento;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnConsultaEmpleado")
	private WebElement btnConsultar;

	@FindBy(how = How.ID, using = "factura:factPan:0:tablaBuscaEmpleados")
	private WebElement tblEmpleados;

	@FindBy(how = How.ID, using = "factura:factPan:0:tablaBuscaEmpleados:0:j_id4231")
	private WebElement selectEmpleado;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnImportarEmpleadoBuscado")
	private WebElement btnImportar;

	@FindBy(how = How.ID, using = "factura:factPan:0:tablaEmpleados")
	private WebElement tblEmpleadosImp;

	@FindBy(how = How.ID, using = "factura:factPan:0:tablaEmpleados:0:j_id4380")
	private WebElement selectEmpleadoImp;

	@FindBy(how = How.ID, using = "factura:factPan:0:tablaEmpleados:0:btnShowPercepciones")
	private WebElement btnPerDed;

	@FindBy(how = How.ID, using = "factura:factPan:0:HeadPerEmpleado")
	private WebElement btnPercepciones;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectTipoPerPerEmp")
	private WebElement comboTipoPercepcion;

	@FindBy(how = How.ID, using = "factura:factPan:0:modPerClave")
	private WebElement txtClave;

	@FindBy(how = How.ID, using = "factura:factPan:0:conPerMod")
	private WebElement txtConceptoPercepcion;

	@FindBy(how = How.ID, using = "factura:factPan:0:ImpGravadoPerc")
	private WebElement txtImporteGravado;

	@FindBy(how = How.ID, using = "factura:factPan:0:ImpExePer")
	private WebElement txtImporteExento;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnAgregarPercepEmp")
	private WebElement btnAgregarPercepcion;

	@FindBy(how = How.ID, using = "factura:btnGenCompFoot")
	private WebElement btnGenerarComprobante;

	@FindBy(how = How.ID, using = "factura:btnGdrComNomFoot")
	private WebElement btnGenerarComprobanteNomina;

	@FindBy(how = How.ID, using = "factura:btnGdrAcrBorradorFoot")
	private WebElement btnGuardarPlantilla;

	@FindBy(how = How.ID, using = "factura:btnGdrComNomFoot")
	private WebElement btnGuardarPlantillaNomina;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnConfirmarEnvEmp")
	private WebElement btnConfNomina;

	@FindBy(how = How.ID, using = "factura:j_id3035")
	private WebElement messageResponse;

	@FindBy(how = How.ID, using = "factura:factPan:0:j_id4934")
	private WebElement messageResponseNomina;

	@FindBy(how = How.ID, using = "factura:j_id3038")
	private WebElement btnAceptarRespuesta;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnConfirmarGenerico")
	private WebElement btnAceptarRespuestaNomina;

	public String generarComprobanteFactura() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboSucursal);
			safeSelectOptionOnPrimefacesList(comboSucursal,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursal\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboSerie);
			safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
					"//*[@id=\"factura:factPan:0:selectSerie\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtIva, "16");
			Thread.sleep(1000);
			safeSendKeys(txtCantidad, "5");
			Thread.sleep(1000);
			safeSendKeys(txtUnidadMedida, "Kg");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitario, "50");
			Thread.sleep(1000);
			safeSendKeys(txtConcepto, "PRODUCTO DE PRUEBA");
			Thread.sleep(2000);
			safeClick(btnAgregarConcepto);
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteHonorarios() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			 safeClick(comboSucursal);
			 safeSelectOptionOnPrimefacesList(comboSucursal,
			 driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursal\"]/option[1]")));
			 
			Thread.sleep(2000);
			safeClick(comboSerie);
			safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
					"//*[@id=\"factura:factPan:0:selectSerie\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtIva, "16");
			Thread.sleep(1000);
			safeSendKeys(txtISR, "10");
			Thread.sleep(1000);
			safeSendKeys(txtCantidad, "7");
			Thread.sleep(1000);
			safeSendKeys(txtUnidadMedida, "Lt");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitario, "30");
			Thread.sleep(1000);
			safeSendKeys(txtConcepto, "PRODUCTO DE PRUEBA");
			Thread.sleep(2000);
			safeClick(btnAgregarConcepto);
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteNotaCargo() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[3]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));
			
			Thread.sleep(2000);
			safeClick(comboSucursal);
			safeSelectOptionOnPrimefacesList(comboSucursal,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursal\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboSerie);
				safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
				"//*[@id=\"factura:factPan:0:selectSerie\"]/option[1]")));
				
			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtIva, "16");
			Thread.sleep(1000);
			safeSendKeys(txtCantidad, "3");
			Thread.sleep(1000);
			safeSendKeys(txtUnidadMedida, "Lb");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitario, "25");
			Thread.sleep(1000);
			safeSendKeys(txtConcepto, "PRODUCTO DE PRUEBA");
			Thread.sleep(2000);
			safeClick(btnAgregarConcepto);
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteNotaCredito() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[4]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboSucursal);
			safeSelectOptionOnPrimefacesList(comboSucursal,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursal\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboSerie);
				safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
				"//*[@id=\"factura:factPan:0:selectSerie\"]/option[1]")));
				
			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtIva, "16");
			Thread.sleep(1000);
			safeSendKeys(txtCantidad, "2");
			safeSendKeys(txtUnidadMedida, "Cajas");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitario, "20");
			Thread.sleep(1000);
			safeSendKeys(txtConcepto, "PRODUCTO DE PRUEBA");
			Thread.sleep(2000);
			safeClick(btnAgregarConcepto);
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteCartaPorte() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[5]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboSucursal);
			safeSelectOptionOnPrimefacesList(comboSucursal,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursal\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboSerie);
				safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
				"//*[@id=\"factura:factPan:0:selectSerie\"]/option[1]")));

			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtConductor, "Conductor Prueba");
			Thread.sleep(1000);
			safeSendKeys(txtVehiculo, "Camion");
			Thread.sleep(1000);
			safeSendKeys(txtPlacas, "ABC-123");
			Thread.sleep(1000);
			safeSendKeys(txtKilometros, "200");
			Thread.sleep(1000);
			safeSendKeys(txtRemisiones, "2");
			Thread.sleep(1000);

			safeSendKeys(txtIva, "16");
			Thread.sleep(1000);
			safeSendKeys(txtCantidad, "6");
			Thread.sleep(1000);
			safeSendKeys(txtUnidadMedida, "Piezas");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitario, "150");
			Thread.sleep(1000);
			safeSendKeys(txtConcepto, "FLETE");
			Thread.sleep(2000);
			safeClick(btnAgregarConcepto);

			/*Thread.sleep(2000);
			safeClick(btnAddenda);
			waitForWebElementDisplayed(txtNumProv);
			Thread.sleep(1000);
			safeSendKeys(txtNumProv, "1234");
			Thread.sleep(1000);
			safeSendKeys(txtPedido, "10");
			Thread.sleep(1000);
			safeSendKeys(txtPosicion, "3");
			Thread.sleep(1000);
			safeSendKeys(txtEntrada, "5");
			Thread.sleep(1000);
			safeClick(btnAgregarAddenda);*/
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteNomina() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[6]")));

			Thread.sleep(2000);
			safeClick(comboEmisorNomina);
			safeSelectOptionOnPrimefacesList(comboEmisorNomina,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisorNomina\"]/option[2]")));

			/*Thread.sleep(2000);
			safeClick(comboSucursalNomina);
			safeSelectOptionOnPrimefacesList(comboSucursalNomina,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectSucursalNomina\"]/option[2]")));*/

			safeSendKeys(txtDiasPagados, "15");

			safeClick(btnPeriodoIni);
			safeClick(btnDiaIni);

			safeClick(btnPeriodoFin);
			safeClick(btnDiaFin);

			Thread.sleep(2000);
			safeClick(comboMetodoPagoNomina);
			safeSelectOptionOnPrimefacesList(comboMetodoPagoNomina,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPagoNomina\"]/option[5]")));

			safeClick(btnBuscarEmpleado);

			waitForWebElementDisplayed(comboCriterioBusqueda);
			safeClick(comboCriterioBusqueda);
			Thread.sleep(1000);
			safeSelectOptionOnPrimefacesList(comboCriterioBusqueda,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectTipoBusquedaNom\"]/option[2]")));

			waitForWebElementDisplayed(comboDepartamento);
			safeClick(comboDepartamento);
			Thread.sleep(1000);
			safeSelectOptionOnPrimefacesList(comboDepartamento,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectDepartamento\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(btnConsultar);

			waitForWebElementDisplayed(tblEmpleados);
			safeClick(selectEmpleado);
			Thread.sleep(2000);
			safeClick(btnImportar);

			waitForWebElementDisplayed(tblEmpleadosImp);
			safeClick(selectEmpleadoImp);
			Thread.sleep(2000);
			safeClick(btnPerDed);

			waitForWebElementDisplayed(btnPercepciones);
			safeClick(btnPercepciones);

			waitForWebElementDisplayed(comboTipoPercepcion);
			safeClick(comboTipoPercepcion);
			safeSelectOptionOnPrimefacesList(comboTipoPercepcion,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectTipoPerPerEmp\"]/option[2]")));

			Thread.sleep(500);
			safeSendKeys(txtClave, "123");
			safeSendKeys(txtConceptoPercepcion, "SALARIO");
			safeSendKeys(txtImporteGravado, "8000");
			safeSendKeys(txtImporteExento, "2000");
			Thread.sleep(500);
			safeClick(btnAgregarPercepcion);

			Thread.sleep(2000);
			safeClick(btnGenerarComprobanteNomina);

			waitForWebElementDisplayed(btnConfNomina);
			safeClick(btnConfNomina);

			waitForWebElementDisplayed(messageResponseNomina);
			responseMessage = messageResponseNomina.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuestaNomina);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

	public String generarComprobanteReciboArrendamiento() {
		String responseMessage = null;
		try {
			waitForWebElementDisplayed(comboTipo);
			safeClick(comboTipo);
			safeSelectOptionOnPrimefacesList(comboTipo,
					driver.findElement(By.xpath("//*[@id=\"factura:tipoComprobante\"]/option[7]")));

			Thread.sleep(2000);
			safeClick(comboEmisor);
			safeSelectOptionOnPrimefacesList(comboEmisor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectEmisor\"]/option[2]")));

			Thread.sleep(2000);
			safeClick(comboSerie);
			safeSelectOptionOnPrimefacesList(comboSerie, driver.findElement(By.xpath(
					"//*[@id=\"factura:factPan:0:selectSerie\"]/option[" + generateRandomNumberFromAToZ(2, 3) + "]")));

			Thread.sleep(2000);
			safeClick(comboGrupos);
			safeSelectOptionOnPrimefacesList(comboGrupos,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectGrupos\"]/option[3]")));

			Thread.sleep(2000);
			safeClick(comboReceptor);
			safeSelectOptionOnPrimefacesList(comboReceptor,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectReceptor\"]/option[3]")));

			Thread.sleep(2000);
			safeClick(comboMetodoPago);
			safeSelectOptionOnPrimefacesList(comboMetodoPago,
					driver.findElement(By.xpath("//*[@id=\"factura:factPan:0:selectMetodoPago\"]/option[5]")));

			Thread.sleep(2000);
			safeSendKeys(txtIvaArrend, "16");
			Thread.sleep(1000);
			safeSendKeys(txtCantidadArrend, "4");
			Thread.sleep(1000);
			safeSendKeys(txtUnidadMedidaArrend, "Bolsas");
			Thread.sleep(1000);
			safeSendKeys(txtValorUnitarioArrend, "55");
			Thread.sleep(1000);
			safeSendKeys(txtConceptoArrend, "PRODUCTO DE PRUEBA");
			Thread.sleep(1000);
			safeSendKeys(txtCuentaPredial, "0123456789");
			Thread.sleep(2000);
			safeClick(btnAgregarConceptoArrend);
			Thread.sleep(2000);
			safeClick(btnGenerarComprobante);
			waitForWebElementDisplayed(messageResponse);
			responseMessage = messageResponse.getText();
			Thread.sleep(2000);
			safeClick(btnAceptarRespuesta);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("about to send: " + responseMessage);
		return responseMessage;
	}

}

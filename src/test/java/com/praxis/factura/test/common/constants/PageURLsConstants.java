package com.praxis.factura.test.common.constants;

import com.praxis.factura.test.common.SetTestVariables;

public class PageURLsConstants {
	public static final String URL                        		= SetTestVariables.configProp.getProperty("factura.url");
	public static final String URLEXT                      		= SetTestVariables.configProp.getProperty("factura.urlext");
    public static final String LOGIN_PAGE                 		= URL + "corporativos/terpel.jspx";
    public static final String MAIN_PAGE                  		= URL + "jsp/home/home.iface";
    public static final String MAIN_PAGE_RECEPCION         		= URL + "jsp/common/invoiceQueryReceived.iface";
    public static final String MAIN_PAGE_YOFACTURO				= URL + "jsp/yoFacturo/interfazPuntoVenta.iface";
    public static final String GENERAR_COMPROBANTE_PAGE			= URL + "jsp/modDeFactura/nuevoComprobante.iface";
    public static final String IMPORTAR_COMPROBANTE_PAGE		= URL + "jsp/recepcion/importacionComprobantes.iface";
    public static final String CARGA_PUNTO_DE_VENTA_PAGE		= URL + "jsp/yoFacturo/interfazPuntoVenta.iface";
    public static final String GENERAR_USUARIO_PAGE				= URL + "jsp/modDeFactura/nuevoComprobante.iface";
    public static final String REGISTER_PAGE               		= URLEXT + "Bisnet/jsp/common/informationPrices.jspx";
    public static final String REGISTRAR_USUARIO_PAGE			= URLEXT + "Bisnet/jsp/common/informationPrices.jspx";
}

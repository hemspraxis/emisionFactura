package com.praxis.factura.test.dataprovider;

import org.testng.annotations.DataProvider;
import static com.praxis.factura.test.dataprovider.DataProviderReferencesConstants.SIGNONEMISION;
import static com.praxis.factura.test.dataprovider.DataProviderReferencesConstants.SIGNONRECEPCION;
import static com.praxis.factura.test.dataprovider.DataProviderReferencesConstants.SIGNONYOFACTURO;

public class SmokeTestDP {

	@DataProvider(name = SIGNONEMISION)
	public static Object [][] signonEmision() {
		return new Object[][] {
				//{"demotst@praxis.com.mx.8", "123456"}
				{"usuariodemo@bisnet.com.mx.8", "123456"}
		};
	}

	@DataProvider(name = SIGNONRECEPCION)
	public static Object [][] signonRecepcion() {
		return new Object[][] {
				//{"demotst@praxis.com.mx.11", "123456"}
				{"usuariodemo@bisnet.com.mx.11", "123456"}
		};
	}
	
	@DataProvider(name = SIGNONYOFACTURO)
	public static Object [][] signonYoFacturo() {
		return new Object[][] {
				//{"demotst@praxis.com.mx.10", "123456"}
				{"usuariodemo@bisnet.com.mx.10", "123456"}
		};
	}
	
}

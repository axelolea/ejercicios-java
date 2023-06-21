package test;

import ejercicioCuentaAhorro.PlazoFijo;
import ejercicioCuentaAhorro.CajaAhorro;


public class TestCuentaBancaria {

	public static void main(String[] args) {
		var carlos = new PlazoFijo("Carlos", 120.0, 23.0, 11.0);
		var sofia = new CajaAhorro("Sofia", 123.0);
		
		carlos.mostrarInformacion();
		System.out.println("<---------->");
		sofia.mostrarInformacion();
	}

}



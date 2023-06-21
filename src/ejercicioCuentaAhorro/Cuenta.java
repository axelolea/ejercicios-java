package ejercicioCuentaAhorro;

public class Cuenta {

	String titular;
	double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		// TODO Auto-generated constructor stub
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public void mostrarInformacion() {
		System.out.println("Titular: " + this.titular);
		System.out.println("Cantidad: " + this.cantidad);
	}
}

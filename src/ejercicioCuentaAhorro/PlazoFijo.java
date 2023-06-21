package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	double plazo;
	double interes;
	public PlazoFijo(String titular, double cantidad, double plazo, double interes) {
		super(titular, cantidad);
		// TODO Auto-generated constructor stub
		this.plazo = plazo;
		this.interes = interes;
	}
	
	public double importeInteres() {
		return (this.cantidad * this.interes) / 100;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Plazo: " + this.plazo);
		System.out.println("Interes: " + this.interes);
		System.out.println("Total de interes: " + this.importeInteres());
	}

	@Override
	public String toString() {
		return "";
	}
}

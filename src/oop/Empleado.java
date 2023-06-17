package oop;

public class Empleado  extends Persona{

	String numeroDeEmpleado;
	String nss;
	String puesto;
	
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss, String puesto) {
		// TODO Auto-generated constructor stub
		super(nombre, edad, correo, telefono);
		this.numeroDeEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Numero de empleaado: " + this.numeroDeEmpleado);
		System.out.println("NSS: " + this.nss);
		System.out.println("Puesto: " + this.puesto);
	}
	
}

package oop;

public class Persona {
	
	// Propiedades de Persona
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public float conversionDolar(float dolares) {
		float precioDolar = 18.9f;
		float conversion = precioDolar * dolares;
		return conversion;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Correo: " + this.correo);
		System.out.println("Telefono: " + this.telefono);
	}
	
}

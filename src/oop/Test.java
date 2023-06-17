package oop;

public class Test {
	public static void main(String[] args) {
		Persona axel = new Persona("Axel Olea", 21, "contact@axelolea.com", "5612345678");
		Persona jose = new Persona("Jose Maldonado", 29, "contact@jora.com", "5612345678");
		Persona miranda = new Persona("Miranda Torres", 31, "contact@miranda.com", "5612345678");
		Persona cecilia = new Persona("Cecilia Mora", 18, "contact@cecilia.com", "5612345678");
		Persona carlos = new Persona("Carlos Solis", 22, "contact@carlos.com", "5612345678");	
		
		axel.mostrarInformacion();
		jose.mostrarInformacion();
		miranda.mostrarInformacion();
		cecilia.mostrarInformacion();
		carlos.mostrarInformacion();
		
		Empleado evilAxel = new Empleado("Axel Olea", 21, "contact@axelolea.com", "5612345678", "987", "763409234", "Dev Java");
		evilAxel.mostrarInformacion();

	}
}

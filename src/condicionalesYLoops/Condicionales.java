package condicionalesYLoops;

import java.util.Scanner;

public class Condicionales {
	
	public static void main(String[] args) {
		
		double sueldo = 167.8989899d;
		float sueldo2 = 167.8989f;
		int sueldo3 = 167;
		
		byte edad = 18;
		
		System.out.println("La edad es de: " + edad);
		
		System.out.println("Programa para calcular la hora");
		
		byte hora = 13;
		
		if(hora >= 0 && hora <= 24) {
			System.out.println("Buenos dias solecito");
		}
		
		// Scanner
		
		Scanner timeScanner = new Scanner(System.in);
		
		System.out.println("Ingresa una hora en formato 24 horas:");
		
		hora = timeScanner.nextByte();
		
		if(hora >= 0 && hora <= 12) {
			System.out.println("Buenos dias solecito");
		}
		else if(hora > 12 && hora <= 24) {
			System.out.println("Buenas tardes bro");
		}
		else {
			System.out.println("Hora no valida");
		}
		
		timeScanner.close();
	}
	
}

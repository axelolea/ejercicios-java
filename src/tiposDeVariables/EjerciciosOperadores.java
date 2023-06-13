package tiposDeVariables;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		
		// Operadores logicos
		
		// Operador And &&
		// Operador Or  ||
		// Operador Not !
		
		
		int a = 3;
		int b = 5;
		
		System.out.println( a == b && a > b);
		
		int valor = 6;
		
		boolean resultado = valor % 2 == 0;
		
		if(resultado) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		
		
	}

}

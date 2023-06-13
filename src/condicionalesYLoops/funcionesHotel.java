package condicionalesYLoops;

import java.util.Scanner;

public class funcionesHotel {

	public static void main(String[] args) {
		
		// Servicios Adicionales
		System.out.println("<-- Servicios Adicionales -->");
		
		double totalServicio = 123.12d;
		double totalAdicional = 12.12d;
		
		boolean hayServicioAdicional = true;
		
		if (hayServicioAdicional) {
			System.out.println("Usted adquirio servicios adicionales.\n"
					+ "Usted tendra un cargo adicional de $" + totalAdicional);
			totalServicio += totalAdicional;
		}
		else {
			System.out.println("Sin servicios adicionales");
		}
		
		System.out.println("Precio total es de: " + totalServicio);
		
		
		// Temporada (dinamica)
		
		System.out.println("<-- Temporada (Dinamica) -->");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la temporada:\n"
				+ "1.- Primavera\n"
				+ "2.- Verano\n"
				+ "3.- Otoño\n"
				+ "4.- Invierno\n");
		int valorTemporada = scanner.nextInt();
		
		double descuento;
		
		switch (valorTemporada) {
			case 1: {
				descuento = 12;
				break;
			}
			case 2: {
				descuento = 7;
				break;
			}
			case 3: {
				descuento = 15;
				break;
			}
			case 4: {
				descuento = 5;
				break;
			}
			default:
				descuento = 0;
				break;
		}
		
		System.out.println("El descuento es de: " + descuento + "%");
		
		// <-- Check-out Chack-in -->
		
		// Obtengo la hora del CheckIn
		System.out.println("Ingrese el horario del Check-In");
		String checkIn = scanner.next();
		// Obtengo la hora del CheckOut
		System.out.println("Ingrese el horario del Check-Out");
		String checkOut = scanner.next();
		
		System.out.println("El horario del CheckIn: " + checkIn);
		System.out.println("El horario del CheckOut: " + checkOut);
		
		
		
		
		scanner.close();
		
	}
}
